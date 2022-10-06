package task3;

public class Sortable {
    public static void shell_sort(Sortable[] array) {
        int i, j, increment;
        Sortable temp;
        increment = 3;
        while (increment > 0) {
            for (i = 0; i < array.length; i++) {
                j = i;
                temp = array[i];
                while ((j >= increment) && (array[j - increment].compareTo(temp) == 1)) {
                    array[j] = array[j - increment];
                    j = j - increment;
                }
                array[j] = temp;
            }
            if (increment / 2 != 0)
                increment = increment / 2;
            else if (increment == 1)
                increment = 0;
            else
                increment = 1;
        }
    }

    public int compareTo(Sortable other) {
        return 0;
    }
}