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

        int maxArrValue = integerItems.get(0);
        int minArrValue = integerItems.get(0);
        long arrTotalSum = 0;

        for (Integer integer : integerItems) {
            arrTotalSum += integer;

            if (integer >= maxArrValue) maxArrValue = integer;
            if (integer <= minArrValue) minArrValue = integer;
        }

        System.out.println((arrTotalSum - maxArrValue) + " " +  (arrTotalSum - minArrValue));

    }
}
