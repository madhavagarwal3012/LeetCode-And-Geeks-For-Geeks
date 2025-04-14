class Solution {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        int index = 0;
        while(index < arr.length - 1){
            if(arr[index] != 0 && queue.isEmpty()){
                index++;
            }
            else if(arr[index] == 0 && queue.isEmpty()){
                queue.add(arr[index + 1]);
                arr[index + 1] = 0;
                index+=2;
            }
            else{
                if(queue.peek() != 0){
                    queue.add(arr[index]);
                    arr[index] = queue.poll();
                    index++;
                }
                else{
                    queue.add(arr[index]);
                    queue.add(arr[index + 1]);
                    arr[index] = 0;
                    arr[index + 1] = 0;
                    queue.poll();
                    index+=2;
                }
            }
        }
        if(!queue.isEmpty() && index == arr.length - 1){
            arr[index] = queue.poll();
        }
    }
}