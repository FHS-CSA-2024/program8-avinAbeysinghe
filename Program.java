import java.util.Scanner;
import java.lang.Math;

public class Program{

    public static int max(int a, int b){
        int maximum;
        if(a < b){
            maximum = -Math.abs(a - b) - a + 2*b;
            return maximum;
        } else {
            maximum = -Math.abs(a - b) - b + 2*a;
            return maximum;
        }
    }
    public static int min(int a, int b){
        int minimum;
        if(a < b){
            minimum = Math.abs(a - b) - b + 2*a;
            return minimum;
        } else {
            minimum = Math.abs(a - b) - a + 2*b;
            return minimum;
        }
    }
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter number 1:");
        int value1 = reader.nextInt();
        System.out.println("Enter number 2:");
        int value2 = reader.nextInt();

        System.out.println("Sum = " + Math.addExact(value1, value2));
        System.out.println("Difference = " + Math.subtractExact(value1, value2));
        System.out.println("Product = " + Math.multiplyExact(value1, value2));
        System.out.println("Average = " + ((double)value1 + value2)/2);
        System.out.println("Absolute Value: " + Math.abs(value1-value2));
        System.out.println("Maximum = " + max(value1, value2));
        System.out.println("Minimum= " + min(value1, value2));
    }
}

//Paste console output below:
/*
Enter number 1:
20
Enter number 2:
13
Sum = 33
Difference = 7
Product = 260
Average = 16.5
Absolute Value: 7
Maximum = 20
Minimum= 13

== CHECKING INVERSE ==

Enter number 1:
13
Enter number 2:
20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute Value: 7
Maximum = 20
Minimum= 13
*/

//formula for max: -Math.abs(value1 - value2) - value1 + 2*value2
//formula for min: Math.abs(value1 - value2) - value2 + 2*value1
