import java.util.Scanner;

/* Write a Java program that accepts a number followed by one space and then a letter.
If the letter following the number is ‘f’ or ‘F’, the program is to treat the number entered as a temperature in degrees Fahrenheit,
convert the number to the equivalent degrees in Celsius, and print the result.
If the letter following the number is ‘c’ or ‘C’, the program is to treat the number as a temperature in degrees Celsius,
convert the number to its equivalent degrees on Fahrenheit, and print the result.
Note that C = 5/9 (F - 32)
 */
public class converter {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double ctF, fTc, input;
        String degrees;
        System.out.print("Input a number followed by one space and then a letter ('F' or 'C') ");
        input =(int) kb.nextDouble();


        degrees = kb.next();


        if (degrees.equalsIgnoreCase("c")) {
            fTc = 1.8 * input + 32;
            System.out.println(  "F  " + fTc);
        }
        else if (degrees.equalsIgnoreCase("f")) {
            ctF = (input - 32)/1.8;
        System.out.println( "C  " + ctF);
        }
        else
        System.out.println("invalid");
        



    }
}
