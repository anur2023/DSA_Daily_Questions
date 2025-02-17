class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res = new ArrayList<>();
        fun(candidates, target, 0, new ArrayList<>(),0,res);
        return res;
        
    }
    private void fun(int [] condidates, int target,int idx, List<Integer>comb,int total, List<List<Integer>>res){
        if(total == target){
            res.add(new ArrayList<>(comb));
            return ;
        }
        if(total > target || idx>=condidates.length){
            return;
        }
        comb.add(condidates[idx]);
        fun(condidates,target,idx,comb,total+condidates[idx],res);
        comb.remove(comb.size()-1);
        fun(condidates,target,idx+1,comb,total,res);
    }
}