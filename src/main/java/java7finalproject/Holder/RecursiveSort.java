package java7finalproject.Holder;

public class RecursiveSort implements Sortable {
    @Override
    public void sort(int[] array) {
        sortArray(array, 0, array.length - 1);
    }

    public void sortArray(int[] array, int start, int end) {
        if (start == end) return;
        int max_index = findMax(array, start, end);
        swap(array, max_index, end);
        sortArray(array, start, end - 1);
    }

    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public int findMax(int[] array, int start, int end) {
        int max = array[start];
        int index = start;
        for (; start <= end; start++)
            if (max < array[start]) {
                max = array[start];
                index = start;
            }
        return index;
    }

    @Override
    public String getName() {
        return "RecursiveSort";
    }
}
