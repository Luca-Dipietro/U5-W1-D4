package lucadipietro.U5_W1_D4.repositories;

import lucadipietro.U5_W1_D4.entities.MenuElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuElementsRepository extends JpaRepository<MenuElement,Long> {

    List<MenuElement> findByName(String name);

    boolean existsByName(String name);
}
