package lucadipietro.U5_W1_D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Topping extends MenuElement{
    @ManyToOne
    @JoinColumn(name = "id_pizza")
    private Pizza pizza;

    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Topping: " + super.toString();
    }
}
