import java.util.ArrayList;
import java.util.List;

public class Coet {

    private String code;
    private Integer numberOfPropellants;
    private List<Propellant> propellantList = new ArrayList<Propellant>();

    public Coet(String code, Integer numberOfPropellants) {
        this.code = code;
        this.numberOfPropellants = numberOfPropellants;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
