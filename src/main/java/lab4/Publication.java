/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import lab3.*;

/**
 *
 * @author jorda
 */
abstract class Publication implements SaleableItem {
    protected String title;
    protected int copies;
    protected double price;

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

    public int getCopies() {
        return copies;
    }
    
    public abstract void sellCopy();
    public abstract double getPrice();
    
    
}
