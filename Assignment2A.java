import java.util.Scanner;
public class Assignment2A {
    public static void main(String[] args){

        int peopleInGroup = 0;
        int groupNumber = 0;
        int modulo = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("How many people are in your group? ");
        peopleInGroup = input.nextInt();

        System.out.println("How many groups do you want: ");
        groupNumber = input.nextInt();
        modulo = peopleInGroup % groupNumber;
        System.out.print("\n");
        System.out.println("If we divide " + peopleInGroup + " people in " + groupNumber + " groups evenly, " + modulo +
                " person/people will be left without a group.");


    }
}
