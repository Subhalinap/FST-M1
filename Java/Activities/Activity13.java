package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();
        Random index = new Random();
        System.out.println("Enter the numbers: ");
        while (myObj.hasNextInt())
        {
            number.add(myObj.nextInt());
        }

        Integer nums[] = number.toArray(new Integer[0]);
        int index1 = index.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in array at generated index: " + nums[index1]);

        myObj.close();
    }
}
