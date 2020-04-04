public class AnimalPark {
    Cage[] cages;
    int amountOfCages;

    public AnimalPark(int maxCages) {
        this.amountOfCages = 0;
        cages = new Cage[maxCages];
    }

    public void addCage(Cage c) {
        if (amountOfCages < cages.length) {
            cages[amountOfCages] = c;
            amountOfCages++;
        } else {
            System.out.println("Zoo has too many cages already! Too crowded for animals");
        }
    }

    public void printAllAnimalNameAndType(){
        for (int i = 0; i < amountOfCages; i++) {
            System.out.println(cages[i].material + " Cages No: " + (i+1));
            for (int j = 0; j < cages[i].amountOfAnimals; j++) {
                System.out.println("Animal Name: " + cages[i].animals[j].getName() + ", Type: "+ cages[i].animals[j].getType());
            }
        }
    }

}