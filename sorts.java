import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorts {

    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    public static void main(String[] args) {

        runBubbleSort(10);
        runBubbleSort(100);
        runBubbleSort(1000);
        runBubbleSort(10000);
        runBubbleSort(100000);
        runBubbleSort(1000000);

        runInsertSort(10);
        runInsertSort(100);
        runInsertSort(1000);
        runInsertSort(10000);
        runInsertSort(100000);
        runInsertSort(1000000);

        runSelectionSort(10);
        runSelectionSort(100);
        runSelectionSort(1000);
        runSelectionSort(10000);
        runSelectionSort(100000);
        runSelectionSort(1000000);

        runMergeSort(10);
        runMergeSort(100);
        runMergeSort(1000);
        runMergeSort(10000);
        runMergeSort(100000);
        runMergeSort(1000000);


        runQuickSort(10);
        runQuickSort(100);
        runQuickSort(1000);
        runQuickSort(10000);
        runQuickSort(100000);
        runQuickSort(1000000);

        runRadixSort(10);
        runRadixSort(100);
        runRadixSort(1000);
        runRadixSort(10000);
        runRadixSort(100000);
        runRadixSort(1000000);

        runHeapSort(10);
        runHeapSort(100);
        runHeapSort(1000);
        runHeapSort(10000);
        runHeapSort(100000);
        runHeapSort(1000000);
    }

    private static void runBubbleSort(int x){
        int[] array = new int[x];
        int vuelta = 1;
        long startTime = 0, stopTime = 0, elapsedTime = 0;
        while (vuelta <= 10) {
            fillArray(array);
            startTime = System.nanoTime();
            bubbleSort(array);
            stopTime = System.nanoTime();
            elapsedTime = stopTime - startTime;
            System.out.println("BubbleSort "+x+" Vuelta #" + vuelta + ": " + elapsedTime + "ns");
            vuelta++;
        }
    }


    private static void runInsertSort(int x){
        int[] array = new int[x];
        int vuelta = 1;
        long startTime = 0, stopTime = 0, elapsedTime = 0;
        while (vuelta <= 10) {
            fillArray(array);
            startTime = System.nanoTime();
            insertSort(array);
            stopTime = System.nanoTime();
            elapsedTime = stopTime - startTime;
            System.out.println("InsertSort "+x+" Vuelta #" + vuelta + ": " + elapsedTime + "ns");
            vuelta++;
        }
    }

    private static void runSelectionSort(int x) {
        int[] array = new int[x];
        int vuelta = 1;
        long startTime = 0, stopTime = 0, elapsedTime = 0;
        while (vuelta <= 10) {
            fillArray(array);
            startTime = System.nanoTime();
            selectionSort(array);
            stopTime = System.nanoTime();
            elapsedTime = stopTime - startTime;
            System.out.println("SelectionSort " + x + " Vuelta #" + vuelta + ": " + elapsedTime + "ns");
            vuelta++;
        }
    }

    private static void runMergeSort(int x) {
        int[] array = new int[x];
        int vuelta = 1;
        long startTime = 0, stopTime = 0, elapsedTime = 0;
        while (vuelta <= 10) {
            fillArray(array);
            startTime = System.nanoTime();
            mergeSort(array);
            stopTime = System.nanoTime();
            elapsedTime = stopTime - startTime;
            System.out.println("MergeSort " + x + " Vuelta #" + vuelta + ": " + elapsedTime + "ns");
            vuelta++;
        }
    }

    private static void runQuickSort(int x) {
        int[] array = new int[x];
        int vuelta = 1;
        int low = 0;
        int high = array.length-1;
        long startTime = 0, stopTime = 0, elapsedTime = 0;
        while (vuelta <= 10) {
            fillArray(array);
            startTime = System.nanoTime();
            quickSort(array,low,high);
            stopTime = System.nanoTime();
            elapsedTime = stopTime - startTime;
            System.out.println("QuickSort " + x + " Vuelta #" + vuelta + ": " + elapsedTime + "ns");
            vuelta++;
        }
    }

    private static void runRadixSort(int x) {
        int[] array = new int[x];
        int vuelta = 1;
        long startTime = 0, stopTime = 0, elapsedTime = 0;
        while (vuelta <= 10) {
            fillArray(array);
            startTime = System.nanoTime();
            radixSort(array);
            stopTime = System.nanoTime();
            elapsedTime = stopTime - startTime;
            System.out.println("RadixSort " + x + " Vuelta #" + vuelta + ": " + elapsedTime + "ns");
            vuelta++;
        }
    }

    private static void runHeapSort(int x) {
        int[] array = new int[x];
        int vuelta = 1;
        long startTime = 0, stopTime = 0, elapsedTime = 0;
        while (vuelta <= 10) {
            fillArray(array);
            startTime = System.nanoTime();
            heapSort(array);
            stopTime = System.nanoTime();
            elapsedTime = stopTime - startTime;
            System.out.println("HeapSort " + x + " Vuelta #" + vuelta + ": " + elapsedTime + "ns");
            vuelta++;
        }
    }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("["+array[i]+"]");
        }
    }

    private static void fillArray(int[] array){
        Random rand = new Random();
        int  n = 0;
        for(int i = 0; i < array.length; i++){
            n = rand.nextInt(1000000)+0;
            array[i] = n;
        }
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void insertSort(int[] array){
        int temp;
        for (int i = 1; i < array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] array) {
        int index = 0, smallerNumber = 0;
        for (int i = 0; i < array.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

    private static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        // Split the array in half
        int[] first = new int[array.length / 2];
        int[] second = new int[array.length - first.length];
        System.arraycopy(array, 0, first, 0, first.length);
        System.arraycopy(array, first.length, second, 0, second.length);
        // Sort each half
        mergeSort(first);
        mergeSort(second);
        // Merge the halves together, overwriting the original array
        merge(first, second, array);

    }

    private static void merge(int[] first, int[] second, int[] result) {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
            } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array == null || array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // recursively sort two sub parts
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
    }

    public static void radixSort(int[] input) {
        final int RADIX = 10;
        // declare and initialize bucket[]
        List<Integer>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        // sort
        boolean maxLength = false;
        int tmp = -1, placement = 1;
        while (!maxLength) {
            maxLength = true;
            // split input between lists
            for (Integer i : input) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }
            // empty lists into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }
            // move to next digit
            placement *= RADIX;
        }
    }

    public static void buildheap(int []a){
        n=a.length-1;
        for(int i=n/2;i>=0;i--){
            maxheap(a,i);
        }
    }

    public static void maxheap(int[] a, int i){
        left=2*i;
        right=2*i+1;
        if(left <= n && a[left] > a[i]){
            largest=left;
        }
        else{
            largest=i;
        }

        if(right <= n && a[right] > a[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxheap(a, largest);
        }
    }

    public static void exchange(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void heapSort(int[] a0) {
        a = a0;
        buildheap(a);

        for (int i = n; i > 0; i--) {
            exchange(0, i);
            n = n - 1;
            maxheap(a, 0);
        }
    }
}
