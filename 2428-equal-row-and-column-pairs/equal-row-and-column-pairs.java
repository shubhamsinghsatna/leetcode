class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int i=0,j=0,k,c=0;
        while(i<n)
        { int v=0;
           if(j==n)
           { j=0;i++;}
           if(i==n)
           return c;
           for(k=0;k<n;k++)
           {
               if(grid[k][i]!=grid[j][k])
               break;
                //System.out.println(grid[k][i]+" "+grid[j][k]);
           }
           //System.out.println(i+" "+j);
           if(k==n)
           c++;
           j++;
        }
        return 0;
    }
}