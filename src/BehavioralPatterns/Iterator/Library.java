package BehavioralPatterns.Iterator;

public class Library implements InformationNetwork{

    private Book[] books;
    private int index;
    
    public Library(int size){
        books = new Book[size];
    }
    
    public void addBook(Book book){
        if(index < books.length){
            books[index++] = book;
        }
    }
    
    @Override
    public Iterator createOrderedIterator(int initialPosition) {
        return new OrderedBookIterator(books,initialPosition);
    }
    
}
