package lab3.src.problem2;

public class LandlordInfo {
    private Building[] buildings;

    public LandlordInfo() {}

    public float calcProfits() {
        float total = 0;
        for (Building building : buildings) {
            total += building.calcProfits();
        }

        return total;
    }

    public void addBuilding(Building building) {
        if (buildings == null) {
            buildings = new Building[1];
            buildings[0]  = building;
        } else {
            Building[] newBuildings = new Building[buildings.length + 1];
            for (int i = 0; i < buildings.length; i++) {
                newBuildings[i] = buildings[i];
            }
        }
    }

    public Building[] getBuildings() {
        return buildings;
    }
}
