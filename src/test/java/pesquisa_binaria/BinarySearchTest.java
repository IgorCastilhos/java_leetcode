package pesquisa_binaria;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void testListIsEmpty() {
        BinarySearch binarySearch = new BinarySearch();
        int[] myList = {4, 3};
        int[] emptyList = {};

        Assert.assertFalse(binarySearch.isListEmpty(myList));
        Assert.assertTrue(binarySearch.isListEmpty(emptyList));
    }

    @Test
    public void testGuessEqualsItem() {
        BinarySearch binarySearch = new BinarySearch();
        int[] myList = {1, 2};
        int guess = 1;

        Assert.assertEquals(true, binarySearch.guessEqualsItem(3, 3));
        Assert.assertEquals(false, binarySearch.guessEqualsItem(1, 3));
    }

    @Test
    public void testGuessIsLessThanItem() {
        BinarySearch binarySearch = new BinarySearch();

        Assert.assertEquals(true, binarySearch.guessLessThanItem(2, 3));
        Assert.assertEquals(false, binarySearch.guessLessThanItem(4, 3));
    }

    @Test
    public void testGuessIsGreaterThanItem() {
        BinarySearch binarySearch = new BinarySearch();

        Assert.assertEquals(true, binarySearch.guessGreaterThanItem(4, 3));
        Assert.assertEquals(false, binarySearch.guessGreaterThanItem(1, 3));
    }

    @Test
    public void testGivenListAndItemReturnIndexOfItem() {
        BinarySearch binarySearch = new BinarySearch();
        int[] testList = {1, 3, 5, 7, 9};

        Assert.assertEquals(1, binarySearch.binarySearch(testList, 3));
        Assert.assertEquals(-1, binarySearch.binarySearch(testList, 33));
    }
}
