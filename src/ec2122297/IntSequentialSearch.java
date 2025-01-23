package ec2122297;

public class IntSequentialSearch {

    public IntSequentialSearch() {
    }

    public int search(int[] array, int searchValue) {
        int index;
        int position;
        boolean found;

        index = 0;
        position = -1; // not found
        found = false; // not found

        while (!found && index < array.length) {
            if (array[index] == searchValue) {
                found = true;
                position = index;
            }
            index++;
        }
        return position; // -1 not found
    }
}
