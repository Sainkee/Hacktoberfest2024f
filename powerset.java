
import java.util.ArrayList;
import java.util.List;

public class powerset {

    public static void main(String[] args) {
        int in[] = { 1, 2, 2 };

        List<List<Integer>> res = printAllSubsets(in, 0);

        for (List<Integer> subset : res) {
            System.out.print(subset + " ");
        }

    }

    public static List<List<Integer>> printAllSubsets(int arr[], int index) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {

                start = end + 1;
            }
            end = res.size()-1;
            for (int j = start; j <= end; j++) {
                List<Integer> newSet = new ArrayList<>(res.get(j));
                newSet.add(arr[i]);
                res.add(newSet);

            }

        }
        return res;
    }
}
