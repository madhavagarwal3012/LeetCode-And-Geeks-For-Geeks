class Solution:
    def sumOfNumberAndReverse(self, num: int) -> bool:
        number = 0
        while(number <= num):
            number = str(number)
            reversedNumber = number[::-1]

            if(int(number) + int(reversedNumber) == num):
                return True;
            
            number = int(number)
            number+=1

        return False