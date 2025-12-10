1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        HashMap<Integer, Integer> nums2Map = new HashMap<>();
4        Stack<Integer> previousGreaterElementStack = new Stack<>();
5
6        for(int index = nums2.length - 1; index >= 0; index--){
7             while(!previousGreaterElementStack.isEmpty() && nums2[index] >= previousGreaterElementStack.peek()){
8                previousGreaterElementStack.pop();
9            }
10            if(!previousGreaterElementStack.isEmpty()){
11                nums2Map.put(nums2[index], previousGreaterElementStack.peek());
12                
13            }
14            previousGreaterElementStack.push(nums2[index]);
15        }
16        for(int index = 0; index < nums1.length; index++){
17            if(nums2Map.containsKey(nums1[index])){
18                nums1[index] = nums2Map.get(nums1[index]);
19            }
20            else{
21                nums1[index] = -1;
22            }
23        }
24        return nums1;
25    }
26    
27}
28