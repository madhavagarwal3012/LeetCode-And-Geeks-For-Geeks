import sys
class Solution:
    def trailingZeroes(self, n: int) -> int:
        index = 0
        trailingZero = 0
        factorial = 1
        fact = ""
        limit = 4300
        while(n >= 1):
            factorial = factorial * n
            n-=1
        while True:
            try:
                fact  = str(factorial)
                break
            except ValueError:
                limit = limit * 2
                sys.set_int_max_str_digits(limit)
        while(index < len(fact)):
            if(fact[index]== '0'):
                trailingZero+=1;
            elif(trailingZero > 0 and fact[index] != '0'):
                trailingZero = 0;
            
            index+=1
        return trailingZero;
        