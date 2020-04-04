public class Zoo {


    public static void main(String[] args) {
        Animal a1 = new Animal("Jimmy", 5, "Grey", "Rhino", 'M');
        Animal a2 = new Animal("Tommy", 10, "Black", "Seal", 'M');
        Animal a3 = new Animal("Opal", 7, "Orange", "Tiger", 'F');
        System.out.println(a3.getName() + " " + a3.getType());
        a1.setType("Bear");
        a1.setColor("pink");
        System.out.println(a1.toString());
        Cage c1 = new Cage(20);
        c1.addAnimal(a1);
        c1.addAnimal(a2);
        c1.printALLAnimals();
        c1.addAnimal(a3);
        c1.printALLAnimals();
        System.out.println(c1.animals[1].getName());
        System.out.println();
        AnimalPark ap = new AnimalPark(10);
        ap.addCage(c1);
        Animal a4 = new Animal("Jack", 10, "Blue","Parrot", 'F');
        Animal a5 = new Animal("Bill", 10, "Red","Parrot", 'F');
        Cage c2 = new Cage(5);
        c2.addAnimal(a4); c2.addAnimal(a5);
        ap.addCage(c2);
        ap.printAllAnimalNameAndType();
    }
}