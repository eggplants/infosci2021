class TurningIf {
        private static void p(String i) {
                System.out.println(i);
        }

        public static void main(String args[]) {
                if (args.length != 1) {
                        p("Please Input one number!");
                        System.exit(1);
                } else {
                        int a = Integer.parseInt(args[0]);
                        if (a == 10) {
                                p("a -eq 10");
                        } else {
                                p("a -ne 10");
                        }
                }
        }
}
