import java.util.*;

class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {

        final long MOD = 1_000_000_007;

        // 1. Add boundary fences
        List<Integer> h = new ArrayList<>();
        List<Integer> v = new ArrayList<>();

        h.add(1);
        h.add(m);
        v.add(1);
        v.add(n);

        for (int x : hFences) h.add(x);
        for (int x : vFences) v.add(x);

        // 2. Sort fence positions
        Collections.sort(h);
        Collections.sort(v);

        // 3. Store all possible horizontal distances
        Set<Integer> heightSet = new HashSet<>();
        for (int i = 0; i < h.size(); i++) {
            for (int j = i + 1; j < h.size(); j++) {
                heightSet.add(h.get(j) - h.get(i));
            }
        }

        // 4. Find maximum square side
        long maxSide = -1;
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                int width = v.get(j) - v.get(i);
                if (heightSet.contains(width)) {
                    maxSide = Math.max(maxSide, width);
                }
            }
        }

        // 5. Return result
        if (maxSide == -1) return -1;
        return (int) ((maxSide * maxSide) % MOD);
    }
}
