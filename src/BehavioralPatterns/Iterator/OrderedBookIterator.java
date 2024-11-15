package BehavioralPatterns.Iterator;

public class OrderedBookIterator implements Iterator<Book>{

    private Book[] books;
    private int position = 0;
    
    public OrderedBookIterator(Book[] books, int initialPosition){
        this.books = books;
        this.position = initialPosition;
    }
    
    @Override
    public boolean hasNext() {
        return position < books.length && books[position] != null;
    }

    @Override
    public Book next() {
        return books[position++];
    }

    
    
    
    
}
