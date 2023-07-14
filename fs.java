import java.util.Scanner;

public class fs {

    public static void main(String[] args) {
        int k;
        int i;
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Rotation count:");
        k = sc.nextInt();

        k=k%n;

        for(i = 0; i < n; i++)
        {
            if(i<k)
            {
                
                System.out.print(arr[n + i - k]+ " ");
            }
            else
            {                
                System.out.print(arr[i - k]+ " ");
            }
        }
        System.out.println();
    }
}
