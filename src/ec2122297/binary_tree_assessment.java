package ec2122297;

import java.util.Scanner;

public class binary_tree_assessment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ECFile ecfile = new ECFile();
        int[] binArray1 = ecfile.loadfile("Binsearchone.txt");
        int[] binArray2 = ecfile.loadfile("Binsearchtwo.txt");
        UserChoice userChoice = new UserChoice();

        // Array 1
        boolean array1Sorted = ecfile.checkOrder(binArray1);
        userChoice.menu(binArray1, array1Sorted);


        // Array 2
        boolean array2Sorted = ecfile.checkOrder(binArray2);
        userChoice.menu(binArray2, array2Sorted);

        sc.close();
    }
}
