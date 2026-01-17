import java.util.Objects;

public class DishIngredient {
    private Integer idDish;
    private Integer idIngredient;
    private Double quantity;
    private UnitEnum unit;

    public DishIngredient(Integer idDish, Integer idIngredient, Double quantity, UnitEnum unit) {
        this.idDish = idDish;
        this.idIngredient = idIngredient;
        this.quantity = quantity;
        this.unit = unit;
    }

    public Integer getIdDish() {
        return idDish;
    }

    public Integer getIdIngredient() {
        return idIngredient;
    }

    public Double getQuantity() {
        return quantity;
    }

    public UnitEnum getUnit() {
        return unit;
    }

    public void setIdDish(int idDish) {
        this.idDish = idDish;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DishIngredient that = (DishIngredient) o;
        return Objects.equals(idDish, that.idDish) && Objects.equals(idIngredient, that.idIngredient) && Objects.equals(quantity, that.quantity) && unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDish, idIngredient, quantity, unit);
    }

    @Override
    public String toString() {
        return "DishIngredient{" +
                "idDish=" + idDish +
                ", idIngredient=" + idIngredient +
                ", quantity=" + quantity +
                ", unit=" + unit +
                '}';
    }
}
