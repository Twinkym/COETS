import java.util.ArrayList;
import java.util.List;
public class Rocket {

    protected String code;
    protected Integer numberOfPropellants;
    protected List<Propellant> propellantList = new ArrayList<Propellant>();

    public Rocket(String code, Integer numberOfPropellants) {
        this.code = code;
        this.numberOfPropellants = numberOfPropellants;
    }

    public String getCode() {
        return code;
    }

    public Integer getNumberOfPropellants() {
        return numberOfPropellants;
    }

    public void setNumberOfPropellants(Integer numberOfPropellants) {
        this.numberOfPropellants = numberOfPropellants;
    }

    public List<Propellant> getPropellantsList() {
        return propellantList;
    }

    public void setPropellantsList(List<Propellant> propellantList) {
        this.propellantList = propellantList;
    }


}
