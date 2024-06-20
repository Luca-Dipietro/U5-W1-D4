package lucadipietro.U5_W1_D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lucadipietro.U5_W1_D4.enums.PizzaType;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pizza extends MenuElement{
    @OneToMany(mappedBy = "pizza")
    private List<Topping> toppings;
    @Enumerated(EnumType.STRING)
    private PizzaType pizzaType;

    public Pizza(String name, int calories, double price, List<Topping> toppings, PizzaType pizzaType) {
        super(name, calories, price);
        this.toppings = toppings;
        this.pizzaType = pizzaType;
    }

    @Override
    public String toString() {
        return "Pizza: " + super.toString() +
                "toppings=" + toppings +
                ", pizzaType=" + pizzaType ;
    }
}
