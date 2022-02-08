public record FourthTask(int x, int y) {

    public void pointCheck() {
        boolean result = false;
        if (-4 <= x && x <= 4 && -3 <= y && y <= 0) {
            result = true;
        } else if (-2 <= x && x <= 2 && 0 <= y && y <= 4) {
            result = true;
        }
        System.out.println(result);
    }
}
