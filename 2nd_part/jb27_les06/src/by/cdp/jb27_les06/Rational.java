package by.cdp.jb27_les06;

public class Rational {

    private int num;
    private int den;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        if (den > 0) {
            this.den = den;
        } else {
            this.den = 1;
        }
    }

    public Rational(int num, int den) {
        this.num = num;
        if (den > 0) {
            this.den = den;
        } else {
            this.den = 1;
        }
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}
