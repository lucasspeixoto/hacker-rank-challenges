package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Exercise: https://www.hackerrank.com/challenges/mini-max-sum/problem
 */

public class MiniMaxSum {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> integerItems = new ArrayList<>(
                Stream.of(
                                bufferedReader.readLine()
                                        .replaceAll("\\s+$", "")
                                        .split(" "))
                        .map(Integer::parseInt)
                        .toList());

        bufferedReader.close();

        int maxArrValue = 0;
        int minArrValue = 0;
        int arrTotalSum = 0;

        for (Integer integer : integerItems) {
            arrTotalSum += integer;

            if (integer > maxArrValue) {
                maxArrValue = integer;
            } else if (integer < minArrValue) {
                minArrValue = integer;
            }
        }

        System.out.print(arrTotalSum - maxArrValue);
        System.out.print(" ");
        System.out.print(arrTotalSum - minArrValue);

        /*

        int maxArrValue = arr.stream().reduce(arr.get(0), Integer::max);

        int minArrValue = arr.stream().reduce(arr.get(0), Integer::min);

        int minSum = arr.stream().reduce(0, Integer::sum) - maxArrValue;

        int maxSum = arr.stream().reduce(0, Integer::sum) - minArrValue;

        System.out.print(minSum);
        System.out.print("  ");
        System.out.print(maxSum);


         */

    }
}
