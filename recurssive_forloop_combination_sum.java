// Time Complexity : O O(n^m), where n is the length of the candidates array and m in the target (exponential time)
// Space Complexity : O(n^m), where n is the length of the candidates array and m in the target (exponential space - recursive stack)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : correct me on the time and space complexity

// Your code here along with comments explaining your approach

class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        
        backtrack(candidates, target, new ArrayList<>(), 0, 0);
        return result;
    }
    
     private void backtrack(int[] candidates, int target, List<Integer>temp, int sum, int index){
         //base
         if(sum > target) return;
         if(sum == target){
             result.add(temp);
             return;
         }
         //logic
         for(int i=index; i<candidates.length; i++){
             //action
             List<Integer> temp1 = new ArrayList<>(temp);
             temp1.add(candidates[i]);
             //recurssion
             backtrack(candidates, target, temp1, sum+candidates[i], i);
             //backtrack
         }
     }
}