import java.util.Scanner;

public class Greatest{

    public static void main(String[] args){



         Scanner input = new Scanner(System.in);

         System.out.print("Enter first integer: ");
          int number1 = input.nextInt();

        System.out.print("Enter first integer: ");
         int number2 = input.nextInt();

        System.out.print("Enter first integer: ");
         int number3 = input.nextInt();

        if (number1 > number2 && number1 > number3){
          System.out.printf("The greatest number from the three input is: %d",number1);
        } else if(number2 > number1 && number2 > number3) {
          System.out.printf("The greatest number from the three input is: %d",number2);
        } else {
          System.out.printf("The greatest number from the three input is: %d",number3);
        }
         input.close();

    }
}