package lucadipietro.U5_W1_D4.entities;

import jakarta.persistence.*;
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
    @ManyToMany
    @JoinTable(name = "pizza_topping", joinColumns = @JoinColumn(name = "pizza_id"), inverseJoinColumns = @JoinColumn(name = "topping_id"))
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
