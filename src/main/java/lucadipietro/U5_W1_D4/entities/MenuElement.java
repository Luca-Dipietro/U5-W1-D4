package lucadipietro.U5_W1_D4.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "menu_element")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_element")
@NoArgsConstructor
@Getter
@Setter
public abstract class MenuElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String name;
    private int calories;
    private double price;

    public MenuElement(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price ;
    }
}
