/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import lab3.*;
import java.util.Date;
/**
 *
 * @author jorda
 */
public class DiscMag extends Magazine {
    
    public DiscMag(){
        
    }
    
    public DiscMag(String title, double price, int orderQty, Date currIssue, int copies){
        super(title, price, orderQty, currIssue, copies);
        this.title = title;
        this.price = price;
        this.orderQty = orderQty;
        this.currIssue = currIssue;
        this.copies = copies;
    }


}


