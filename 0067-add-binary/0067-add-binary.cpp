class Solution {
public:
    string addBinary(string number1, string number2) {
        if(number1.size() < number2.size()){
            string temp = number1;
            number1 = number2;
            number2 = temp;
        }
        string sumBinary = "";
        int carry = 0;
        int number2_Index = number2.size() - 1;
        for(int number1_Index = number1.size() - 1; number1_Index >= 0; number1_Index--){
            int number1_Value = int(number1[number1_Index] - '0') + carry;
            int number2_Value = 0;
            if(number1_Value == 2){
                carry = 1;
                number1_Value = 0;
            }
            else{
                carry = 0;
            }
            if(number2_Index >= 0){
                number2_Value = int(number2[number2_Index] - '0');
                number2_Index--;
            }
            if(number1_Value + number2_Value == 2){
                sumBinary += "0";
                carry = 1;
            }
            else{
                sumBinary += to_string(number1_Value + number2_Value);
            }
        }
        if(carry == 1){
        sumBinary += "1";
        }
        return string(sumBinary.rbegin(), sumBinary.rend());
    }
};