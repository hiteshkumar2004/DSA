class Solution {
         public static List<Integer> spiralOrder(int[][] m) {
        
            List<Integer> l=new ArrayList<Integer>();
            int r=m.length-1;
            int c=m[0].length-1;
            int row=0;
            int col=0;
            while(c>=col && r>=row){
                    for (int i = col; i <= c; i++) l.add(m[row][i]);    
                    row++;
                    for (int i = row; i <= r; i++)l.add(m[i][c]);
                    c--;

                if(c>=col&&row <= r){
                    for(int i=c;i>=col;i--)l.add(m[r][i]);
                    r--;
                }
                if(row<=r && c>=col){
                    for(int i=r;i>=row;i--)l.add(m[i][col]); 
                    col++;
                }
            }
            return l;
        }
}