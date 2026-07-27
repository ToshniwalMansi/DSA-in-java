// Given an array of distinct integers candidates and a target integer tareget , return a list of all unique combinations of candidates where chosen numbers sum to target

import java.util.*;
public class CombinationSum {
  private void findCombination(int index , int[] arr , int target , List<List<Integer>> ans , List<Integer> store){
    if(index == arr.length){
      if(target == 0){
        ans.add(new ArrayList<>(store));
      }
      return;
    }

    if(arr[index] <= target){
      store.add(arr[index]);
      findCombination(index, arr, target - arr[index], ans, store);
      store.remove(store.size()-1);
    }
    findCombination(index + 1, arr, target, ans, store);
  }

  public List<List<Integer>> combinationSum(int[] candidates , int target){
    List<List<Integer>> ans = new ArrayList<>();
    findCombination(0, candidates, target, ans, new ArrayList<>());

    return ans;
  }

  public static void main(String[] args) {
    int[] candidates = {2,3,6,7};
    CombinationSum ans = new CombinationSum() ;
    List<List<Integer>> result = ans.combinationSum(candidates, 7);


    System.out.println("Results are : " + result);
  }
}
