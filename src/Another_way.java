import java.util.Scanner;

public class Another_way {
    public static void main(String args[]) {

/*3. Write a Java program to compute body mass index (BMI).
Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weight_pounds = sc.nextDouble();
        System.out.print("\nInput height in inches: ");
        double height_in_inh = sc.nextDouble();
        double pound_in_kg = 0.4535923745;
        double inh_in_meters = 0.0254;
        int sqr=2;
        System.out.println("Body Mass Index is " +(weight_pounds*pound_in_kg)/((Math.pow(height_in_inh*inh_in_meters,sqr))));

//5. Write a Java program to generate random integers in a specific range.(Hint: Use Math class)

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Input minimum number: ");
        int minimum = sc1.nextInt();
        System.out.print("Input maximum  number: ");
        int maximum = sc1.nextInt();
        System.out.println("random integer = " + ((minimum + (int)(Math.random() * (maximum-minimum)))));



    }
}