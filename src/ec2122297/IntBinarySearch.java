package ec2122297;

public class IntBinarySearch {

    public IntBinarySearch() {
    }

    public int binarySearch(int[] array, int target) {
        int position;            // Position of the target
        boolean found;           // To indicate if the target is found
        int first;               // Start index of the array/search space
        int last;                // End index of the array/search space
        int middle;              // Midpoint index
        int count = 0;           // Counter to track the number of data items searched

        first = 0;
        last = array.length - 1;
        position = -1;           // Default position (not found)
        found = false;

        System.out.println("Starting binary search for target: " + target);
        System.out.println("-------------------------------------------");

        while (!found && first <= last) {
            middle = (first + last) / 2; // Calculate the middle index
            count++; // Increment the counter for items searched

            // Print current state of search
            System.out.println("Checking position: " + middle + ", Value: " + array[middle]);
            System.out.println("Current search range: First = " + first + ", Last = " + last);

            if (array[middle] == target) {
                found = true;
                position = middle;
                System.out.println("Target found at position: " + position);
            } else if (array[middle] > target) {
                System.out.println("Moving to the left half of the array.");
                last = middle - 1;
            } else {
                System.out.println("Moving to the right half of the array.");
                first = middle + 1;
            }

            System.out.println("-------------------------------------------");
        }

        // Report results based on whether the target was found
        if (found) {
            System.out.println("Number of data items searched before finding target: " + count);
        } else {
            System.out.println("Target not found.");
            System.out.println("Number of data items searched: " + count);
        }

        return position;
    }
}