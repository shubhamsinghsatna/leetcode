class Solution{
    public int minPartitions(String n){
        int a = 0;
        for(int i=0; i<n.length(); i++){
            int x = n.charAt(i)-'0';
            a = Math.max(a, x);
        }
        return a;
    }
}