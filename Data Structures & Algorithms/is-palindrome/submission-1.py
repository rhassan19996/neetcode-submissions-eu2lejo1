class Solution:
    def isPalindrome(self, s: str) -> bool:
        s= s.lower()
        s = ''.join(char for char in s if char.isalnum())

        left, right = 0, len(s) -1
        for char in s:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True