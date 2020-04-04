public class Student {
    int id;
    String name;
    String address;
    String phoneNumber;
    double GPA;

    public Student(int id, String name, String address, String phoneNumber, double GPA) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.GPA = GPA;
    }

    public Student(int id) {
        this.id = id;
        this.name = "";
        this.address = "";
        this.phoneNumber = "";
        this.GPA = 0;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student {" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", address='" + getAddress() + "'"
                + ", phoneNumber='" + getPhoneNumber() + "'" + ", GPA='" + getGPA() + "'" + "}";
    }

}