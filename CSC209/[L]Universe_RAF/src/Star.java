import java.util.Vector;

class Star {
    private int STAR_number;
    private boolean STAR_hasLight;
    private Vector<String> STAR_material;
    private double STAR_age;
    private double STAR_diameter;
    private double STAR_Temperature_MAX, STAR_Temperature_MIN;

    public Star(int STAR_number, boolean STAR_hasLight, double STAR_age, double STAR_diameter,
            double STAR_Temperature_MAX, double STAR_Temperature_MIN) {
        this.STAR_number = STAR_number;
        this.STAR_hasLight = STAR_hasLight;
        this.STAR_age = STAR_age;
        this.STAR_diameter = STAR_diameter;
        this.STAR_Temperature_MAX = STAR_Temperature_MAX;
        this.STAR_Temperature_MIN = STAR_Temperature_MIN;
        STAR_material = new Vector<>(10);
    }

    public Star() {
        this(0, false, 1000000, 20000, 100, 0);
    }

    public int get_STAR_number() {
        return this.STAR_number;
    }

    public void set_STAR_number(int STAR_number) {
        this.STAR_number = STAR_number;
    }

    public boolean get_STAR_hasLight() {
        return this.STAR_hasLight;
    }

    public void set_STAR_hasLight(boolean STAR_hasLight) {
        this.STAR_hasLight = STAR_hasLight;
    }

    public double get_STAR_age() {
        return this.STAR_age;
    }

    public void set_STAR_age(double STAR_age) {
        this.STAR_age = STAR_age;
    }

    public double get_STAR_diameter() {
        return this.STAR_diameter;
    }

    public void set_STAR_diameter(double STAR_diameter) {
        this.STAR_diameter = STAR_diameter;
    }

    public double get_STAR_Temperature_MAX() {
        return this.STAR_Temperature_MAX;
    }

    public void set_STAR_Temperature_MAX(double STAR_Temperature_MAX) {
        this.STAR_Temperature_MAX = STAR_Temperature_MAX;
    }

    public double get_STAR_Temperature_MIN() {
        return this.STAR_Temperature_MIN;
    }

    public void set_STAR_Temperature_MIN(double STAR_Temperature_MIN) {
        this.STAR_Temperature_MIN = STAR_Temperature_MIN;
    }

    public void add_Material(String m){
        STAR_material.add(m);
    }

    public String get_STAR_material(int i){
        return STAR_material.get(i);
    }

    public String get_AllSTAR_material() {
        String temp = "";
        for (String string : STAR_material) {
            temp += string+", ";
        }
        return temp.substring(0, temp.length()-2);
    }

    public double get_STAR_volume(){
        return (4/3)*Math.PI*Math.pow(STAR_diameter/2, 3);
    }

    public void set_STAR_material(Vector<String> STAR_material) {
        this.STAR_material = STAR_material;
    }


    public Vector<String> getSTAR_material() {
        return this.STAR_material;
    }
    

    public String toString() {
        return "{" +
            " STAR_number='" + get_STAR_number() + "'" +
            ", STAR_hasLight='" + get_STAR_hasLight() + "'" +
            ", STAR_material='" + get_AllSTAR_material() + "'" +
            ", STAR_age='" + get_STAR_age() + "'" +
            ", STAR_diameter='" + get_STAR_diameter() + "'" +
            ", STAR_Temperature_MAX='" + get_STAR_Temperature_MAX() + "'" +
            ", STAR_Temperature_MIN='" + get_STAR_Temperature_MIN() + "'" +
            " }";
    }



}