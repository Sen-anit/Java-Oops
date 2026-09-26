import java.util.Scanner;
public class Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter array size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("\nEnter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*for (int i: arr){      //Another printing method using foreach loop
            System.out.println(i);
        }*/

        System.out.println("Enter array elem that you want to find:");
        int num = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            if (arr[i] == num) {
                System.out.println("Found!!");
                break;
            }
            else if (i==n-1){
                System.out.println("Not Found!!!");
            }
        }

        //----2D ARRAY----
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int [][] arr2 = new int[r][c];
        System.out.println("Enter Array elements:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("----The Array elements----");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j]+" ");

            }
            System.out.println();
        }


    }
}
