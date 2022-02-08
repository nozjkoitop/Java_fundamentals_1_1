public record FirstTask(Integer t) {
    public FirstTask(Integer t) {
        if (t.toString().toCharArray().length == 4) {
            this.t = t;
        } else {
            throw new NullPointerException();
        }

    }

    public void check() {
        boolean b = false;
        char[] arr = t.toString().toCharArray();
        if (arr[0] + arr[1] == arr[2] + arr[3]) {
            b = true;
        }
        System.out.println(b);
    }
}
