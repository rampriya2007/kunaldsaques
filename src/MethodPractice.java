public class MethodPractice {

    public static void main(String[] args) {
        System.out.println(MethodPractice.isEven(7))  ;      // false
        System.out.println(MethodPractice. isPrime(17) );     // true
        System.out.println(MethodPractice.max(43, 27)) ;     // 43
        System.out.println(MethodPractice.factorial(5)    ); // 120
        System.out.println(MethodPractice.reverseNumber(1234));
        int[] arr = {10, 20, 30, 40, 50};
        reverseArray(arr);
    }

    static void reverseArray(int[] arr) {
        int left=0;
        int right= arr.length-1;
       while(left<=right)
       {
           int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;
       }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    static boolean isEven(int n) {
        return n % 2 == 0; // expression itself returns true/false
    }
    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    static int max(int a, int b) {
        return (a > b) ? a : b; // ternary — you know this
    }
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    static int reverseNumber(int n){
        int lastdigit=0;
        int revr_no=0;
        while(n>0)
        {
            lastdigit=n%10;
            n=n/10;
            revr_no=revr_no*10+lastdigit;
        }
        return revr_no;
    }

}
