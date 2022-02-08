public record FifthTask(double a, double b, double c) {

    public void getResult() {
        double[] arr = {a, b, c};
        for (double i : arr) {
            if (i > 0) {
                System.out.println(i + " -> " + Math.pow(i, 2));
            } else if (i < 0) {
                System.out.println(i + " -> " + Math.pow(i, 4));
            } else {
                System.err.println("Без нулей, пожалуйста!!!");
            }
        }
    }
}
