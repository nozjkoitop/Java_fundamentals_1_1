import static java.lang.Math.*;

public record ThirdTask(int a, int b) {
    public ThirdTask(int a, int b) {
        this.a = abs(a);
        this.b = abs(b);
    }

    public void getPerimeter() {
        double perimeter = sqrt(pow(a, 2) + pow(b, 2));
        System.out.println(perimeter);
    }

    public void getSquare() {
        double square = (a * b) / 2;
        System.out.println(square);
    }
}
