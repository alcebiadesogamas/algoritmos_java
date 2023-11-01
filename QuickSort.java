import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        var vetor = Arrays.asList(9, 1, 4, 2, 5, 7, 3);

        var result = quickSort(vetor);

        result.forEach(e -> System.out.println(e));
    }

    public static List<Integer> quickSort(List<Integer> vetor) {
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
}

