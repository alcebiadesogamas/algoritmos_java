package sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort implements ISort<Integer> {

    public static void main(String[] args) {
        var vetor = Arrays.asList(3, 5, 2, 1, 6, 7, 9, 0, 8);

        new BubbleSort().sort(vetor);
        vetor.forEach(System.out::println);
    }

    @Override
    public void sort(List<Integer> vector) {
        this.bubbleSortAlternative(vector);
    }

    public void bubbleSortAlternative(List<Integer> vector) {

        var size = vector.size();
        for (var i = 0; i < size; ++i) {
            for (var j = 0; j < size - 1 - i; ++j) {
                if (vector.get(j) > vector.get(j + 1)) {
                    var aux = vector.get(j);
                    vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, aux);
                }
            }
        }
    }

    public void bubbleSort(List<Integer> vetor) {
        boolean flag = true;
        while (flag) {
            var current = 0;
            flag = false;
            for (int index = 1; index < vetor.size(); index++) {
                if (vetor.get(index) < vetor.get(current)) {
                    var next = vetor.get(index);
                    vetor.set(index, vetor.get(current));
                    vetor.set(current, next);
                    flag = true;
                }
                current = index;
            }
        }
    }
}
