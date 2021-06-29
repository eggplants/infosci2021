/**
 * kadai 03-ex
 *
 * @author haruna wataru
 * @version 2021-04-27
 */
class SalesTax {
    public static void main(String arg[]) {
        double old_tax = (double) 0.03, new_tax = (double) 0.05;
        double price = 0;
        int year = 0, month = 0;
        double sales_tax = 0;
        if (arg.length == 3) {
            price = Double.parseDouble(arg[0]);
            year = Integer.parseInt(arg[1]);
            month = Integer.parseInt(arg[2]);
        } else {
            System.err.println("$ java SalesTax <int Price> <int Year> <int Month>");
            System.exit(1);
        }

        if (month < 1 || 12 < month) {
            System.err.println("Month is 1-12");
            System.exit(1);
        }

        if ((year == 1997 && month < 4) || (year < 1997)) {
            sales_tax = price * old_tax;
        } else {
            sales_tax = price * new_tax;
        }

        System.out.println("Input Price		: " + arg[0]);
        System.out.println("Input Year		: " + arg[1]);
        System.out.println("Input Month		: " + arg[2]);
        System.out.println("");
        System.out.println("Sales Tax		: " + (int) sales_tax);

    }
}
