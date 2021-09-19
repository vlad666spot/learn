public class Entertainment {
    private boolean hasEntertainment;
    private int tvQuantity;
    private int speakersQuantity;
    private int headphonesQuantity;

    public Entertainment(boolean hasEntertainment, int tvQuantity, int speakersQuantity, int headphonesQuantity) {
        this.hasEntertainment = hasEntertainment;
        this.tvQuantity = tvQuantity;
        this.speakersQuantity = speakersQuantity;
        this.headphonesQuantity = headphonesQuantity;
    }

    public boolean getHasEnternaiment(){
        return this.hasEntertainment;
    }

    public int getTvQuantity(){
        return this.tvQuantity;
    }

    public int getSpeakersQuantity(){
        return this.speakersQuantity;
    }

    public int getHeadphonesQuantity(){
        return this.headphonesQuantity;
    }

    public void roomEntertaiment(){
        System.out.println("Room has: "+getTvQuantity()+" TV, "+ getSpeakersQuantity()+" speakers, "+getHeadphonesQuantity()+" "+" headphones");
    }
}
