# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        num1 = ""
        num2 = ""

        while l1 is not None:
            num1 += str(l1.val)
            l1 = l1.next
        while l2 is not None:
            num2 += str(l2.val)
            l2 = l2.next
        
        num1 = num1[::-1]
        num2 = num2[::-1]

        number1 = int(num1)
        number2 = int(num2)

        sum_str = str(number1 + number2)
        sum_str = sum_str[::-1]

        sumList = None
        sumHead = None
        
        index = 0
        while index < len(sum_str):
            if sumList is None:
                sumList = ListNode(int(sum_str[index]))
                sumHead = sumList
            else:
                newNode = ListNode(int(sum_str[index]))
                sumList.next = newNode
                sumList = sumList.next
            index += 1
        return sumHead