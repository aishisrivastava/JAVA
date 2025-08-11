
// Sum of numbers in array in java

public class SumOfNumbers {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum+=numbers[i];
        }
        System.out.println("Sum of the numbers in the array is: " + sum);

        
    }
}
