package ec2122297;

import java.util.Arrays;
import java.util.Scanner;

public class UserChoice {

    public UserChoice() {
    }

    public void menu(int[] array, boolean sorted) {

        Scanner sc = new Scanner(System.in);
        IntBinarySearch intBS = new IntBinarySearch();
        IntSequentialSearch intLS = new IntSequentialSearch();

        if (sorted) {
            System.out.println("Array is sorted.");
            System.out.print("Please enter a number to search for: ");

            int number = sc.nextInt();
            int position = intBS.binarySearch(array, number);

            if (position == -1) {
                System.out.println("The number " + number + " does not exist in the array\n");
            } else {
                System.out.println("The number " + number + " found at position " + position + "\n");
            }
        } else {
            System.out.println("Array IS NOT sorted.\n\n");

            System.out.println("Press '1' to Linear Search");
            System.out.println("Press '2' to Sort and Binary Search");

            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Please enter a number to search for: ");

                int number = sc.nextInt();
                int position = intLS.search(array, number);
                if (position == -1) {
                    System.out.println("The number " + number + " does not exist in the array\n");
                } else {
                    System.out.println("The number " + number + " found at position " + position + "\n");
                }
                break;
            case 2:
                Arrays.sort(array);

                System.out.print("Please enter a number to search for: ");

                int number2 = sc.nextInt();
                int position2 = intBS.binarySearch(array, number2);
                if (position2 == -1) {
                    System.out.println("The number " + number2 + " does not exist in the array\n");
                } else {
                    System.out.println("The number " + number2 + " found at position " + position2 + "\n");
                }
                break;
            default:
                break;
            }
        }
    }
}
