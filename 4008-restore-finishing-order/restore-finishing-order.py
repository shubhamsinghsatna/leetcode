class Solution:
    def recoverOrder(self, order: List[int], friends: List[int]) -> List[int]:
        ans = [0] * len(friends)
        k=0
        for i in range(len(order)):
            for j in range(len(friends)):
                if order[i]==friends[j]:
                    ans[k]=order[i]
                    k+=1
                j+=1
            i+=1
        return ans

        