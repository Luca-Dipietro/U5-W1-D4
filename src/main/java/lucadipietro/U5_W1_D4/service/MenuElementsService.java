package lucadipietro.U5_W1_D4.service;

import lombok.extern.slf4j.Slf4j;
import lucadipietro.U5_W1_D4.entities.MenuElement;
import lucadipietro.U5_W1_D4.repositories.MenuElementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MenuElementsService {
    @Autowired
    private MenuElementsRepository menuElementsRepository;

    public void saveMenuElement(MenuElement newMenuElement){

        if (menuElementsRepository.existsByName(newMenuElement.getName())){
            throw new RuntimeException("Il nome " + newMenuElement.getName() + " è gia in uso");
        }

        menuElementsRepository.save(newMenuElement);

        log.info("Nuovo elemento " + newMenuElement.getName() + " salvato con successo");
    }

}
