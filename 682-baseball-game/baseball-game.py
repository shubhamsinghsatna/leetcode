class Solution:
    def calPoints(self, ops: List[str]) -> int:
        stack = []
        sum=0
        for i in range(len(ops)):
            if ops[i]=="C":
                stack.pop()
            elif ops[i]=="D":
                stack.append(int(stack[-1])*2)
            elif ops[i]=="+":
                size = len(stack)
                stack.append(int(stack[-1])+int(stack[-2]))
            else:
                stack.append(ops[i])
        for i in range(len(stack)):
            sum+=int(stack[i])
        return sum
        