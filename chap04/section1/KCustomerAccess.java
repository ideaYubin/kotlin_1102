package chap04.section1;

public class KCustomerAccess {
    public static void main(String[] args) {
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login();
    }
}
