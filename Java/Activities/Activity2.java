package Activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] num = {10, 77, 10, 54, -11, 10};
        System.out.println("Results:" +valueCheck(num));
    }

    public static boolean valueCheck(int[] numbers) {
        int sum = 0;
        for (int value : numbers) {
            if (value == 10) {
                sum = sum + value;
            }
        }
        if (sum == 30) {
            return true;
        }
        else{
            return false;
        }
    }
}
