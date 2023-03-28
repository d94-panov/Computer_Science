package lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlgoTest {

    @Test
    @DisplayName("list size comparison")
    void listSizeComparison() {
        String[] res = ListCompression.algo().split(" ");
        assertTrue(Integer.parseInt(res[res.length - 1]) <= 164, "compressed array at least size of the original array");
    }

    @Test
    @DisplayName("zero size array test")
    void zeroSizeArrayTest() {
        List<String> arr = Arrays.asList();
        assertTrue(ListCompression.bytesCompressed(arr) > 0, "array is not zero size");
    }

    @Test
    @DisplayName("max size array test")
    void maxSizeArrayTest() {
        List<String> arr = Arrays.asList("Hello", "world", "qwer", "asdf", "zxcv", "reproduce", "compressed", "original", "crossover", "Tournament",
                "Hello", "world", "qwer", "asdf", "zxcv", "reproduce", "compressed", "original", "crossover", "Tournament",
                "Hello", "world", "qwer", "asdf", "zxcv", "reproduce", "compressed", "original", "crossover", "Tournament",
                "Hello", "world", "qwer", "asdf", "zxcv", "reproduce", "compressed", "original", "crossover", "Tournament",
                "Hello", "world", "qwer", "asdf", "zxcv", "reproduce", "compressed", "original", "crossover", "Tournament",
                "Hello", "world", "qwer", "asdf", "zxcv", "reproduce", "compressed", "original", "crossover", "Tournament",
                "Hello", "world", "qwer", "asdf", "zxcv", "reproduce", "compressed", "original", "crossover", "Tournament",
                "Hello", "world", "qwer", "asdf", "zxcv", "reproduce", "compressed", "original", "crossover", "Tournament",
                "Hello", "world", "qwer", "asdf", "zxcv", "reproduce", "compressed", "original", "crossover", "Tournament",
                "Hello", "world", "qwer", "asdf", "zxcv", "reproduce", "compressed", "original", "crossover", "Tournament");
        assertTrue(ListCompression.bytesCompressed(arr) > 0, "array is not zero size");
    }

    @Test
    @DisplayName("middle size array test")
    void middleSizeArrayTest() {
        List<String> arr = Arrays.asList("Michael",
                "Sarah", "Joshua", "Narine", "David", "Sajid", "Melanie", "Daniel",
                "Wei", "Dean", "Brian", "Murat", "Lisa");
        assertTrue(ListCompression.bytesCompressed(arr) > 0, "array is not zero size");
    }

    @Test
    @DisplayName("fitness less or equal than 1")
    void testFitness() {
        List<String> arr = Arrays.asList("Michael",
                "Sarah", "Joshua", "Narine", "David", "Sajid", "Melanie", "Daniel",
                "Wei", "Dean", "Brian", "Murat", "Lisa");
        ListCompression listCompression = new ListCompression(arr);
        assertTrue(listCompression.fitness() <= 1.0 , "fitness less or equal than 1");
    }
}
