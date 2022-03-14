import java.util.ArrayList;
import java.util.Arrays;


    public class Main {
        public static void main(String[] args) {
            Integer arr1[] = {1, 2, 3, 4, 5};
            String arr2[] = {"A", "B", "C"};
            swap(arr1, 1, 4);
            swap(arr2, 0, 2);
            String[] arrayOfString = {"A", "B", "C", "D"};
            asList(arrayOfString);
        }

        public static void swap(Object[] arr, int n1, int n2) {
            System.out.println(Arrays.toString(arr));
            Object vengefulSpirit = arr[n1];
            arr[n1] = arr[n2];
            arr[n2] = vengefulSpirit;
        }

        public static <T> void asList(T[] arr) {
            ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
            System.out.println(alt);
        }
}
