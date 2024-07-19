#@madhavagarwal3012

class Solution:
    num_list = ["Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen ", "Twenty ", "Twenty One ", "Twenty Two ", "Twenty Three ", "Twenty Four ", "Twenty Five ", "Twenty Six ", "Twenty Seven ", "Twenty Eight ", "Twenty Nine ", "Thirty ", "Thirty One ", "Thirty Two ", "Thirty Three ", "Thirty Four ", "Thirty Five ", "Thirty Six ", "Thirty Seven ", "Thirty Eight ", "Thirty Nine ", "Forty ", "Forty One ", "Forty Two ", "Forty Three ", "Forty Four ", "Forty Five ", "Forty Six ", "Forty Seven ", "Forty Eight ", "Forty Nine ", "Fifty ", "Fifty One ", "Fifty Two ", "Fifty Three ", "Fifty Four ", "Fifty Five ", "Fifty Six ", "Fifty Seven ", "Fifty Eight ", "Fifty Nine ", "Sixty ", "Sixty One ", "Sixty Two ", "Sixty Three ", "Sixty Four ", "Sixty Five ", "Sixty Six ", "Sixty Seven ", "Sixty Eight ", "Sixty Nine ", "Seventy ", "Seventy One ", "Seventy Two ", "Seventy Three ", "Seventy Four ", "Seventy Five ", "Seventy Six ", "Seventy Seven ", "Seventy Eight ", "Seventy Nine ", "Eighty ", "Eighty One ", "Eighty Two ", "Eighty Three ", "Eighty Four ", "Eighty Five ", "Eighty Six ", "Eighty Seven ", "Eighty Eight ", "Eighty Nine ", "Ninety ", "Ninety One ", "Ninety Two ", "Ninety Three ", "Ninety Four ", "Ninety Five ", "Ninety Six ", "Ninety Seven ", "Ninety Eight ", "Ninety Nine ", "Hundred ", "Thousand ", "Million ", "Billion "]

    def length1(self, numberinWords, number, index = 0):
        index = int(number[index])

        numberinWords += self.num_list[index]
        return numberinWords

    def length2(self, numberinWords, number, index = 0):
        
        if(number[index] == "0" and number[index + 1] == "0"):
            return numberinWords

        elif(number[index] == "0" and number[index + 1] != "0"):
            numberinWords = self.length1(numberinWords, number, index + 1)
            return numberinWords

        else:
            tenthPlace = number[index] + number[index + 1]
            twoDigit = int(tenthPlace)
            numberinWords += self.num_list[twoDigit]
            return numberinWords

    def length3(self, numberinWords, number, index = 0):
        
        if(number[index] == "0" and number[index + 1] != "0"):
            numberinWords = self.length2(numberinWords, number, index + 1)
            return numberinWords

        elif(number[index] == "0" and number[index + 1] == "0" and number[index + 2] != "0"):
            numberinWords = self.length1(numberinWords, number, index + 2)
            return numberinWords

        else:
            hundredPlace = number[index]
            threeDigit = int(hundredPlace)

            numberinWords += self.num_list[threeDigit]
            numberinWords += self.num_list[100]
            numberinWords = self.length2(numberinWords, number, index + 1)

            return numberinWords
    
    def length4(self, numberinWords, number, index = 0):
        
        thousandPlace = number[index]
        fourDigit = int(thousandPlace)

        numberinWords += self.num_list[fourDigit]
        numberinWords += self.num_list[101]

        if number[index + 1] == "0":
            numberinWords = self.length2(numberinWords, number, index + 2)
        else:
            numberinWords = self.length3(numberinWords, number, index + 1)

        return numberinWords
    
    def length5(self, numberinWords, number, index = 0):
        
        fifthPlace = number[index] + number[index + 1]
        fiveDigit = int(fifthPlace)

        numberinWords += self.num_list[fiveDigit]
        numberinWords += self.num_list[101]
        if(number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0"):
            return numberinWords
        
        elif(number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] != "0"):
            numberinWords = self.length1(numberinWords, number, index + 4)
            return numberinWords

        elif(number[index + 2] != "0"):
            numberinWords = self.length3(numberinWords, number, index + 2)
            return numberinWords

        elif(number[index + 2] == "0" and number[index + 3] != "0"):
            numberinWords = self.length2(numberinWords, number, index + 3)
            return numberinWords
    
    def length6(self, numberinWords, number, index = 0):
        numberinWords = self.length3(numberinWords, number, index)
        numberinWords += self.num_list[101]

        if(number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0"):
            return numberinWords
        
        elif(number[index + 3] != "0"):
            numberinWords = self.length3(numberinWords, number, index + 3)
            return numberinWords
        
        elif(number[index + 4] != "0"):
            numberinWords = self.length2(numberinWords, number, index + 4)
            return numberinWords
        
        elif(number[index + 5] != "0"):
            numberinWords = self.length1(numberinWords, number, index + 5)
            return numberinWords
    
    def length7(self, numberinWords, number, index = 0):
        numberinWords = self.num_list[int(number[index])]
        numberinWords += self.num_list[102]

        if(number[index + 1] != "0"):
            numberinWords = self.length6(numberinWords, number, index + 1)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] != "0"):
            numberinWords = self.length5(numberinWords, number, index + 2)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] != "0"):
            numberinWords = self.length4(numberinWords, number, index + 3)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] != "0"):
            numberinWords = self.length3(numberinWords, number, index + 4)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0"):
            numberinWords = self.length2(numberinWords, number, index + 5)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0" and number[index + 6] == "0"):
            return numberinWords
        
    def length8(self, numberinWords, number, index = 0):
        numberinWords = self.num_list[int(number[index] + number[index + 1])]
        numberinWords += self.num_list[102]

        if(number[index + 2] != "0"):
            numberinWords = self.length6(numberinWords, number, index + 2)
            return numberinWords
        
        elif(number[index + 2] == "0" and number[index + 3] != "0"):
            numberinWords = self.length5(numberinWords, number, index + 3)
            return numberinWords
        
        elif(number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] != "0"):
            numberinWords = self.length4(numberinWords, number, index + 4)
            return numberinWords
        
        elif(number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] != "0"):
            numberinWords = self.length3(numberinWords, number, index + 5)
            return numberinWords
        
        elif(number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0"):
            numberinWords = self.length2(numberinWords, number, index + 6)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0" and number[index + 6] == "0" and number[index + 7] == "0"):
            return numberinWords
    
    def length9(self, numberinWords, number, index = 0):
        numberinWords = self.num_list[int(number[index])]
        numberinWords += self.num_list[100]

        if(number[index + 1] != "0"):
            numberinWords += self.length8(numberinWords, number, index + 1)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] != "0"):
            numberinWords += self.length7(numberinWords, number, index + 2)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] != "0"):
            numberinWords += self.num_list[102]
            numberinWords = self.length6(numberinWords, number, index + 3)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] != "0"):
            numberinWords += self.num_list[102]
            numberinWords = self.length5(numberinWords, number, index + 4)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] != "0"):
            numberinWords += self.num_list[102]
            numberinWords = self.length4(numberinWords, number, index + 5)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0" and number[index + 6] != "0"):
            numberinWords += self.num_list[102]
            numberinWords = self.length3(numberinWords, number, index + 6)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0" and number[index + 6] == "0"):
            numberinWords += self.num_list[102]
            numberinWords = self.length2(numberinWords, number, index + 7)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0" and number[index + 6] == "0" and number[index + 7] == "0" and number[index + 8] == "0"):
            numberinWords += self.num_list[102]
            return numberinWords
    
    def length10(self, numberinWords, number, index = 0):
        numberinWords = self.num_list[int(number[index])]
        numberinWords += self.num_list[103]

        if(number[index + 1] != "0"):
            numberinWords += self.length9(numberinWords, number, index + 1)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] != "0"):
            numberinWords += self.length8(numberinWords, number, index + 2)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] != "0"):
            numberinWords += self.length7(numberinWords, number, index + 3)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] != "0"):
            numberinWords = self.length6(numberinWords, number, index + 4)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] != "0"):
            numberinWords = self.length5(numberinWords, number, index + 5)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0" and number[index + 6] != "0"):
            numberinWords = self.length4(numberinWords, number, index + 6)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0" and number[index + 6] == "0" and number[index + 7] != "0"):
            numberinWords = self.length3(numberinWords, number, index + 7)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0" and number[index + 6] == "0" and number[index + 7] == "0"):
            numberinWords = self.length2(numberinWords, number, index + 8)
            return numberinWords
        
        elif(number[index + 1] == "0" and number[index + 2] == "0" and number[index + 3] == "0" and number[index + 4] == "0" and number[index + 5] == "0" and number[index + 6] == "0" and number[index + 7] == "0" and number[index + 8] == "0"):
            return numberinWords

    def numberToWords(self, num: int) -> str:
        number = str(num)
        if(len(number) == 1):
            return self.length1("", number).strip()
        
        elif(len(number) == 2):
            return self.length2("", number).strip()
        
        elif(len(number) == 3):
            return self.length3("", number).strip()
        
        elif(len(number) == 4):
            return self.length4("", number).strip()
        
        elif(len(number) == 5):
            return self.length5("", number).strip()
        
        elif(len(number) == 6):
            return self.length6("", number).strip()
        
        elif(len(number) == 7):
            return self.length7("", number).strip()
        
        elif(len(number) == 8):
            return self.length8("", number).strip()
        
        elif(len(number) == 9):
            return self.length9("", number).strip()
        
        elif(len(number) == 10):
            return self.length10("", number).strip()

#@madhavagarwal3012