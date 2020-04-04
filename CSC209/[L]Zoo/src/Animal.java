class Animal {

    String name;
    int age;
    String color;
    String type;
    char sex;

    public Animal() { // constructor
        this("no name", 1, "white", "deer", 'M');
    }

    public Animal(String name, int age, String color, String type, char sex) {
        this.name = name;
        this.age = age;
        this.type = type;
        setColor(color);
        this.sex = sex;

    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (type.equalsIgnoreCase("bear")) {
            if (color.equalsIgnoreCase("White") || color.equalsIgnoreCase("Brown") || color.equalsIgnoreCase("Black")) {
                this.color = color;
            } else
                System.out.println("This is not the color of bear!");
        } else {
            this.color = color;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex == 'M' || sex == 'F')
            this.sex = sex;
    }

    public String toString() {
        return "Animal{" + " Name = " + name + ", Age = " + age + ", Type = " + type + ", Color = " + color + ", Sex = "
                + sex + "}";
    }

}