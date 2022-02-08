import static java.lang.Math.*;

public record SeventhTask(int start, int end, int h) {

    public void function() {
        double[][] result = new double[(end - start) / h][2];
        double f;
        double x = start;
        for (int i = 0; i < ((end - start) / h); i++) {
            f = (pow(sin(x), 2)) - cos(2 * x);
            result[i][0] = x;
            result[i][1] = f;
            x += h;
        }
        for (int y = 0; y < ((end - start) / h); y++) {
            for (int z = 0; z < 2; z++) {
                System.out.print(result[y][z] + "\t");
            }
            System.out.println();
        }
    }
}
