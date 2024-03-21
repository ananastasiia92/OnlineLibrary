package Generic.OnlineLibrary;
// Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. 
// Каждая книга должна содержать параметр типа T для ее названия.
// Создайте обобщенный класс LibraryCard<K, V>, который представляет 
// библиотечную карточку для определенной книги. 
// Каждая карточка должна содержать параметры типов K для номера карточки и V 
// для информации о книге.
// Создайте класс Library, который будет представлять библиотеку. 
// У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.
// Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.
public class Main {
    public static void main(String[] args) {
        Library<String, Integer, String> library = new Library<>();

        

        LibraryCard<Integer, String> libraryCard1 = new LibraryCard<>(001, "Книга о кошках.");
        LibraryCard<Integer, String> libraryCard2 = new LibraryCard<>(002, "Книга о собаках.");
        LibraryCard<Integer, String> libraryCard3 = new LibraryCard<>(003, "Книга о любви.");
        LibraryCard<Integer, String> libraryCard4 = new LibraryCard<>(004, "Книга о косметике.");

        
        library.addBook(new Book<>("Vii", "gogol", libraryCard1, true));
        library.addBook(new Book<>("", "Vaskin D.F.", libraryCard2, false));
        library.addBook(new Book<>("With Love", "Melko N.M.", libraryCard3, true));
        library.addBook(new Book<>("Aravia", "Baranova F.N.", libraryCard4, false));

        
        library.displayLibraryCard(libraryCard1);
        library.displayLibraryCard(libraryCard2);
        library.displayLibraryCard(libraryCard3);
        library.displayLibraryCard(libraryCard4);

        // System.out.println(library.getList().get(0));
        // for (LibraryCard<Integer, String> card : library.getList()) {
        // System.out.println(card);
        // }

        library.genaNaBook(4);
        library.genaNaBook(1);
        library.displayBooks();
    }
    
}
