package exercise;

import java.util.Scanner;

public class FindOutTheGreatestNumber {


    public static void main(String[] args) {

        FindOutTheGreatestNumber.getGreaterNumber();
        System.out.println("************second approach *********************");
        FindOutTheGreatestNumber.checkGreatestNumber();
        System.out.println("*************** Using scanner 1 *************************");
        FindOutTheGreatestNumber.theGreatestNumber();
        System.out.println("*************** Using scanner 2 *************************");
        FindOutTheGreatestNumber.findTheGreatestNumber();

    }

    // first approach
    public  static void getGreaterNumber() {
        int num1 = 35;
        int num2 = 78;
        int num3 = 87;
        if(num1>=num2 && num1>=num3)
            System.out.println("The greatest number is : "+num1);
        else if(num2>=num1 && num2>=num3)
            System.out.println("The greatest number is : "+num2);
        else
            System.out.println("The greatest number is : "+num3);
    }


    // second approach

    public static void checkGreatestNumber(){
        int maxVal = 0;
        int val1 = 35;
        int val2 = 78;
        int val3 = 87;
        if (val1 > val2 && val1 > val3) {
            maxVal = val1;
        } else if (val2 > val1 && val2 > val3) {
            maxVal = val2;
        } else if (val3 > val1 && val3 > val2) {
            maxVal = val3;
        }
        System.out.println("Greatest Number is :"+maxVal);

    }

    // third approach using scanner

    public static void theGreatestNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        if (num1 > num2) if (num1 > num3)
            System.out.println("The greatest number is : " + num1);
        if (num2 > num1) if (num2 > num3)
            System.out.println("The greatest number is : " + num2);
        if (num3 > num1) if (num3 > num2)
            System.out.println("The greatest number is : " + num3);
    }

    // fourth approach using scanner too

    public static void findTheGreatestNumber() {
        int maxValue=0;
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the 1st number");
        int num1 = in.nextInt();
        System.out.println(" enter the 2nd number");
        int num2 = in.nextInt();
        System.out.println(" enter the 3rd number");
        int num3 = in.nextInt();

        if (num1>num2 && num1>num3 ) {
            maxValue=num1;
        } else if (num2>num1 && num2>num3 ) {
            maxValue=num2;
        }  else if (num3>num1 && num3>num2 ) {
            maxValue=num3;
        }

        System.out.println("the greatest number is : "+maxValue);

    }






}
