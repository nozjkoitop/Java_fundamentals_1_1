import java.util.Arrays;

public record SixthTask(int a, int b, int c) {

    public void findLimits() {
        int[] arr = {a, b, c};
        Arrays.stream(arr).sorted();
        System.out.println("Max value -> " + arr[2] + "\nMin value -> " + arr[0]);
    }
}
