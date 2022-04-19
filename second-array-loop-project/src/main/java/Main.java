import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println("input: " + Arrays.toString(numbers));


        int[] inverted = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            //inverted[i] = numbers[numbers.length-1-i];
            /*Raymond's answer:
            int index = numbers.length -1;
            inverted[i] = numbers[index - i ];*/
        }
        //numbers = inverted;
        System.out.println("output: " + Arrays.toString(inverted));

    }
}
