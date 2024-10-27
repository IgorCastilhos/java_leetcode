package pesquisa_binaria;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myList = {83, 48, 38, 93};
        System.out.println(binarySearch(myList, 93));
        System.out.println(binarySearch(myList, 12));
    }

    public static int binarySearch(int[] list, int item) {
        if (isListEmpty(list)) {
            return -1;
        }
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guessEqualsItem(guess, item)) {
                return mid;
            } else if (guessGreaterThanItem(guess, item)) {
                high = mid - 1;
            } else if (guessLessThanItem(guess, item)) {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static boolean isListEmpty(int[] list) {
        return list == null || list.length == 0;
    }

    public static boolean guessEqualsItem(int guess, int item) {
        return guess == item;
    }

    public static boolean guessGreaterThanItem(int guess, int item) {
        return guess > item;
    }

    public static boolean guessLessThanItem(int guess, int item) {
        return guess < item;
    }
}
