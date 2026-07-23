import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int majority = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                majority = arr[i];
                break;
            }
        }

        if (majority != -1) {
            System.out.println(majority);
        } else {
            System.out.println("No Majority Element");
        }

        sc.close();
    }
}
