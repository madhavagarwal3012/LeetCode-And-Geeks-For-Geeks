class Solution {
    public String simplifyPath(String path) {
        Stack<Character> pathStack = new Stack<>();

        StringBuilder check = new StringBuilder("");
        for(int index = 0; index < path.length(); index++){
            if(path.charAt(index) == '.'){
                check.append(path.charAt(index));
                if(index == path.length() - 1){
                    if(check.length() == 2){
                        if(pathStack.size() > 1){
                            if(pathStack.peek() != '/'){
                                pathStack.push('.');
                                pathStack.push('.');
                                check.setLength(0);
                                continue;
                            }
                            else{
                                pathStack.pop();
                            }
                            while(!pathStack.isEmpty() && pathStack.peek() != '/'){
                                pathStack.pop();
                            }
                        }
                    }
                    else if(pathStack.peek() != '/'){
                        for(int checkCount = 1; checkCount <= check.length(); checkCount++){
                            pathStack.push('.');
                        } 
                    }
                    else if(check.length() > 2){
                        for(int checkCount = 1; checkCount <= check.length(); checkCount++){
                            pathStack.push('.');
                        }  
                    }
                    check.setLength(0);;
                }
            }
            else if(path.charAt(index) == '/' && check.length() > 0 && check.length() < 3){
                check.append(path.charAt(index));
                if(check.toString().equals("../")){
                    if(pathStack.size() > 1){
                        if(pathStack.peek() == '/'){
                            pathStack.pop();
                        }
                        else{
                            pathStack.push('.');
                            pathStack.push('.');
                            pathStack.push('/');
                            check.setLength(0);;
                            continue;
                        }
                    }
                    while(!pathStack.isEmpty() && pathStack.peek() != '/'){
                        pathStack.pop();
                    }
                    check.setLength(0);
                }
                else if(pathStack.peek() != '/'){
                    pathStack.push('.');
                    pathStack.push('/');
                    check.setLength(0);
                }
                else{
                    check.setLength(0);
                }
            }
            else if(check.length() == 1){
                pathStack.push('.');
                pathStack.push(path.charAt(index));
                check.setLength(0);
            }
            else if(check.length() > 0){
                for(int checkCount = 1; checkCount <= check.length(); checkCount++){
                    pathStack.push('.');
                }
                check.setLength(0);
                pathStack.push(path.charAt(index));
            }
            else{
                if(path.charAt(index) == '/' && !pathStack.isEmpty() && pathStack.peek() == '/'){
                    continue;
                }
                else{
                    pathStack.push(path.charAt(index));
                }
            }
        }
        StringBuilder output = new StringBuilder("");
        while(pathStack.size() > 1 && pathStack.peek() == '/'){
            pathStack.pop();
        }
        while(!pathStack.isEmpty()){
            output.append(pathStack.pop());
        }
        return output.reverse().toString();
    }
}