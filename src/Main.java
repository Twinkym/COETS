import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Rocket rocket1 = new Rocket("32WESSDS", 3);
        List<Propellant> propellants_rocket1 = new ArrayList<Propellant>();
        Propellant rocket1Propellant1 = new Propellant(10,0);
        Propellant rocket1Propellant2 = new Propellant(30,0);
        Propellant rocket1Propellant3 = new Propellant(80,0);

        propellants_rocket1.add(rocket1Propellant1);
        propellants_rocket1.add(rocket1Propellant2);
        propellants_rocket1.add(rocket1Propellant3);


        Rocket rocket2 = new Rocket("LDSfJA32", 6);
        List<Propellant> propellants_rocket2 = new ArrayList<Propellant>();

        Propellant rocket2Propellant1 = new Propellant(30,0);
        Propellant rocket2Propellant2 = new Propellant(40,0);
        Propellant rocket2Propellant3 = new Propellant(50,0);
        Propellant rocket2Propellant4 = new Propellant(50,0);
        Propellant rocket2Propellant5 = new Propellant(30,0);
        Propellant rocket2Propellant6 = new Propellant(10,0);
        propellants_rocket2.add(rocket2Propellant1);
        propellants_rocket2.add(rocket2Propellant2);
        propellants_rocket2.add(rocket2Propellant3);
        propellants_rocket2.add(rocket2Propellant4);
        propellants_rocket2.add(rocket2Propellant5);
        propellants_rocket2.add(rocket2Propellant6);


        System.out.println("Rocket1: " + rocket1.getCode() + "has: " + rocket1.getNumberOfPropellants() + " Propellants. \n");
        for (int i = 0; i <propellants_rocket1.size() ; i++) {
            System.out.println(propellants_rocket1.get(i).getMaxPower());
        }
        System.out.println("Rocket2: " + rocket2.getCode() + "has: " + rocket2.getNumberOfPropellants() + " Propellants. \n");
        for (int i = 0; i <propellants_rocket2.size() ; i++) {
            System.out.println(propellants_rocket2.get(i).getMaxPower());
        }

        SpeedUpControl R1P1, R1P2;

        R1P1 = new SpeedUpControl("Rocket1 - Propellant1 " ,propellants_rocket1.get(0), 10);
        R1P1.start();


        R1P2 = new SpeedUpControl("Rocket1 - Propellant 2: ", propellants_rocket1.get(1), 10);
        R1P2.start();
    }
}
