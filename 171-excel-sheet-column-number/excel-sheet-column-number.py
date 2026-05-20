class Solution(object):
    def titleToNumber(self, columnTitle):
        res = 0
        for char in columnTitle:
            res = res * 26 + (ord(char) - 64)
        return res
        