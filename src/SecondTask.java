import static java.lang.Math.*;

public record SecondTask(int a, int b, int c) {

    public void result() {
        double d;
        d = (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
        System.out.println(d);
    }
}
