package version1;

class Transaction {
    private String transid;
    private String date;
    private double amount;

    public Transaction(int transid, double amount, String date) {
        this.amount = amount;
        this.date = date;
        this.transid = genId(transid);

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

    public String getTransid() {
        return this.transid;
    }

    public String getDate() {
        return this.date;
    }

    public double getAmount() {
        return this.amount;
    }

}