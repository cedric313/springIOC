package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Dumbledore implements WizardInterface {



    @Override
    public String giveAdvice(){
        return "Suit blue";
    }

    @Override
    public String changeDress() {
        return "Blue";
    }

}
