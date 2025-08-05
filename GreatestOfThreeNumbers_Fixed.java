// Code for finding the Greatest Of Three Numbers in Java[Hardcoded Values]

public class GreatestOfThreeNumbers_Fixed {
    public static void main(String[] args) {
        int a = 1000, b = 200, c = 100;
        
        if (a > b && a > c){
            System.out.println("Greatest number is: " + a);
        }
        else if (b > a && b > c){
            System.out.println("Greatest number is: " + b);
        }
        else{
            System.out.println("Greatest number is: " + c);
        }
    }
}