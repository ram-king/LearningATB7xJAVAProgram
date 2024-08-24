package EX_28072024;

// This class is just a blueprint no memory or execution will happen
// if there is no main function present here
class BuildingBP {
    String building_name;
    String building_color;
    int no_of_floors;
    String Builder_name;

    void parking(){
        System.out.println("Park at your dedicated space");
    }
    void lift(){
        System.out.println("Use Lift");
    }
    void club(){
        System.out.println("Can use club after joining");
    }


    // Main function can write in the same class so execution will start from main function line
    public static void main(String[] args) {
        BuildingBP manson = new BuildingBP();
        manson.parking();
        manson.club();
        manson.lift();
    }
}

