package lucadipietro.U5_W1_D4;

import lucadipietro.U5_W1_D4.entities.Pizza;
import lucadipietro.U5_W1_D4.service.MenuElementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private MenuElementsService menuElementsService;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D4Application.class);

        Pizza margherita = (Pizza) ctx.getBean("getMargheritaPizza");

        menuElementsService.saveMenuElement(margherita);
    }
}
