package fr.wildcodeschool.thewizardproject.controllers;


import fr.wildcodeschool.thewizardproject.models.Dumbledore;
import fr.wildcodeschool.thewizardproject.models.Gandalf;
import fr.wildcodeschool.thewizardproject.models.Outfit;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public void start() {

        Outfit cosyDrinkAdvice = new Outfit();

        Gandalf myWizard = new Gandalf(cosyDrinkAdvice);
        System.out.println("");
        System.out.println("******************");
        System.out.println(myWizard.changeDress());
        System.out.println("******************");

        System.out.println(myWizard.displayRetourString());

    }
}
