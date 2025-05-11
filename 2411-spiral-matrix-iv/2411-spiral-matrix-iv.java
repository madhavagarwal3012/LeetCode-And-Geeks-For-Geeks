/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int topLeftToRight = n;
        int topToBottomRight = m - 1;
        int bottomRightToLeft = n - 1;
        int bottomToTopLeft = m - 2;

        int columnRange = n;
        int[][] matrix = new int[m][n];
        int size = 0;

        ListNode tail = head;
        int row = 0;
        int column = 0;
        while(size < m * n){
            for(int topLeft = 1; topLeft <= topLeftToRight; topLeft++){
                if(tail != null){
                    matrix[row][column] = tail.val;
                    tail = tail.next;
                }
                else{
                    matrix[row][column] = -1;
                }
                size++;
                column++;
            }
            topLeftToRight-=2;
            row++;
            column = --columnRange;
            if(size == m * n){
                break;
            }

            for(int topRight = 1; topRight <= topToBottomRight; topRight++){
                if(tail != null){
                    matrix[row][column] = tail.val;
                    tail = tail.next;
                }
                else{
                    matrix[row][column] = -1;
                }
                size++;
                row++;
            }
            topToBottomRight-=2;
            row--;
            column--;
            if(size == m * n){
                break;
            }

            for(int bottomRight = 1; bottomRight <= bottomRightToLeft; bottomRight++){
                if(tail != null){
                    matrix[row][column] = tail.val;
                    tail = tail.next;
                }
                else{
                    matrix[row][column] = -1;
                }
                size++;
                column--;
            }
            bottomRightToLeft-=2;
            row--;
            column++;
            if(size == m * n){
                break;
            }

            for(int bottomLeft = 1; bottomLeft <= bottomToTopLeft; bottomLeft++){
                if(tail != null){
                    matrix[row][column] = tail.val;
                    tail = tail.next;
                }
                else{
                    matrix[row][column] = -1;
                }
                size++;
                row--;
            }
            bottomToTopLeft-=2;
            row++;
            column++;
            if(size == m * n){
                break;
            }
        }
        return matrix;
    }
}