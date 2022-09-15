import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args){

        float keyframe1 = 0;
        float keyframe2 = 0;
        float framesPassed = 0;

        System.out.println("[Lerping!]");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the X coordinate for Keyframe #1: ");
        keyframe1 = input.nextInt();
        System.out.println("Enter the X coordinate for Keyframe #2: ");
        keyframe2 = input.nextInt();
        System.out.println("How many frames have passed? ");
        framesPassed = input.nextInt();
        System.out.print("\n");
        System.out.println("The character has to move " + (keyframe2 - keyframe1) + " pixels in a second.");
        System.out.println("At 30 FPS, their current X position would be " + (keyframe1 + (framesPassed * (keyframe2 - keyframe1) / 30)) + ".");
        System.out.println("At 60 FPS, their current X position would be " + (keyframe1 + (framesPassed * (keyframe2 - keyframe1) / 60)) + ".");



    }
}
