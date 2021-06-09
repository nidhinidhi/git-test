import java.lang.*;
import java.util.*;
import java.io.*;
//June challenge  Q1
// Chefland has 2 different types of coconut, type A and type B.
// Type A contains only xa milliliters of coconut water and type B contains only xb grams of coconut pulp.
// Chef's nutritionist has advised him to consume Xa milliliters of coconut water and Xb grams of coconut 
// pulp every week in the summer. Find the total number of coconuts (type A + type B) 
// intput t= 3
// 100 400 1000 1200
// out = 13
class JuneChalQ1{
    public void totalNumOfCoc(int a,int b,int a1,int b1){
        //Type of A cocnut is
        int A = a1/a;
        //Type of B cocnut is
        int B = b1/b;
        int sum = A + B;
        System.out.println(sum);
    }
    public static void main(String[] args){
        JuneChalQ1 obj = new JuneChalQ1();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!= 0){
            int a = sc.nextInt();//mil of coc of A
            int b = sc.nextInt();//gram of coc of B
            int a1 = sc.nextInt();//mil water of coc of A
            int b1 = sc.nextInt();//gram puul of coc of B
            obj.totalNumOfCoc(a,b,a1,b1);
            t--;
        }
    }
}