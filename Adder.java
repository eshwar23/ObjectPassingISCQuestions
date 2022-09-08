//2017
/*
A class Adder has been defined to add any two accepted time.
Example:
Time A – 6 hours 35 minutes
Time B – 7 hours 45 minutes
Their sum is – 14 hours 20 minutes (where 60 minutes = 1 hour)
The details of the members of the class are given below:
Class name: Adder
Data member/instance variable:
a[]: integer array to hold two elements (hours and minutes)
Member functions/methods:
Adder (): constructor to assign 0 to the array elements
void readtime (): to enter the elements of the array
void addtime (Adder X, Adder Y): 
    adds the time of the two parameterized objects X and Y 
    and stores the sum in the current calling object
void disptime(): displays the array elements with 
    an appropriate message (i.e., hours= and minutes=)
Specify the class Adder giving details of the constructor(), 
void readtime( ), void addtime(Adder, Adder) and void disptime(). 
Define the main() function to create objects 
and call the functions accordingly to enable the task.*/

import java.util.*;
class Adder
{
    int a[];
    Adder()
    {
        a=new int[2];
        a[0]=0;
        a[1]=0;
    }
    void readtime()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time in hrs");
        a[0]=in.nextInt();
        System.out.println("Enter time in minutes");
        a[1]=in.nextInt();
    }
    void addtime (Adder X, Adder Y)
    {
        if(X.a[1]+Y.a[1]>60)
        {
            a[0]=X.a[0]+Y.a[0]+1;
            a[1]=(X.a[1]+Y.a[1])-60;
            
        }
        else
        {
            a[0]=(X.a[0]+Y.a[0]);
            a[1]=X.a[1]+Y.a[1];
        }
    }
    void disptime()
    {
        System.out.println("Hours : "+a[0] + " Minutes : "+a[1]);
        System.out.println();
    }
    public static void main()
    {
        Adder obj1=new Adder();
        System.out.println("Enter time 1:");
        obj1.readtime();
        obj1.disptime();
        Adder obj2=new Adder();
        System.out.println("Enter time 2:");
        obj2.readtime();
        obj2.disptime();
        Adder obj3=new Adder();
        obj3.addtime(obj1,obj2);
        System.out.println("Final time:");
        obj3.disptime();
    }
}
