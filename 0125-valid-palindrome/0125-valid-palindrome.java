class Solution {
    public static String Reversed_String(String str) {
		String reversed_string="";
		int end= str.length()-1;
		    while(end>=0){
                if((int)(str.charAt(end))>=48 &&(int)(str.charAt(end))<=57){
		    	    reversed_string+=str.charAt(end);
		            end--;
		        }
                else if((int)(str.charAt(end))>=65 && (int)(str.charAt(end))<=90){
		    	    reversed_string+=str.charAt(end);
		            end--; 
                }
                else if((int)(str.charAt(end))>=97 && (int)(str.charAt(end))<=122){
		    	    reversed_string+=str.charAt(end);
		            end--; 
                }
                else{
                    end--;
                    continue;
                }
                
		    }
		    return reversed_string;
	}
    public boolean isPalindrome(String str) {
        String rs=Reversed_String(str.toLowerCase());
        str=Reversed_String(rs);
        if(rs.length()==0){
            return true;
        }
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