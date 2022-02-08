import java.util.Arrays;
import java.util.Collections;

public record TenthTask(int n) {
    public TenthTask(int n) {
        if (n % 2 == 0) {
            this.n = n;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void createMatrix() {
        Integer[] part = new Integer[n];
        for (int i = 0; i < part.length; i++) {
            part[i] = i + 1;
        }
        Integer[] part2 = part.clone();
        Arrays.sort(part2, Collections.reverseOrder());

        Integer[][] result = new Integer[n][n];
        for (int j = 0; j < n; j++) {
            if (j % 2 != 0) {
                result[j] = part2;
            } else {
                result[j] = part;
            }
        }
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(result[x][y] + "\t");
            }
            System.out.println();
        }
    }
}
