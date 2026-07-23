import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int leftSum = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                System.out.println(i);
                found = true;
                break;
            }

            leftSum += arr[i];
        }

        if (!found) {
            System.out.println("No Equilibrium Index");
        }

        sc.close();
    }
}
