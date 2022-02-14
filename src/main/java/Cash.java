public class Cash implements IPay {
    private CashDenomination cashDenomination;

    public Cash(CashDenomination cashDenomination) {
        this.cashDenomination = cashDenomination;
    }

    public CashDenomination getCashDenomination() {
        return cashDenomination;
    }

    public String pay() {
        return "Cash paid";
    }
}
