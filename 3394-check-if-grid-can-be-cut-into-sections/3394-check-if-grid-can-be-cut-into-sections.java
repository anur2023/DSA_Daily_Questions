class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int l = rectangles.length;
        int[][] hor = new int[l][2], ver = new int[l][2];
        
        for(int i = 0; i < l; i ++) {
            hor[i][0] = rectangles[i][0];
            hor[i][1] = rectangles[i][2];
            ver[i][0] = rectangles[i][1];
            ver[i][1] = rectangles[i][3];
        }

        Arrays.sort(hor, (a, b) -> a[0] - b[0]);
        Arrays.sort(ver, (a, b) -> a[0] - b[0]);

        return findCuts(hor) || findCuts(ver);
    }

    private boolean findCuts(int[][] arr) {
        int count = 0, end = 1;

        for(int[] cur : arr) {
            if(cur[0] >= end) {
                count++;
            }
            end = Math.max(end, cur[1]);

            if(count >= 2) {
                return true;
            }
        }

        return false;
    }
}