import java.util.Scanner;


public class java_first {


    Scanner scan=new Scanner(System.in);


   

    public static void main(String[] args) {
        java_first o1=new java_first();
      //  o1.nine();
//          byte a=123;
//          short b=32767;
//          int c=1000000000;
//          long d=9000000000000000000l;
//          double e=999999999999999999999999999999999999999999999999.2d;
//          float  f=99999999999999999999999999999999999999.22222202f;
//
//
//
//        System.out.println(a);
//        System.out.println(++a);
       // o1.zero();
        //System.out.println(fib(7));
    }
//Write a program to print whether a number is even or odd, also take input from the user.

    void zero(){
        String b=scan.nextLine();
        System.out.println("hi");
        String a=scan.nextLine();
        System.out.println(b+" "+a);

    }
    void one(){
        System.out.println("enter the number to find it's even or odd:");

        int number=scan.nextInt();
        if(number%2==0){
            System.out.println("the number is even");
        }else {
            System.out.println("the number is odd");
        }
    }
//Take name as input and print a greeting message for that particular name.
void two(){
    String name=scan.next();
    System.out.println("hello "+name);
}
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
void three(){
    double p= scan.nextDouble();
    double t= scan.nextDouble();
    double r=scan.nextDouble();
        double si=(p*t*r)/100;
    System.out.println(si);
}
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
void four(){
    int n1= scan.nextInt();
    int n2= scan.nextInt();
    char operator=scan.next().charAt(0);
    double result;
    if (operator == '+'){
         result=n1+n2;
         System.out.println("result:"+result);
    } else if (operator == '-') {
        result=n1-n2;
        System.out.println("result:"+result);

    } else if (operator == '*') {
        result=n1*n2;
        System.out.println("result:"+result);

    } else if (operator == '/') {
        result=n1/n2;
        System.out.println("result:"+result);

    }else {
        System.out.println("invalid opertor");
    }
}
//Take 2 numbers as input and print the largest number.
void five()
{
    int num1= scan.nextInt();
    int num2= scan.nextInt();
    int large=(num1>num2)?num1:num2;
    System.out.println(large);
}
//Input currency in rupees and output in USD.
    void six() {
        int rupees = scan.nextInt();
        double exchangerate = 0.0108;
        double usd = rupees * exchangerate;
        System.out.println("rupees in usd: "+usd);
    }
void seven(){
        int no=scan.nextInt();
        int arr[]=new int[no];
        if(no>0)arr[0]=0;
        if(no>1)arr[1]=1;
        for(int i=2;i<no;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int a:arr)
        {
            System.out.println(a);
        }
}
//To find out whether the given String is Palindrome or not.
    void eight(){
     String s =new String("gfa");
     int strlen=s.length();
        boolean ans = true;
     for(int i=0;i<(strlen-1)/2;i++)
     {   if(s.charAt(i)!=s.charAt(strlen-1-i)){
         ans=false;
         break;
         }
     }
     if(ans){
         System.out.println("it is  a palindrome");
     }
     else {
         System.out.println("it is not a palindrome");

     }

    }
//To find Armstrong Number between two given number.
    void nine(){
        System.out.println("enter two numbers greater than 0: ");
        int a=scan.nextInt();
        int b= scan.nextInt();

        for(int i=a+1;i<b;i++)
        {
            int temp=i;
            int ilength=String.valueOf(i).length();
            double amstrng=0;
            while(temp>0){
                amstrng+=Math.pow((temp%10),ilength);
                temp=temp/10;
            }

            if(amstrng==i){
                System.out.println(i);
            }

        }

}

}