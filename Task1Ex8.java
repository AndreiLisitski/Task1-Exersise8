import java.util.Scanner;


public class Task1Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size list");
        int n = sc.nextInt();
        int k = 0;
        System.out.print("Enter K = ");
        k = sc.nextInt();
        int sum = 0;
        int[] a = new int[n];
        for(int i =0; i < a.length; i++){
            a[i] = (int)(1 + Math.random()*10);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < a.length; i++){
            if(a[i]%k == 0 ){
                sum += a[i];
            }
        }
        System.out.print("Summ = " + sum + " ");

    }
}