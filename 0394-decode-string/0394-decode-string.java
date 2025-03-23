import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        StringBuilder dText = new StringBuilder();
        Stack<String> decodingStack = new Stack<>();
        Stack<String> finalDecodedDTextStack = new Stack<>();

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) != ']') {
                decodingStack.push("" + s.charAt(index));
            } else {
                while (!decodingStack.isEmpty() && !decodingStack.peek().equals("[")) {
                    dText.insert(0, decodingStack.pop());
                }

                if (!decodingStack.isEmpty() && decodingStack.peek().equals("[")) {
                    decodingStack.pop();
                }

                StringBuilder numericString = new StringBuilder();
                while (!decodingStack.isEmpty() && Character.isDigit(decodingStack.peek().charAt(0))) {
                    numericString.insert(0, decodingStack.pop());  
                }

                int numeric = numericString.length() > 0 ? Integer.parseInt(numericString.toString()) : 1;
                dText = new StringBuilder(dText.toString().repeat(numeric));  
                decodingStack.push(dText.toString());
                dText.setLength(0);  
            }
        }

        dText.setLength(0);
        while (!decodingStack.isEmpty()) {
            finalDecodedDTextStack.push(decodingStack.pop());
        }
        while (!finalDecodedDTextStack.isEmpty()) {
            dText.append(finalDecodedDTextStack.pop());
        }

        return dText.toString();
    }
}
