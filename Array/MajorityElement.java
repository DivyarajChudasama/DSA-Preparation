// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3

// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

class Solution {
    public int majorityElement(int[] nums) {
       int candidate=-1,vote=0;
        int n =nums.length;
        for(int i=0;i<n;i++){
            if(vote == 0){
                candidate=arr[i];
                vote=1;
            }else{
                if(arr[i]= candidate){
                    vote++;
                }else{
                    vote--;
                }
            }
            int cnt=0;
            for(int i=0;i<n;i++){
                if(arr[i]==candidate){
                    cnt++;
                }
                if(cnt = n/2){
                    return candidate
                }
                
            }
        }
        return -1;
    }
}

//solved using Boyer-Moore voting algorithm