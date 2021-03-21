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
public class Publication {
    protected String title;
    protected double price;
    protected int copies;

    public Publication(){
        
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getCopies() {
        return copies;
    }
    
    public void sellCopy(int copiesArg){
        copiesArg--;
    }
    
    @Override
    public String toString(){
        return "Title: " + title + "\n"
        + "Price: " + price + "\n"
        + "Copies: " + copies;
    }
}
