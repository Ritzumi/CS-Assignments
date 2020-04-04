import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;

public class Universe {
    Vector<Star> starList;
    final String Universefile = "File\\universe.data";

    public Universe() {
        starList = new Vector<>(10, 5); // initial, increment
    }

    public void addStar(Star s) {
        starList.add(s);
        this.addStarToFile(s);
    }

    public Star getStar(int i) {
        return starList.get(i);
    }

    public void printAllStars() {
        for (Star star : starList) {
            System.out.println(star.toString());
        }
    }

    public void addStarToFile(Star s) {
        try {
            RandomAccessFile raf = new RandomAccessFile(Universefile, "rw");
            // starnumber (4 bytes) + hasLight (1 byte)
            // material (20*10 bytes) + age (8 bytes) + diameter(8 bytes)
            // maxTemp (8 bytes) + minTemp (8 bytes)
            // Total = 237 bytes
            raf.seek(raf.length());
            raf.writeInt(s.get_STAR_number());
            raf.writeBoolean(s.get_STAR_hasLight());
            for (String str : s.getSTAR_material()) {
                byte[] materialInByte;
                materialInByte = str.concat("                                    ").getBytes();
                raf.write(materialInByte, 0, 20);
            }
            for (int i = s.getSTAR_material().size(); i < 10; i++) {
                byte[] emptyMaterialByte; // don't need new bytes
                emptyMaterialByte = "                                              ".getBytes();
                raf.write(emptyMaterialByte, 0, 20);
            }
            raf.writeDouble(s.get_STAR_age());
            raf.writeDouble(s.get_STAR_diameter());
            raf.writeDouble(s.get_STAR_Temperature_MAX());
            raf.writeDouble(s.get_STAR_Temperature_MIN());
            raf.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void readStarFromFile(int i){
        try {
            RandomAccessFile raf = new RandomAccessFile(Universefile, "r");
            //Jump
            int I_location = 237*i;
            raf.seek(I_location);
            int starNum = raf.readInt();
            System.out.print(starNum);
            boolean light = raf.readBoolean();
            System.out.print(light? " Haslight" : " No light");
            for (int j = 0; j < 10; j++) {
                byte[] material  = new byte[20];
                raf.read(material, 0, 20);
                String str = new String(material).trim();
                if(str.length() > 0){
                    System.out.print(" " + str);
                }
            }
            double age = raf.readDouble();
            double diameter = raf.readDouble();
            double maxTemp = raf.readDouble();
            double minTemp = raf.readDouble();
            System.out.println(" "+ age + " " + diameter + " " + maxTemp + " " + minTemp);
            raf.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    public double getDiameter(int i){
        double diameter = 0;
        try {
            RandomAccessFile raf = new RandomAccessFile(Universefile, "r");
            raf.seek(i*237+233);
            diameter = raf.readDouble();
            raf.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return diameter; 
    }
}