class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        l = []
        for i in range(len(words)):
            for j in range(i+1,len(words)):
                if(words[i] in words[j]):
                    l.append(words[i])
                if(words[j] in words[i]):
                    l.append(words[j])
        return list(set(l))