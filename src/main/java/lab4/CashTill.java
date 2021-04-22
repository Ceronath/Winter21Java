/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author jorda
 */
public class CashTill{
    
    private double total;
    
    CashTill(){
        total = 0;
    }
    
    
    public void sellItem(SaleableItem item){
        total = total + item.getPrice();
        item.sellCopy();
        
    }
}
