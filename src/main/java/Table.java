import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class Table {
    private Integer id;
    private Integer number;
    private List<Order> orders;

    boolean isAvailableAt(Instant t){
        if (this.orders == null || this.orders.isEmpty()) {
            return true;
        }
        return false;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return Objects.equals(id, table.id) && Objects.equals(number, table.number) && Objects.equals(orders, table.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, orders);
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", number=" + number +
                ", orders=" + orders +
                '}';
    }
}
