class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> l=new ArrayList<>();
        int i=0;
        int j=0;
        int zc=0;
        int f=0;
        int r=m.length;
        int c=m[0].length;
        int t=r*c;
        r-=1;
        c-=1;
        while(zc<t){
            l.add(m[i][j]);
            m[i][j]=-69;
            zc+=1;
            if(f==0){
                if(j+1>c || m[i][j+1]==-69){
                    f=1;
                    i+=1;
                }
                else{
                    j+=1;
                }
            }
            else if(f==1){
                if(i+1>r || m[i+1][j]==-69){
                    f=2;
                    j-=1;
                }
                else{
                    i+=1;
                }
            }
        else if(f==2){
            if(j-1<0 || m[i][j-1]==-69){
                f=3;
                i-=1;
            }
            else{
                j-=1;
            }
        }
        else if(f==3){
            if(i-1<0 || m[i-1][j]==-69){
                f=0;
                j+=1;
            }
            else{
                i-=1;
            }
        }
        }
        return l;
    }
}
