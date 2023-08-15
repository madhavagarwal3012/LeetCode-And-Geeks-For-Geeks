class Solution {
    public static String Reversed_String(String str) {
		String reversed_string="";
		int end= str.length()-1;
		    while(end>=0){
		    	reversed_string+=str.charAt(end);
		        end--;
		    }
		        return reversed_string;
	}
	public static boolean isPalindrome(int x) {
        String str= Integer.toString(x);
		String rs=Reversed_String(str);
		int start=0;
		int end=str.length();
		boolean palindrome=false;
		while(start<end) {
			
			if(rs.charAt(start)==str.charAt(start)) {
				palindrome=true;
			}
			else {
				palindrome=false;
				break;
			}
			start++;
		}
		return palindrome;

	}
}