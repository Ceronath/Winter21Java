/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Date;
/**
 *
 * @author jorda
 */
public class Magazine extends Publication{
    protected int orderQty = 10;

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public Date getCurrIssue() {
        return currIssue;
    }

    public void setCurrIssue(Date currIssue) {
        this.currIssue = currIssue;
    }
    protected Date currIssue;
    
    public Magazine(){
        
    }
    
    public Magazine(String title, double price, int orderQty, Date curIssue, int copies){
        this.title = title;
        this.price = price;
        this.orderQty = orderQty;
        this.currIssue = curIssue;
        this.copies = copies;
    }
    
    public void adjustQty(int n){
        this.orderQty = n;
    }
    
    public void receiveNewIssue (Date newIssue){
        this.currIssue = newIssue;
    }
    
    @Override
    public String toString(){
        return "Title: " + title + "\n"
        + "Price: " + price + "\n"
        + "Order Quantity: " + orderQty + "\n"
        + "Current Issue: " + currIssue + "\n"
        + "Copies: " + copies;
    }
}
