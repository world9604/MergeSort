public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{7, 6, 5, 8, 3, 5, 9, 1};
        int length = array.length;
        MergeSort sort = new MergeSort(length);
        sort.mergeSort(array, 0, length - 1);
        for (int value : array) {
            System.out.printf("%d ", value);
        }
    }
}
