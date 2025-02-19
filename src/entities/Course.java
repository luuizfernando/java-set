package entities;

import java.util.Objects;

public class Course {
    private Integer quantity;

    public Course(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(quantity, course.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(quantity);
    }
}