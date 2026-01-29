import java.time.Instant;
import java.util.Objects;

public class TableOrder {
    private Table tableOrder;
    private Instant arrivalDatetime;
    private Instant departureDatetime;

    public Table getTableOrder() {
        return tableOrder;
    }

    public void setTableOrder(Table tableOrder) {
        this.tableOrder = tableOrder;
    }

    public Instant getArrivalDatetime() {
        return arrivalDatetime;
    }

    public void setArrivalDatetime(Instant arrivalDatetime) {
        this.arrivalDatetime = arrivalDatetime;
    }

    public Instant getDepartureDatetime() {
        return departureDatetime;
    }

    public void setDepartureDatetime(Instant departureDatetime) {
        this.departureDatetime = departureDatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TableOrder that = (TableOrder) o;
        return Objects.equals(table, that.table) && Objects.equals(arrivalDatetime, that.arrivalDatetime) && Objects.equals(departureDatetime, that.departureDatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, arrivalDatetime, departureDatetime);
    }

    @Override
    public String toString() {
        return "TableOrder{" +
                "table=" + table +
                ", arrivalDatetime=" + arrivalDatetime +
                ", departureDatetime=" + departureDatetime +
                '}';
    }
}
