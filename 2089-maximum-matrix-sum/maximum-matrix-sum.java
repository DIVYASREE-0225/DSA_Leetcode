class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long res = 0;
        int min = Integer.MAX_VALUE;
        int neg = 0;
        for(int[] row : matrix) {
            for(int v : row) {
                if(v < 0) neg++;
                v = Math.abs(v);
                res += v;
                min = Math.min(min, v);
            }
        }
        if(neg % 2 == 1) {
            res -= 2L * min;
        }
        return res;
        
    }
}