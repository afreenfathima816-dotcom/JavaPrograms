import java.util.Scanner;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxLength = 1;
        int currentLength = 1;
        int startIndex = 0;
        int tempStart = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
                tempStart = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                startIndex = tempStart;
            }
        }

        System.out.println("Longest Increasing Subarray:");

        for (int i = startIndex; i < startIndex + maxLength; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
