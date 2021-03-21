/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author jorda
 */
public class Book extends Publication{
    protected String author;
    
    public Book(String authArg, String titleArg, double priceArg, int copyArg){
        this.author = authArg;
        this.title = titleArg;
        this.price = priceArg;
        this.copies = copyArg;
    }
    
    public void orderCopies(int numCopies){
        this.copies += numCopies;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Override
    public String toString(){
        return "Author: " + author + "\n" +
                "Title: " + title + "\n"
                + "Price: " + price + "\n"
                + "Copies: " + copies;
    }
}
