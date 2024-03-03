package lab3.src.problem2;

import java.util.ArrayList;

public class Building {
    int buildingCode;
    float maintenanceCost;
    private ArrayList<Apartment> apartments;

    public Building(int code, float maintenanceCost) {
        this.buildingCode = code;
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<>();
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public float calcProfits() {
        float total = 0;
        for (Apartment apartment : apartments) {
            total += apartment.getPrice();
        }
        return total - maintenanceCost;
    }

    public int getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(int buildingCode) {
        this.buildingCode = buildingCode;
    }

    public float getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(float maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingCode='" + buildingCode + '\'' +
                ", maintenanceCost=" + maintenanceCost +
                ", profile=" + this.calcProfits() +
                '}';
    }
}
