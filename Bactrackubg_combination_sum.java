// Time Complexity : O(n^m), where n is the length of the candidates array and m in the target (exponential time)
// Space Complexity : O(m), where m is the target (recursive stack space)
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
             result.add(new ArrayList<>(temp));
             return;
         }
         //logic
         for(int i=index; i<candidates.length; i++){
             //action
             //List<Integer> temp1 = new ArrayList<>(temp);
             temp.add(candidates[i]);
             //recurssion
             backtrack(candidates, target, temp, sum+candidates[i], i);
             //backtrack
             temp.remove(temp.size()-1);
         }
     }
}