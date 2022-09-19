class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        for i in range(0, len(s)-1):
            for j in range(1, len(s) - i):
                if  s[i] == s[i+j] and t[i] == t[i+j]:
                    continue
                elif s[i] != s[i+j] and t[i] != t[i+j]:
                    continue
                else:
                    return False
        
        return True
            