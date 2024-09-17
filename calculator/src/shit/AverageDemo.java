package shit;

public class AverageDemo {
    public static void main(String[] args) {
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
            System.out.println("номер такта: " + i + "\nсумма массива: " + result);
        }
       // System.out.println(); //Вместо \n на след sout
        System.out.println("\nCpeднee значение : " + result / nums.length);
    }
}
