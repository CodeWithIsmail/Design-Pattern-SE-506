public class OrderFacade {
    private AccountCheck accountCheck;

    private PINCheck pinCheck;

    private BalanceCheck balanceCheck;

    private LedgerEntry ledgerEntry;

    private Notification notification;

    public OrderFacade() {
        accountCheck = new AccountCheck();
        pinCheck = new PINCheck();
        balanceCheck = new BalanceCheck();
        ledgerEntry = new LedgerEntry();
        notification = new Notification();
    }

    public void paymentOrder(String cardNumber, String pin, double amount, String operation) {
        if (!accountCheck.checkAccount(cardNumber))
            notification.sendNotification("Account check failed");
        else if (!pinCheck.checkPIN(cardNumber, pin))
            notification.sendNotification("PIN check failed");
        else if (!balanceCheck.checkBalance(cardNumber, amount))
            notification.sendNotification("Not enough balance");
        else {
            ledgerEntry.entryLedger(cardNumber, amount, operation);
            notification.sendNotification("Order successful");
        }
    }
}
