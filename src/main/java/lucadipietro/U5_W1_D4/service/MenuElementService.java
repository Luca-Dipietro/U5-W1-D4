package lucadipietro.U5_W1_D4.service;

import lombok.extern.slf4j.Slf4j;
import lucadipietro.U5_W1_D4.entities.MenuElement;
import lucadipietro.U5_W1_D4.repositories.MenuElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MenuElementService {
    @Autowired
    private MenuElementRepository menuElementRepository;

    public void saveMenuElement(MenuElement newMenuElement){

        if (menuElementRepository.existsByName(newMenuElement.getName())){
            throw new RuntimeException("Il nome " + newMenuElement.getName() + " è gia in uso");
        }

        menuElementRepository.save(newMenuElement);

        log.info("Nuovo elemento " + newMenuElement.getName() + " salvato con successo");
    }

}
