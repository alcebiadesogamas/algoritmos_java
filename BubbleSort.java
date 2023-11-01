import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(String[] args) {
        var vetor = Arrays.asList(3, 5, 2, 1, 6, 7, 9, 0, 8);

        bubbleSort(vetor);
        vetor.forEach(e -> System.out.println(e));
    }

    public static void bubbleSort(List<Integer> vetor) {
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
