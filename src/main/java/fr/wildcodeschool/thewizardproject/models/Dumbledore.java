package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
    private Outfit outfitAdvice;

    // Constructor with the cosyDrinkAdvice object passed as an argument
    public Dumbledore(Outfit theOutfitAdvice) {
        outfitAdvice = theOutfitAdvice;
    }


    public String displayRetourString(){
        return this.outfitAdvice.retourString();
    }

    @Override
    public String giveAdvice(){
        return "Suit grey";
    }

    @Override
    public String changeDress() {
        return "ok";
    }




}
