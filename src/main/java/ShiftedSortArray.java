import java.util.Scanner;

public class ShiftedSortArray {


    public static int getMiddle(int l, int r) {
        return (l + r) / 2;
    }

    public static boolean checkIfPivot(int[] a, int i) {
        return a[i+1] > a[i] && a[i] < a[i-1];
    }

    public static boolean binarySearch(int[] a, int start, int end, int searchElement) {
        int m = getMiddle(start, end);
        if(start < end) {
            if(searchElement < a[m]) {
                return binarySearch(a, start, m, searchElement);
            }
            else if (searchElement > a[m]){
                return binarySearch(a, m + 1, end, searchElement);
            }
            else
                return true;
        }
        else {
            return false;
        }
    }

    public static int findPivotIndex(int[] a, int start, int end) {

        int m = getMiddle(start, end);
        if(a[m] < a[end]) {
            if(checkIfPivot(a, m))
                return m;
            return findPivotIndex(a, start, m);
        }
        else {
            return findPivotIndex(a, m, end);
        }
    }

    public static boolean isElePresentInShiftedArray(int[] a, int size, int searchElement) {

        int pivotIndex = findPivotIndex(a, 0, size -1);
        int pivot = a[pivotIndex];
        int temp = a[size - 1];
        if(searchElement <= temp && searchElement >= pivot) {
            return binarySearch(a, pivotIndex, size, searchElement);
        }
        else {
            return binarySearch(a,  0, pivotIndex, searchElement);
        }
    }

    public static void main(String[] args) {

        int[] array;

        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);

        int size, search;
        size = sc.nextInt();
        array = new int[size];
        System.out.println("Enter the search element");
        search = sc.nextInt();

        for(int i = 0; i < size; i++)
            array[i] = sc.nextInt();

        System.out.println("Pivot Element found " +  isElePresentInShiftedArray(array, size, search));

    }

}
