class Solution {
    public int reverse(int x) {
        int prevNum=0;
        while(x!=0)
        {
            int currNum=prevNum*10+x%10;
            if((currNum-x%10)/10!=prevNum)
                return 0;
            prevNum=currNum;
            x=x/10;
        }
        return prevNum;
    }
}