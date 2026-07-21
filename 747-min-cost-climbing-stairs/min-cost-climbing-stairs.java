class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int p2 = cost[0];
        int p1 = cost[1];
        for(int i=2;i<cost.length;i++) {
            int curr = cost[i] + Math.min(p1, p2);
            p2=p1;
            p1=curr;
        }
        return Math.min(p1,p2);
        
    }
}