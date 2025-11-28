import java.util.*;

public class java_1DArray {

    public static void main(String[] args) {
	   
        System.out.println("Enter array size:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] a = new int[n];
        
        System.out.println("Enter inputs: ");
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        scan.close();

        System.out.println("Sequential elements of an array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        scan.close();
    }
}