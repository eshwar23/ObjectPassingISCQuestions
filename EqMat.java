//2018
/*
Two matrices are said to be equal if they have the same dimension 
and their corresponding elements are equal. 
For example, the two matrices A and B is given below are equal:
Design a class EqMat to check if two matrices are equal or not. 
Assume that the two matrices have the same dimension.
Some of the members of the class are given below :
Class name: EqMat
Data members/instance variables:
a[][] : to store integer elements
m: to store the number of rows
n: to store the number of columns
Member functions/methods:
EqMat(): 
parameterized constructor to initialise the data members m = mm and n = nn
void readArray(): 
to enter elements in the array
int check(EqMat P, EqMat Q): 
checks if the parameterized objects P and Q are equal 
and returns 1 if true, otherwise returns 0
void print(): displays the array elements
Define the class EqMat giving details of the constructor (), 
void readarray( ), int check(EqMat, EqMat) and void print( ). 
Define the main( ) function to create objects and call the 
functions accordingly to enable the task.
*/
import java.util.*;
class EqMat
{
    int a[][];
    int m,n;
    EqMat(int mm,int nn)
    {
        m=mm;
        n=nn;
        a=new int[m][n];
    }
    void readArray()
    {
        Scanner in = new Scanner(System.in);
        int i , j ;
        for(i=0;i<m;i++)
        {
             for(j=0;j<n;j++)
            {
                System.out.println("Enter value");
                a[i][j]=in.nextInt();
            }
        }
    }
    int check(EqMat P, EqMat Q)
    {
        int r=1,i,j;
        out:
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(P.a[i][j]!=Q.a[i][j])
                {
                    r=0;
                    break out;
                }
            }
        }
        return r;
    }
    void print()
    {
        int i , j ;
        for(i=0;i<m;i++)
        {
             for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+ "\t");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Enter the number of rows and columns");
        r=sc.nextInt();
        c=sc.nextInt();
        EqMat obj1=new EqMat(r,c);
        System.out.println("Enter the values of First Array");
        obj1.readArray();
        EqMat obj2=new EqMat(r,c);
        System.out.println("Enter the values of second Array");
        obj2.readArray();
        System.out.println("First Array");
        obj1.print();
        System.out.println("Second Array");
        obj2.print();
        EqMat obj3=new EqMat(r,c);
        if(obj3.check(obj1,obj2)==1)
        {
            System.out.println("Equal Matrix");
        }
        else
        {
            System.out.println("Not an Equal Matrix");
        }
    }
    
}