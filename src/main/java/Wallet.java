import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> cards;
    private ArrayList<Cash> monies;


    public Wallet(String name) {
        this.name = name;
        this.cards = new ArrayList<IScan>();
        this.monies = new ArrayList<Cash>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.cards.size() + this.monies.size();
    }

    public void addItem(IScan card) {
        this.cards.add(card);
    }

    public void addItem(Cash cash){
        this.monies.add(cash);
    }
}
