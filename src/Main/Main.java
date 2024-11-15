package Main;

import BehavioralPatterns.Iterator.*;


public class Main {
    
    public static void main(String[] args){
        
        Library myLibrary = new Library(3);
        myLibrary.addBook(new Book("The little Prince"));
        myLibrary.addBook(new Book("One hundred years of solitude"));
        myLibrary.addBook(new Book("War and peace"));
        
        Iterator<Book> orderedBookIterator = myLibrary.createOrderedIterator(0);
        
        while(orderedBookIterator.hasNext()){
            System.out.println(orderedBookIterator.next().getTitle());
        }
        
    }
 
}