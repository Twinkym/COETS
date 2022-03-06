
public class SpeedUpControl extends Propellant{

    private Propellant p;
    private String propellantName;
    protected Propellant propulsor;
    Integer power_target;

    SpeedUpControl(String name, Propellant prop, Integer target) {
        propellantName = name;
        propulsor = prop;
        power_target = target;

    }
    public void active() {
            System.out.println("Active propellant: " + propellantName);
            try {
                if (propulsor.getCurrentPower() <= power_target) {
                    for (int i = propulsor.getCurrentPower(); i <= power_target; i++) {
                        if (i == propulsor.getMaxPower()) {
                            propulsor.setCurrentPower(i);
                            System.out.println("The propulsor " + propellantName + " Has reach his max power." + propulsor.getCurrentPower() + "\n");
                        break;
                        } else {
                            propulsor.setCurrentPower(i);
                            System.out.println("The propulsor " + propellantName + " has a current power of: " + propulsor.getCurrentPower() + "\n");
                        }
                        Propellant.sleep(50);
                    }
                }
                else {
                    for (int i = propulsor.getCurrentPower(); i >= power_target; i--) {
                        if (i == 0) {
                            propulsor.setCurrentPower(i);
                            System.out.println("The propulsor " + propellantName + " has successfully stopped. " + "\n");
                            break;
                        } else {
                            propulsor.setCurrentPower(i);
                            System.out.println("The propulsor " + propellantName + " has a current power of: " + propulsor.getCurrentPower() + "\n");
                        }
                        Propellant.sleep(50);
                    }
                }

            } catch (InterruptedException e) {
                System.out.println("Propellant: " + propellantName + " interrupted.");
            }
            System.out.println("Propellant: " + propellantName + " exiting.");
        }
    }

    public void start() {
        System.out.println("Starting: " + propellantName);
        if (p == null) {
            p = new Propellant(this, propellantName);
            p.start();
        }
    }
}
