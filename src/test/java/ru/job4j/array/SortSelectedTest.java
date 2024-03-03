package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSortDataLength5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortDataLength3() {
        int[] data = new int[] {12, 7, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 7, 12};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortDataLength9() {
        int[] data = new int[] {12, 7, 3, 18, 4, 7, 5, 2, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4, 5, 7, 7, 9, 12, 18};
        assertThat(result).containsExactly(expected);
    }
}