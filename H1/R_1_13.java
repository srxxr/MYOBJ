package H1;

public class R_1_13 {
    public static void main(String[ ] args) {
        R_1_11__R_1_12[ ] wallet = new R_1_11__R_1_12[3];
         wallet[0] = new R_1_11__R_1_12("John Bowman", "California Savings",
                 "5391 0375 9387 5309", 5000);
        wallet[1] = new R_1_11__R_1_12("John Bowman", "California Federal",
                 "3485 0399 3395 1954", 3500);
         wallet[2] = new R_1_11__R_1_12("John Bowman", "California Finance",
                 "5391 0375 9387 5309", 2500, 300);
         for (int val = 1; val <= 17; val++) {
             wallet[0].charge(3*val);
             wallet[1].charge(2*val);
             wallet[2].charge(val);
             }
         for (R_1_11__R_1_12 card : wallet) {
             R_1_11__R_1_12.printSummary(card); // calling static method
             while (card.getBalance( ) > 200.0) {
                 card.makePayment_12(200);
                 System.out.println("New balance = " + card.getBalance( ));
                 }  }  }
}
