class Solution {
    public int[] sumZero(int n) {
        
        int[] ans = new int[n];
        int a=1;
        int index = 0;
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                ans[index++] = a;
                ans[index++] = a*-1; 
                a++;
            }
        }else{
            ans[index++] = 0;
            for(int i=0;i<n/2;i++){
                ans[index++] = a;
                ans[index++] = a*-1; 
                a++;
            }
        }
        return ans;
    }
}