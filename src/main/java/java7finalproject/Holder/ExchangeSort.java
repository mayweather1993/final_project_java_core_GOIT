package java7finalproject.Holder;

public class ExchangeSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int i, j, temp;

        for (i = 1; i < array.length - 1; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Override
    public String getName() {
        return "ExchangeSort";
    }
}

