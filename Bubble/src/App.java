import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        for (int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
               if(arr[j] > arr[j+1]){
                n=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=n;

            }
        }
        
    }for(int arrs:arr) System.out.print(arrs);
    }
}
