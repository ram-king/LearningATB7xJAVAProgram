package EX_28072024;

public class OopsLab3 {
    public static void main(String[] args) {
        BuildingBP dlf = new BuildingBP();
        dlf.building_name = "DLF";
        dlf.Builder_name = "DLF Pvt Ltd";
        dlf.building_color = "Blue";
        dlf.no_of_floors = 15;
        System.out.println(dlf.building_name+"\n"+dlf.no_of_floors);
        dlf.parking();
        dlf.lift();
        dlf.club();
    }
}
