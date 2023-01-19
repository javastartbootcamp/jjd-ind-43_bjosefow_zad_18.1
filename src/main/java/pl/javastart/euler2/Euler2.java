package pl.javastart.euler2;

import java.util.ArrayList;
import java.util.List;

public class Euler2 {

    public static void main(String[] args) {
        int sum = calculateSum(4_000_000);
        System.out.println(sum);
    }

    public static int calculateSum(int limit) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        int sum = 2;
        for (int i = 0; list.get(i) + list.get(i + 1) <= limit; i++) {
            int next = list.get(i) + list.get(i + 1);
            list.add(next);
            if (next % 2 == 0) {
                sum += next;
            }
        }
        return sum;
    }
}
