class Solution {
    public static String Reversed_String(String str) {
        String reversed_string = "";
        int end = str.length() - 1;
        while (end >= 0) {
            reversed_string += str.charAt(end);
            end--;
        }
        return reversed_string;
    }

    public String addStrings(String num1, String num2) {
        String output = "";
        int start = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        int remainder = 0;

        int k = 0;
        if (num1.length() > num2.length()) {
            k = num1.length();
        } else {
            k = num2.length();
        }

        while (start <= k) {
            if (i >= 0 && j >= 0) {
                int sum = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(j)) + carry;
                carry = sum / 10;
                remainder = sum % 10;

                output += remainder;
                i--;
                j--;
            } else {
                break;
            }
            start++;
        }

        while (i >= 0) {
            int sum = Character.getNumericValue(num1.charAt(i)) + carry;
            carry = sum / 10;
            remainder = sum % 10;

            output += remainder;
            i--;
            start++;
        }

        while (j >= 0) {
            int sum = Character.getNumericValue(num2.charAt(j)) + carry;
            carry = sum / 10;
            remainder = sum % 10;

            output += remainder;
            j--;
            start++;
        }

        while (start == k && carry > 0) {
            output += carry;
            start++;
        }
        output = Reversed_String(output);
        return output;
    }
}
