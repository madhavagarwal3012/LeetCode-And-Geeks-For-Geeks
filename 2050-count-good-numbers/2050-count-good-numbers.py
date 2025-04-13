class Solution:
    def countGoodNumbers(self, n: int) -> int:
        mod = 10**9 + 7
        even_count = n // 2
        odd_count = n - even_count 

        return (pow(5, odd_count, mod) * pow(4, even_count, mod)) % mod