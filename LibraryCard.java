package Generic.OnlineLibrary;

import java.util.ArrayList;

public class LibraryCard <K, V>{
    private K card;
    private V infoBook;

    public LibraryCard(K card, V infoBook) {
        this.card = card;
        this.infoBook = infoBook;
    }

    public K getCard() {
        return card;
    }

    public void setCard(K card) {
        this.card = card;
    }

    public V getInfoBook() {
        return infoBook;
    }

    public void setInfoBook(V infoBook) {
        this.infoBook = infoBook;
    }

    @Override
    public String toString() {
        return "LibraryCard [card=" + card + ", infoBook=" + infoBook + "]";
    }
    
}
