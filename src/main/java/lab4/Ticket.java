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
public class Ticket implements SaleableItem {
    private double price;
    
    @Override
    public void sellCopy(){
        System.out.println("Print ticket.");
    }
    @Override
    public double getPrice(){
        return price;
    }
}
