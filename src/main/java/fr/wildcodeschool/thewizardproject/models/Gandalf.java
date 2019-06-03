package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Gandalf implements WizardInterface {



    @Override
    public String giveAdvice() {
        return "Suit grey";
    }

    @Override
    public String changeDress() {
        return "Red";
    }

}
