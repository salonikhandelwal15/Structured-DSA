import java.util.*;

public class LuckyInteger {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        System.out.println(luckyInteger(arr));
    }

    public static int luckyInteger(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        int max = -1;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                max = Math.max(max, entry.getKey());
            }
        }
        return max;
    }
}
