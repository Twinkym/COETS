public class Propellant {

    private Integer maxPower;
    private Integer currentPower;
    private boolean available = false;

    public Propellant(Integer maxPower, Integer currentPower) {
        this.maxPower = maxPower;
        this.currentPower = currentPower;
    }

    public Integer getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(Integer maxPower) {
        this.maxPower = maxPower;
    }

    public Integer getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(Integer currentPower) {
        this.currentPower = currentPower;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
