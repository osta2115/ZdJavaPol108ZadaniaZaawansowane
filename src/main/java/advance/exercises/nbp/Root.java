package advance.exercises.nbp;

import java.util.ArrayList;
import java.util.Objects;

public class Root{
    private String table;
    private String no;
    private String effectiveDate;
    private ArrayList<Rate> rates;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public ArrayList<Rate> getRates() {
        return rates;
    }

    public void setRates(ArrayList<Rate> rates) {
        this.rates = rates;
    }

    @Override
    public String
    toString() {
        return "Root{" +
                "table='" + table + '\'' +
                ", no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", rates=" + rates +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Root root = (Root) o;
        return Objects.equals(table, root.table) && Objects.equals(no, root.no) && Objects.equals(effectiveDate, root.effectiveDate) && Objects.equals(rates, root.rates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, no, effectiveDate, rates);
    }
}