import java.util.Arrays;
import java.util.Random;

public record EighthTask(int n, int k) {

    public void findSum() {
        int[] arr = new int[n];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }


}
