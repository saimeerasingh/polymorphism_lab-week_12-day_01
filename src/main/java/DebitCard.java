public class DebitCard extends Card implements IScan {

    private int sortCode;
    private int accountNumber;

    public DebitCard(String cardNumber, String expiryDate, int securityNumber, int sortCode, int accountNumber) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String scan() {
        return "Payment Complete";
    }
}
