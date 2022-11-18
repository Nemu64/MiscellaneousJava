public class Billing {
    public static void main(String[] args) {
        System.out.println(computeBill(10));
        System.out.println(computeBill(15, 6));
        System.out.println(computeBill(20, 10, 5));

    }
    static String computeBill(float bill) {
        return "$" + String.format("%.2f", bill * 1.08);
    }
    static String computeBill(float bill, int quantity) {
        return "$" + String.format("%.2f", bill * quantity * 1.08);
    }
    static String computeBill(float bill, int quantity, float coupoun) {
        return "$" + String.format("%.2f", ((bill * quantity) - coupoun) * 1.08);
    }
}