package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Exercise: https://www.hackerrank.com/challenges/mini-max-sum/problem
 */

public class MiniMaxSum {

    public static void calculateMinMaxSum() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = new ArrayList<>(
                Stream.of(
                                bufferedReader.readLine()
                                        .replaceAll("\\s+$", "")
                                        .split(" "))
                        .map(Integer::parseInt)
                        .toList());

        bufferedReader.close();


        Collections.sort(arr);

        int maxArrValue = arr.stream().reduce(arr.get(0), Integer::max);

        int minArrValue = arr.stream().reduce(arr.get(0), Integer::min);

        int minSum = arr.stream().reduce(0, Integer::sum) - maxArrValue;
        int maxSum = arr.stream().reduce(0, Integer::sum) - minArrValue;

        System.out.print(minSum);
        System.out.print("  ");
        System.out.print(maxSum);

    }
}
