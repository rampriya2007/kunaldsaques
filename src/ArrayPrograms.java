import java.lang.String;
public class ArrayPrograms {
    public static void main(String[] args) {
        int[] marks = {42, 85, 63, 95, 71}; // your 5 values
        ArrayPrograms.largest(marks);
        ArrayPrograms.lowest(marks);
        ArrayPrograms.average(marks);
    }
    // your highest logic here
    static void largest ( int[] arr){
        int max = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Highest : " + max);
    }
        // your lowest logic here
        static void lowest(int[] arr) {
                int min=arr[0];
                int n=arr.length;
                for(int i=1;i<n;i++)
                {
                    if(arr[i]<min)
                    {
                        min=arr[i];
                    }
                }
            System.out.println("Lowest  : "+min);
            }


        // your average logic here
        static void average(int[] arr){
        int total=0;
        for(int i=0;i< arr.length;i++)
        {
            total+=arr[i];
        }
        double average=(double) total/arr.length;
            System.out.println(String.format("Average : %.2f",average));

    }
}