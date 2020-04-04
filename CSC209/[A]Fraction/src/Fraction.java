public class Fraction {

    private Integer nominator;
    private Integer denominator;
    private Boolean isNegative = false;

    public Fraction() {
        this(0, 1);
    }

    public Fraction(double fraction) {
        this.nominator = lazyConvert(fraction)[0];
        this.denominator = lazyConvert(fraction)[1];
        negativeStatus();
    }

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
        negativeStatus();
    }

    public Fraction(Double nominator, Double denominator) {
        this.nominator = lazyConvert(nominator)[0] * lazyConvert(denominator)[1];
        this.denominator = lazyConvert(nominator)[1] * lazyConvert(denominator)[0];
        negativeStatus();
    }

    public void add(int num) {
        if (isNegative) {
            nominator -= num * denominator;
            negativeStatus();
            return;
        }
        nominator += num * denominator;
        negativeStatus();
    }

    public void add(double num) {
        if (isNegative) {
                nominator = nominator * lazyConvert(num)[1] - lazyConvert(num)[0] * denominator;
                denominator = denominator * lazyConvert(num)[1];
            negativeStatus();
            return;
        }
            nominator = nominator * lazyConvert(num)[1] + lazyConvert(num)[0] * denominator;
            denominator = denominator * lazyConvert(num)[1];
        negativeStatus();
    }

    public void add(int nominator, int denominator) {
        if (isNegative) {
            this.nominator = this.nominator * denominator - nominator * this.denominator;
            this.denominator = this.denominator * denominator;
            negativeStatus();
            return;
        }
        this.nominator = this.nominator * denominator + nominator * this.denominator;
        this.denominator = this.denominator * denominator;
        negativeStatus();
    }

    public void substract(int num) {
        if (isNegative) {
            nominator += num * denominator;
            negativeStatus();
            return;
        }
        nominator -= num * denominator;
        negativeStatus();
    }

    public void substract(double num) {
        if (isNegative) {
            nominator = nominator * lazyConvert(num)[1] + lazyConvert(num)[0] * denominator;
            denominator = denominator * lazyConvert(num)[1];
            negativeStatus();
            return;
        }
            nominator = nominator * lazyConvert(num)[1] - lazyConvert(num)[0] * denominator;
            denominator = denominator * lazyConvert(num)[1];
        negativeStatus();
    }

    public void substract(int nominator, int denominator) {
        if (isNegative) {
            this.nominator = this.nominator * denominator + nominator * this.denominator;
            this.denominator = this.denominator * denominator;
            return;
        }
        this.nominator = this.nominator * denominator - nominator * this.denominator;
        this.denominator = this.denominator * denominator;
        negativeStatus();
    }

    public void multiply(int num) {
        nominator *= num;
        negativeStatus();
    }

    public void multiply(double num) {
        nominator *= lazyConvert(num)[0];
        denominator *= lazyConvert(num)[1];
        negativeStatus();
    }

    public void multiply(int nominator, int denominator) {
        this.nominator *= nominator;
        this.denominator *= denominator;
        negativeStatus();
    }

    public void divide(int num) {
        denominator *= num;
        negativeStatus();
    }

    public void divide(double num) {
        nominator *= lazyConvert(num)[1];
        denominator *= lazyConvert(num)[0];
        negativeStatus();
    }

    public void divide(int nominator, int denominator) {
        this.nominator *= denominator;
        this.denominator *= nominator;
        negativeStatus();
    }

    public void reduce() {
        int gcd = 1;
        for (int i = nominator > denominator ? denominator : nominator; i >= 1; i--) {
            if (nominator % i == 0 && denominator % i == 0) {
                gcd = i;
                break;
            }
        }
        nominator /= gcd;
        denominator /= gcd;
    }

    public String toString() {

        if (isNegative == false) {
            return nominator + "/" + denominator;
        } else {
            return "-" + nominator + "/" + denominator;
        }

    }

    private int[] lazyConvert(Double num) {
        int[] result = new int[2];
        result[1] = 1;
        while (num - num.intValue() > 0.0000000001) {
            result[1] *= 10;
            num *= 10;
        }
        result[0] = num.intValue();
        return result;
    }

    private void negativeStatus() {
        if (nominator < 0 && denominator < 0) {
            nominator = Math.abs(nominator);
            denominator = Math.abs(denominator);
            isNegative = false;
        }
        if (nominator < 0) {
            if (isNegative == false) {
                isNegative = true;
            } else {
                isNegative = false;
            }
            nominator = Math.abs(nominator);
        } else if (denominator < 0) {
            if (isNegative == false) {
                isNegative = true;
            } else {
                isNegative = false;
            }
            denominator = Math.abs(denominator);
        }

    }
}
