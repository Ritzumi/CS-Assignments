class Cage {
    int length, width, depth;
    String material;
    double latitude, longitude;
    String groundType;
    Animal[] animals;
    int amountOfAnimals;

    /**
     * @return the animals
     */
    public Animal[] getAnimals() {
        return animals;
    }

    /**
     * @return the depth
     */
    public int getDepth() {
        return depth;
    }

    /**
     * @return the groundType
     */
    public String getGroundType() {
        return groundType;
    }

    /**
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * @param groundType the groundType to set
     */
    public void setGroundType(String groundType) {
        this.groundType = groundType;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    public Cage(int capacity) {
        this(0, 0, 0, "Steel", 10.1234, 100.1111, "dirt", capacity);

    }

    public Cage(int length, int width, int depth, String material, double latitude, double longitude, String groundType,
            int capacity) {
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.material = material;
        this.latitude = latitude;
        this.longitude = longitude;
        this.groundType = groundType;
        animals = new Animal[capacity];
        amountOfAnimals = 0;
    }

    public void addAnimal(Animal newAnimal) {
        if (amountOfAnimals < animals.length) {
            animals[amountOfAnimals] = newAnimal;
            amountOfAnimals++;
        } else {
            System.out.println("Cage is full");
        }
    }

    public void printALLAnimals() {
        System.out.println(material + " cage:");
        for (int i = 0; i < amountOfAnimals; i++) {
            System.out.println(animals[i].toString());
        }
    }

}