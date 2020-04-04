package version2;

class Transaction{
    private String transid;
    private String date;
    private double amount;

    public Transaction(double amount, String date, int TransactionCount) {
        this.amount = amount;
        this.date = date;
        transid = genId(TransactionCount);

    }

    public String toString() {
        return "{" + " transid='" + transid + "'" + ", date='" + date + "'" + ", amount='" + amount + "'" + "}";
    }

    private String genId(int count) {
        String id = String.valueOf(count);
        int length = id.length();
        while (length < 9) {
            id = "0" + id;
            length = id.length();
        }
        return id;
    }
}