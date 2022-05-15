package advance.exercises.nbp;

import java.util.Objects;

public class Rate{
    private String currency;
    private String code;
    private double mid;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", mid=" + mid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rate rate = (Rate) o;
        return Double.compare(rate.mid, mid) == 0 && Objects.equals(currency, rate.currency) && Objects.equals(code, rate.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, code, mid);
    }
}