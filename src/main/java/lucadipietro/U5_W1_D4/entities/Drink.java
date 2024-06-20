package lucadipietro.U5_W1_D4.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Drink extends MenuElement {
    public Drink( String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Drink: " + super.toString();
    }
}
