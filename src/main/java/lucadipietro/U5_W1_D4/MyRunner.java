package lucadipietro.U5_W1_D4;

import lucadipietro.U5_W1_D4.entities.Drink;
import lucadipietro.U5_W1_D4.entities.Pizza;
import lucadipietro.U5_W1_D4.entities.Topping;
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

        Topping tomato = (Topping) ctx.getBean("getTomato");
        Topping cheese = (Topping) ctx.getBean("getCheese");
        Topping ham = (Topping) ctx.getBean("getHam");
        Topping onions = (Topping) ctx.getBean("getOnions");
        Topping pineapple = (Topping) ctx.getBean("getPineapple");
        Topping salami = (Topping) ctx.getBean("getSalami");
        Pizza margherita = (Pizza) ctx.getBean("getMargheritaPizza");
        Pizza salamiPizza = (Pizza) ctx.getBean("getSalamiPizza");
        Pizza hawaiian = (Pizza) ctx.getBean("getHawaiianPizza");
        Drink water = (Drink) ctx.getBean("getWater");
        Drink lemonade = (Drink) ctx.getBean("getLemonade");

//        menuElementsService.saveMenuElement(tomato);
//        menuElementsService.saveMenuElement(cheese);
//        menuElementsService.saveMenuElement(onions);
//        menuElementsService.saveMenuElement(ham);
//        menuElementsService.saveMenuElement(pineapple);
//        menuElementsService.saveMenuElement(salami);
//        menuElementsService.saveMenuElement(margherita);
//        menuElementsService.saveMenuElement(salamiPizza);
//        menuElementsService.saveMenuElement(hawaiian);
//        menuElementsService.saveMenuElement(water);
//        menuElementsService.saveMenuElement(lemonade);

    }
}
