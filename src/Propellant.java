public class Propellant {

    protected Integer maxPower;
    protected Integer currentPower;
    private boolean available = false;

    public Propellant(Integer maxPower, Integer currentPower) {
        this.maxPower = maxPower;
        this.currentPower = currentPower;
    }

    public Propellant() {
    }

    public Integer getMaxPower() {
        return maxPower;
    }

    public Integer getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(Integer currentPower) {
        this.currentPower = currentPower;
    }
}
