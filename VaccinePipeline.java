import java.util.ArrayList;
import java.util.List;
import java.Lang.Math;

public class VaccinePipeline implements Main {

    private List<Vaccine> vaccines = new ArrayList<>();

    public VaccinePipeline() {
    }

    public void createVaccine(String vaccineName, String vaccineType, String vaccineStatus) {
        vaccines.add(new Vaccine(vaccineName, vaccineType, vaccineStatus));
    }

    public void storeVaccine(int vaccineId, Vaccine vaccineData) {
        vaccines.set(vaccineId, vaccineData);
    }

    public Vaccine getVaccine(int vaccineId) {
        return vaccines.get(vaccineId);
    }

    public List<Vaccine> getAllVaccines() {
        return vaccines;
    }

}

class Vaccine {

    private String name;
    private String type;
    private String status;

    public Vaccine(String name, String type, String status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
// Create a new vaccine
VaccinePipeline vaccinePipeline = new VaccinePipeline();
vaccinePipeline.createVaccine("COVID-19 Vaccine", "mRNA", "In Development");

// Store vaccine data
vaccinePipeline.storeVaccine(1, new Vaccine("COVID-19 Vaccine", "mRNA", "In Development", "Phase 3", "95%"));

// Get vaccine information
Vaccine vaccine = vaccinePipeline.getVaccine(1);
System.out.println(vaccine);

}
