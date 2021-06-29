class MethodCompo {
    public static void main(String args[]) {
        int a = 10;
        int result;

        result = calc(a);
        System.out.println("a + 10 = " + result);
    }

    static int calc(int num) {
        int ret;

        System.out.println("Data from main : " + num);
        ret = num + 10;
        return ret;
    }
}
