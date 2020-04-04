import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D_CubicAnanlysis {
    public static void main(String[] args) throws IOException {
        // Declaration
        FileWriter fw = new FileWriter("File\\3_Cubic.csv");
        BufferedWriter writer = new BufferedWriter(fw);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate, endDate;
        long startEach, endEach;
        long startOperationn, endOperation;
        double length, average = 0;

        // Range
        length = Math.pow(10, 4);
        
        // Execution
        startDate = new Date();
        writer.write("Start date for cubic operation is " + date.format(startDate) + "\n");
        System.out.println("Start date for cubic operation is " + date.format(startDate));
        startEach = System.currentTimeMillis();
        // Execution
        startOperationn = System.currentTimeMillis();
        for (double i = 0; i <= length;) {
            average = 0;
            writer.write(i + ", ");
            for (int j = 0; j < 10; j++) {
                startEach = System.currentTimeMillis();
                cubic(1, i);
                endEach = System.currentTimeMillis();
                writer.write((endEach - startEach) + ", ");
                average += (endEach - startEach);
                writer.flush();
            }
            average /= 10;
            writer.write(average + "");
            writer.newLine();
            i += Math.pow(10, String.valueOf((long) i).length() - 1);
        }
        writer.flush();
        endOperation = System.currentTimeMillis();

        endDate = new Date();
        String finishDay = date.format(endDate);
        System.out.println("End date for cubic operation is " + finishDay);
        writer.write("End date for cubic operation is " + finishDay + "\n");
        System.out.println("This operation take :" + (endOperation - startOperationn) + " milliseconds");
        writer.write("This operation take : " + (endOperation - startOperationn) + " milliseconds" + "\n");
        writer.close();
}

    public static double cubic(double from, double to) {
        double answer = 0;
        for (double i = from; i <= to; i++) {
            for (double j = from; j <= to; j++) {
                for (double j2 = from; j2 <= to; j2++) {
                    answer += i;
                }
            }
        }
        return answer;
    }
}