import java.util.Arrays;
import java.util.ArrayList;
// can you remember how to set up your main function?
public class ArraysTest {
    public static void main ( String[] args ) {
// declare an array of Strings and print it
        String[] arrayStr = new String[]{"Java", "Node", "Python", "Ruby"};
        System.out.println(Arrays.toString(arrayStr));

//


        //


        //declare an array of integers and print it
        int[] arrayInt = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        System.out.println(Arrays.toString(arrayInt));


        //declare an ArrayList of integers, add numbers to it, and then print it
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        System.out.println(arrL);



        //


    }
}