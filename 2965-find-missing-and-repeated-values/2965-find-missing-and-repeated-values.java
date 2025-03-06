class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int [] arr = new int[grid.length*grid.length];
        int index = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid.length;j++){
                arr[index++] = grid[i][j];
            }
        }
        int dup = -1;
        Arrays.sort(arr);
        int sum = 0;
        sum = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]-arr[i+1]!=0){
            sum += arr[i+1];
            }
            else if (arr[i]-arr[i+1]==0){
                dup = arr[i];
                // sum += dup;
            }
        }
        int total = (arr.length * (arr.length+1))/2;
        return new int [] {dup,total-sum};
    }
}