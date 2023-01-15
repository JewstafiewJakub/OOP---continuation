public class Main {
    public static void main(String[] args) {

        CheckingAccount firstAccount = new CheckingAccount();
        SavingsAccount secondAccount = new SavingsAccount();
        CertificateOfDeposit thirdAccount = new CertificateOfDeposit();
        firstAccount.account = "123-456";
        System.out.println(firstAccount.account);
        secondAccount.balance = 545.4;
        System.out.println(secondAccount.balance);
        //
        //
        Queen queen = new Queen ();
        Position testPosition = new Position (3,10);
        if (queen.isValidMove(testPosition)) {
            System.out.println("I can move there");
        } else {
            System.out.println("I can't move there");
        }
    }
}