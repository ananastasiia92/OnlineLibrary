package Generic.OnlineLibrary;

public class Book <T>{
    private T nameBook;
    private String writer;
    private LibraryCard<Integer, String> libraryCard;
    private Boolean isPlace;

    public Book (T nameBook, String writer, LibraryCard<Integer, String> libraryCard, Boolean isPlace){
        this.nameBook = nameBook;
        this.writer = writer;
        this.libraryCard = libraryCard;
        this.isPlace = true;
    }

    public T getNameBook() {
        return nameBook;
    }

    public String getWriter() {
        return writer;
    }

    public LibraryCard<Integer, String> getLibraryCard() {
        return libraryCard;
    }

    public Boolean getIsPlace() {
        return isPlace;
    }

    public void setIsPlace() {
        this.isPlace = false;
    }
    

    @Override
    public String toString() {
        return "Book [nameBook=" + nameBook + ", writer=" + writer + ", libraryCard=" + libraryCard + "]";
    }

    

    
}
