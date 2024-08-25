package July_24.EX_27072024;

public class ArrayLab12 {
    public static void main(String[] args) {
        // Find the Max in the Arrays
        // Find the Max Salary, Min  in the Salary Array
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        // Infosys - Automation Interview
        int max = salaries[4];
        int min = salaries[3];
        for (int i = 0; i < salaries.length ; i++) {
            if( salaries[i] > max){
                max = salaries[i];
            }
            if(min > salaries[i]){
                min = salaries[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }
    }

