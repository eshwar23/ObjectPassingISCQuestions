// 2019
import java.util.*;
class MatRev
{
    int arr[][];
    int m,n;
    MatRev(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray()
    {
        Scanner in = new Scanner(System.in);
        int i, j ;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter element");
                arr[i][j]=in.nextInt();
            }
        }
    }
    int reverse(int x)
    {
        int rev=0,d;
        while(x>0)
        {
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        return rev;    
    }
    void revMat(MatRev P)
    {
        int i, j ;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=reverse(P.arr[i][j]);
            }
        }
    }
    void show()
    {
        int i, j ;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        int r=3,c=3;
        MatRev obj1=new MatRev(r,c);
        MatRev obj2=new MatRev(r,c);
        obj1.fillarray();
        System.out.println("Original Array");
        obj1.show();
        obj2.revMat(obj1);
        System.out.println();
        System.out.println("Reversed Array");
        obj2.show();
    }
}