package com.mysite;

public class HW_02 {

    public static void main(String[] args) {


/*1. Write a Java program that reads a number in inches, converts it to meters.
                Note: One inch is 0.0254 meter.
                Test Data
        Input a value for inch: 1000
        Expected Output :
        1000.0 inch is 25.4 meters
 */

	float value_inh = 1000.0f;
	float inh_meter = 0.0254f;
        System.out.println(value_inh + " inch is "  + value_inh*inh_meter +" meters");

/*2. Write a Java program to convert minutes into a number of years and days.
Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days
*/

    int value_in_minutes = 3456789;
    int in_days = value_in_minutes/(60*24);
    int in_year = in_days/365;
    int years_days = in_days%365;

    System.out.println(value_in_minutes +" minutes is approximately "
            +in_year + " years" +" and " +years_days + " days");

    /*3. Write a Java program to compute body mass index (BMI).
Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721*/

    int weight_pounds = 452;
    int height_in_inh = 72;
    double pound_in_kg = 0.4535923745;
    double inh_in_meters = 0.0254;
    int sqr=2;
        System.out.println("Body Mass Index is " +(weight_pounds*pound_in_kg)/((Math.pow(height_in_inh*inh_in_meters,sqr))));

/*4. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513*/

    float distance = 2500;
    float hours = 5;
    float minutes = 56;
    float seconds = 23;
    float in_min_sec = 60;
    float meters_km = 1000;

        System.out.println("Your speed in meters/second is " +(distance/((hours*in_min_sec*in_min_sec)+(minutes*in_min_sec)+seconds)));
        System.out.println("Your speed in km/h is " +((distance/meters_km)/(hours+(minutes/in_min_sec)+
                (seconds/in_min_sec/in_min_sec))));


//5. Write a Java program to generate random integers in a specific range.(Hint: Use Math class)


        int minimum = 10;
        int maximum =150;

        System.out.println("random integer = " + ((minimum + (int)(Math.random() * (maximum-minimum)))));
//I don't understand Do we need to include specific max and minimum numbers in range?
// So I did that max number isn't included but min is included in

    }
}



