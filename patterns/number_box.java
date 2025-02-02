package patterns;

import java.util.Scanner;

class number_box{

    public static void main(String args[]){
int start,end,len,n;

Scanner s=new Scanner(System.in);
n=s.nextInt();
len=n*2-1;
start=0;
end=len;
int a[][] = new int[len][len];

for (int i = start; i < len; ++i) {
    for (int j = start; j < len; ++j) {
        a[i][j]=n;
    }

    start++;
    end--;
    n--;
}
    }
    
}