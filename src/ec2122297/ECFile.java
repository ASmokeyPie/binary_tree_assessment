package ec2122297;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class ECFile {
    public ECFile() {

    }


    public int[] loadfile(String filename) {
        File myFile = new File(filename);
        ArrayList<Integer> arrList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(myFile));
            String data;

            while ((data = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(data, ",");
                while (st.hasMoreTokens()) {
                    arrList.add(Integer.parseInt(st.nextToken().trim()));
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        System.out.println(arrList.size() + " numbers loaded");

        // Convert ArrayList to primitive int[]
        int[] result = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            result[i] = arrList.get(i);  // Unboxes Integer to int
        }

        return result;
    }


    public void displayArray(int[] array, String message) {
        System.out.println("\n================================\n");
        System.out.println(message);
        System.out.println("\n================================\n");
        System.out.print("[");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println("]\n");
        System.out.println("\n================================\n");
    }


    public boolean checkOrder(int[] array) {

        for (int k = 0; k < array.length - 1; k++) {
            if (array[k] > array[k + 1]) {
                return false;
            }
        }

        return true;

    }
}