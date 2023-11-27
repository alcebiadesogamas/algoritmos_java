package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort implements ISort<Integer> {

    public static void main(String[] args) {
        var vector = Arrays.asList(9, 1, 4, 2, 5, 7, 3);

        var q = new QuickSort();
        q.sort(vector);
    }

    public List<Integer> quickSort(List<Integer> vetor) {
        if (vetor.size() <= 1) {
            return vetor;
        }

        var pivot = vetor.get(0);
        var less = new ArrayList<Integer>();
        var greater = new ArrayList<Integer>();

        for (var valor : vetor) {
            if (vetor.indexOf(valor) == 0)
                continue;
            if (valor <= pivot) {
                less.add(valor);
            } else {
                greater.add(valor);
            }
        }

        var result = new ArrayList<Integer>();
        result.addAll(quickSort(less));
        result.add(pivot);
        result.addAll(quickSort(greater));
        return result;
    }

    @Override
    public void sort(List<Integer> vector) {
        vector = quickSort(vector);
        vector.forEach(System.out::println);
    }
}
