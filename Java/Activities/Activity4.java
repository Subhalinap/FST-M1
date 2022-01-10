package Activities;
import java.util.Arrays;
public class Activity4 {

    public static void main(String[] args)
    {
        int[] unsortedNum = {4,3,2,10,12,1,5,6};

        System.out.println(Arrays.toString(unsortedNum));
        int size = unsortedNum.length;

        for (int i = 1; i < size; i++) {
            int key = unsortedNum[i];
            int j = i - 1;

            while (j >= 0 && key < unsortedNum[j]) {
                unsortedNum[j + 1] = unsortedNum[j];
                --j;
            }
            unsortedNum[j + 1] = key;
        }

        System.out.println(Arrays.toString(unsortedNum));
    }
}
