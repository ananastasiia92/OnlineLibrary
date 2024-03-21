package Generic.OnlineLibrary;

import java.util.ArrayList;
import java.util.List;

public class Library <T, K, V>{

    private List<Book<T>> catalog;
    private List<LibraryCard<K, V>> list;

    public Library() {
        catalog = new ArrayList<>();
        // Список книг в библиотеке.
        list = new ArrayList<>();
        // Список библиотечных карточек в библиотеке.
    }
    // Добавление книги в список книг.
    public void addBook(Book<T> book) {
        catalog.add(book);
    }
    // Добавление библиотечных карточек в список.
    public void displayLibraryCard(LibraryCard<K, V> libraryCard) {
        list.add(libraryCard);
    }
    
    public void genaNaBook(int num) {
        Boolean isFind = true;
        for (Book<T> book : catalog) {
            if (book.getLibraryCard().getCard() == num) {
                // System.out.println("Выдана книга: " + book);
                isFind = false;
                book.setIsPlace();
            }
        }
        if (isFind) {
            System.out.println("Книга не найдена.");
        }
    }

    public void displayBooks() {
        System.out.println("Выданные книги: \n");
        for (Book<T> book : catalog) {
            // System.out.println(book.getIsPlace());
            if (!book.getIsPlace()) {
                System.out.println(book);
            }
        }
    }
    @Override
    public String toString() {
        return "Library [catalog=" + catalog + ", list=" + list + "]";
    }
    public List<Book<T>> getCatalog() {
        return catalog;
    }
    public List<LibraryCard<K, V>> getList() {
        return list;
    }

}
