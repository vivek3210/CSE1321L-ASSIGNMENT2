import java.util.Scanner;
public class Assignment2C {
    public static void main(String[] args){
        int dollarAmount;
        final float britishPoundConversion = (float) .85;
        final float bisonDollarConversion = (float) 5;
        float britishPoundAmount = 0;
        float bisonDollarAmount = 0;

        System.out.println("[Bisonica Currency Exchange]");
        System.out.println("General Bison welcomes you to Pax Bisonica!");
        System.out.print("\n");

        Scanner input = new Scanner(System.in);
        System.out.println("How many US Dollars do you have? ");
        dollarAmount = input.nextInt();

        System.out.print("\n");

        britishPoundAmount = dollarAmount * britishPoundConversion;
        bisonDollarAmount = britishPoundAmount / bisonDollarConversion;
        System.out.println(dollarAmount + " US Dollar(s) is " + britishPoundAmount + " British Pound(s),");
        System.out.printf("which is worth %.2f",bisonDollarAmount);
        System.out.print(" Bison Dollar(s)!");




    }
}
