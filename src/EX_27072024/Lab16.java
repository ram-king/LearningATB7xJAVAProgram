package EX_27072024;

public class Lab16 {
    public static void main(String[] args) {
        String[][] array_2d = {
                {"A", "B", "*"},
                {"C", "D", "*"},
                {"E", "F", "*"},
                {"G", "H", "*"}
        };

        int row = array_2d.length;
        for (int i = 0; i < row; i++) { // Row  0,1
            for (int j = 0; j < array_2d[i].length; j++) { // Column , 0,1,2
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
