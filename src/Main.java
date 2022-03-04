

public class Main {

    public static void main(String[] args) {
        Coet rocket1 = new Coet("32WESSDS", 3);
        Coet rocket2 = new Coet("LDSfJA32", 6);

        System.out.println("Rocket1: " + rocket1.getCode() + "has: " + rocket1.getNumberOfPropellants() + " Propellants. \n");
        System.out.println("Rocket2: " + rocket2.getCode() + "has: " + rocket2.getNumberOfPropellants() + " Propellants. \n");

    }
}
