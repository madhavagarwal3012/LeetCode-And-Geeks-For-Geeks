class Solution {
    public int countCollisions(String directions) {
        Stack<Character> carDirectionStack = new Stack<>();
        int collisionSum = 0;
        
        for(int index = 0; index < directions.length(); index++){
            if(!carDirectionStack.isEmpty()){
                if(carDirectionStack.peek() == 'R' && directions.charAt(index) == 'L'){
                    collisionSum += 2;
                    carDirectionStack.pop();
                    while(!carDirectionStack.isEmpty() && carDirectionStack.peek() == 'R'){
                        carDirectionStack.pop();
                        collisionSum += 1;
                    }
                    carDirectionStack.push('S');
                }
                else if(carDirectionStack.peek() == 'R' && directions.charAt(index) == 'S'){
                    collisionSum += 1;
                    carDirectionStack.pop();
                    while(!carDirectionStack.isEmpty() && carDirectionStack.peek() == 'R'){
                        carDirectionStack.pop();
                        collisionSum += 1;
                    }
                    carDirectionStack.push('S');
                }
                else if(carDirectionStack.peek() == 'S' && directions.charAt(index) == 'L'){
                    collisionSum += 1;
                    carDirectionStack.push('S');
                }
                else{
                    carDirectionStack.push(directions.charAt(index));
                } 
            }
            else{
                carDirectionStack.push(directions.charAt(index));
            } 
        }
        return collisionSum;
    }
}