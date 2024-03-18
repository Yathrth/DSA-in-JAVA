/**
 * Recursion
 */
public class Recursion00 {

    // ------------Print nos. from 5 to 1-----------------------

    // public static void main(String[] args) {
    // int n=5;
    // printnumb(n);
    // }

    // public static void printnumb(int i) {
    // if (i==0) {
    // return;
    // }
    // System.out.println(i);
    // printnumb(i-1);
    // }

    // -----------Sum of first n natural nos.--------------------

    // public static void main(String[] args) {
    // printnum(1,5,0);
    // }

    // public static void printnum(int i,int n, int sum) {
    // if (i==n) {
    // sum+=n;
    // System.out.println(sum);
    // return;
    // }
    // sum+=i;
    // printnum(i+1, n, sum);
    // }

    // Alternate--

    // public static void printnum(int i,int n,int sum) {
    // if (n==i) {
    // sum+=i;
    // System.out.println(sum);
    // return;
    // }
    // sum+=n;
    // printnum(i, n-1, sum);
    // }


    // ---------------Print Factorial of a num.------------------

    // public static void main(String[] args) {
    // int ans = factorial(5);
    // System.out.println(ans);
    // }

    // public static int factorial(int n) {
    // if (n==1 || n==0) {
    // return 1;
    // }
    // int fact =n*factorial(n-1);
    // return fact;
    // }

    //Alternate-----

    // public static void main(String[] args) {
    // int ans = factorial(5,1);
    // System.out.println(ans);
    // }

    // public static int factorial(int n, int i) {
    // if (i==(n+1)) {
    // return 1;
    // }
    // int fact = i*factorial(n, i+1);
    // return fact;
    // }


    //-----------------Fibonacci series--------------------

    // public static void main(String[] args) {
    //     int a=0,b=1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n=7;
    //     fib(a,b,n-2);
    // }
    // public static void fib(int a, int b, int n) {
    //    if (n==0) {
    //         return;
    //    }
    //     int c=a+b;
    //     System.out.println(c);
    //     fib(b, c, n-1);
    // }

    //---------------Print x^n(Stack Height = n)-----------------
    
    // public static void main(String[] args) {
    //    int ans = power(2, 5);
    //    System.out.println(ans);
        
    // }

    // public static int power(int x, int n) {
    //     if(n==0){
    //         return 1;
    //     }
    //     if (x==0) {
    //         return 0;
    //     }
    //     int ans= x*power(x, n-1);
    //     return ans;
    // }


    //---------------Print x^n(Stack Height = logn)-----------------
    
    // public static void main(String[] args) {
    //    int ans = power(2, 5);
    //    System.out.println(ans);
        
    // }

    // public static int power(int x, int n) {
    //     if(n==0){
    //         return 1;
    //     }
    //     if (x==0) {
    //         return 0;
    //     }
    //    //if n is even
    //    if (n%2==0) {
    //     int ans = power(x, n/2)*power(x, n/2);
    //     return ans;
    //    }
    //     //for odd n
    //     else{
    //         int ans = power(x, n/2)*power(x, n/2)*x;
    //         return ans;
    //     }       
    // }



}