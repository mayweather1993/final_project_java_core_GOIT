package java7finalproject;

import java7finalproject.Holder.Sortable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AppRunner {
    private static final Timer TIMER = new Timer();
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        SortExtractor sortExtractor = new SortExtractor();
        Set<Sortable> sortables = sortExtractor.gettingAllSorts();
        for (Sortable s :
                sortables) {
            testSortingArray(s);
            testArrayWithRandomLastElement(s);
            testFullRandomArray(s);
            testReverseOrderArray(s);
        }
    }

    public static void testSortingArray(Sortable sortable) {
        System.out.println("Starting sorted array test for " + sortable.getName());
        List<Integer> xList = new ArrayList<>();
        List<Long> yList = new ArrayList<>();
        int arraylength = 7;
        for (int i = 1; i < 7; i++) {
            arraylength = arraylength * i;
            TIMER.startTime();
            sortable.sort(ArrayGenerator.fillSortingArray(arraylength));
            long waitingTime = TIMER.getWaitingTime();
            yList.add(waitingTime);
            xList.add(arraylength);
        }
        for (Long y : yList) {
            System.out.println(y);
        }
    }
    public static void testArrayWithRandomLastElement(Sortable sortable) {
        System.out.println("Starting array with last random element test for " + sortable.getName());
        List<Integer> xList = new ArrayList<>();
        List<Long> yList = new ArrayList<>();
        int arraylength = 7;
        for (int i = 1; i < 7; i++) {
            arraylength = arraylength * i;
            TIMER.startTime();
            sortable.sort(ArrayGenerator.fillArrayPlusRandomElementToEnd(arraylength));
            long waitingTime = TIMER.getWaitingTime();
            yList.add(waitingTime);
            xList.add(arraylength);
        }
        for (Long y : yList) {
            System.out.println(y);
        }
    }
    public static void testReverseOrderArray(Sortable sortable) {
        System.out.println("Starting reverse ordered array test for " + sortable.getName());
        List<Integer> xList = new ArrayList<>();
        List<Long> yList = new ArrayList<>();
        int arraylength = 7;
        for (int i = 1; i < 7; i++) {
            arraylength = arraylength * i;
            TIMER.startTime();
            sortable.sort(ArrayGenerator.fillArrayReverseOrder(arraylength));
            long waitingTime = TIMER.getWaitingTime();
            yList.add(waitingTime);
            xList.add(arraylength);
        }
        for (Long y : yList) {
            System.out.println(y);
        }
    }
    public static void testFullRandomArray(Sortable sortable) {
        System.out.println("Starting random array test for " + sortable.getName());
        List<Integer> xList = new ArrayList<>();
        List<Long> yList = new ArrayList<>();
        int arraylength = 7;
        for (int i = 1; i < 7; i++) {
            arraylength = arraylength * i;
            TIMER.startTime();
            sortable.sort(ArrayGenerator.fillRandom(arraylength));
            long waitingTime = TIMER.getWaitingTime();
            yList.add(waitingTime);
            xList.add(arraylength);
        }
        for (Long y : yList) {
            System.out.println(y);
        }
    }
}
