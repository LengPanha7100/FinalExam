public class Main {
        public static void main(String[] args) {
            Customer premiumcustomer = new Customer("Panha","Premium");
            Sale s = new Sale(premiumcustomer,"21-02-24");
            s.setServiceExpense(100);
            s.setProductExpense(100);
            s.displayinfo();
        }

}
