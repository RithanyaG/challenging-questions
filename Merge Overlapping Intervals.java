import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedList = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedList.add(currentInterval);

        for (int[] interval : intervals) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) { 
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else { 
                currentInterval = interval;
                mergedList.add(currentInterval);
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        int[][] mergedIntervals = merge(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
