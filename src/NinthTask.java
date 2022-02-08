import java.util.Arrays;

public record NinthTask(int[] firstArr, int[] secondArr, int k) {

    public void unite() {
        int[] arr = new int[firstArr.length + secondArr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                arr[i] = firstArr[i];
            } else if (count < secondArr.length) {
                arr[i] = secondArr[count];
                count++;
            } else {
                arr[i] = firstArr[i - secondArr.length];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
