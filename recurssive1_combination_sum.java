// Time Complexity : O(n^m), where n is the length of the candidates array and m in the target (exponential time)
// Space Complexity : O(n^m), where n is the length of the candidates array and m in the target (exponential space)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : correct me on the time and space complexity


// Your code here along with comments explaining your approach

class Solution {
    List<List<Integer>> result;
    int targ;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        targ= target;
        helper(candidates, new ArrayList<>(), 0, 0);
        return result;
    }
    
    private void helper(int[] candidates, List<Integer> temp, int sum, int index){
        //base
        //sad path
        if(sum>targ || index == candidates.length) return;
        //happy path
        if(sum == targ){
            result.add(temp);
            return;
        }
        //logic
        
        //not choose
        //create a new copy of the temp (because though we are not choosing at every level we are creating a new reference of temp)
        helper(candidates, new ArrayList<>(temp), sum, index+1);
            
        //choose 
        //add the current candidate to the temp and create a new copy of temp
        temp.add(candidates[index]);
        helper(candidates, new ArrayList<>(temp), sum+candidates[index], index); 
    }
}