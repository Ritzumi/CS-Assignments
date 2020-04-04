public class UniverseDriver{
    public static void main(String[] args) {
        Star Earth = new Star(3, false, 4000000000.0, 20000, 100, 0);
        System.out.println(Earth.get_STAR_volume());
        Earth.add_Material("Nitrogen");
        Earth.add_Material("Water");
        Earth.add_Material("Carbon");
        System.out.println(Earth.get_STAR_material(1));
        System.out.println(Earth.get_AllSTAR_material());
        Star Venus = new Star(2, false, 3000000000.0, 15000, 300, 100);
        Star Sun = new Star(0, true, 100000000000.0, 60000, 30000, 15000);
        Sun.add_Material("Hydrogen");
        Sun.add_Material("Helium");
        Sun.add_Material("Oxygen");
        Venus.add_Material("Iron");
        Venus.add_Material("Captain Marvel");
        //System.out.println(Venus.toString());
        System.out.println();
        Universe sol =  new Universe();
        sol.addStar(Sun);
        sol.addStar(Venus);
        sol.addStar(Earth);
        sol.printAllStars();
        sol.readStarFromFile(0);
        System.out.println("Diameter Test");
        System.out.println(sol.getDiameter(1));
    }
}