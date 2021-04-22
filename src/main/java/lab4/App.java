/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import lab3.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
/**
 *
 * @author jorda
 */
public class App {
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Magazine> magazines = new ArrayList<Magazine>();
    ArrayList<DiscMag> discmags = new ArrayList<DiscMag>();
    ArrayList<SaleableItem> items = new ArrayList<SaleableItem>();
    CashTill till = new CashTill();
   
    private boolean loop = true;
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "1. Add Book\n"
            + "2. Remove Book\n"
            + "3. List Books\n"
            + "4. Add Magazine\n"
            + "5. List Magazines\n"
            + "6. Add Disc Magazine\n"
            + "7. List Disc Magazines\n"   
            + "8. Sell Item(s)\n"
            + "9. Add to cart\n"
            + "9. Quit";
    
    public void run(){
        out.println("Test.");
        while(loop == true){
            out.println(menu);
            
            int choice;
            try{
                choice=input.nextInt();
            } catch (Exception e){
                out.println("Input incorrect.");
                continue;
            }
            
            switch(choice){
                case 1: addBook();
                        break;
                case 2: deleteBook();   
                        break;
                case 3: listBooks();
                        break;
                case 4: addMagazine();
                        break;
                case 5: listMagazines();
                        break;
                case 6: addDiscMag();
                        break;
                case 7: listDiscMags();
                        break;
                case 8: sellItems();
                        break;
                case 9: loop = false;
                        break;
                default: out.println("Input incorrect. Try again.");
            }
        }
        
    }
    
   
    
    private void sellItems(){
        for(SaleableItem item:items){
            till.sellItem(item);
        }
    }
    
    private void listDiscMags(){
        int index = 0;
        for(DiscMag d:discmags){
            out.println("Magazine number " + index);
            
            out.println("Title: ");
            out.println(discmags.get(index).getTitle());
            
            out.println("Price: ");
            out.println(discmags.get(index).getPrice());
            
            out.println("Quantity ordered: ");
            out.println(discmags.get(index).getOrderQty());
            
            out.println("Date of issue: ");
            out.println(discmags.get(index).getCurrIssue());
            
            out.println("# of copies: ");
            out.println(discmags.get(index).getCopies());
        }
    }
    
    private void addDiscMag(){
        input = new Scanner(System.in);
        String titleChoice;
        double priceChoice;
        int qtyChoice;
        Date dateChoice;
        int copyChoice;
        
        out.println("Title: ");
        titleChoice = input.nextLine();
        
        out.println("Price: ");
        priceChoice = input.nextDouble();
        
        out.println("Quantity Ordered: ");
        qtyChoice = input.nextInt();
        
        out.println("Enter YYYY, MM, DD for current issue in 3 separate inputs: ");
        dateChoice = new Date(input.nextInt(), input.nextInt(), input.nextInt());
        
        out.println("Copies: ");
        copyChoice = input.nextInt();
        
        DiscMag discmag = new DiscMag(titleChoice, priceChoice, qtyChoice, dateChoice, copyChoice);
        discmags.add(discmag);
    }
    
    private void listMagazines(){
        int index = 0;
        for(Magazine m:magazines){
            out.println("Magazine number: " + index);
            
            out.println("Title: ");
            out.println(magazines.get(index).getTitle());
            
            out.println("Price: ");
            out.println(magazines.get(index).getPrice());
            
            out.println("Quantity ordered: ");
            out.println(magazines.get(index).getOrderQty());
            
            out.println("Date of issue: ");
            out.println(magazines.get(index).getCurrIssue());
            
            out.println("# of copies: ");
            out.println(magazines.get(index).getCopies());
        }
    }
    
    private void listBooks(){
        int index = 0;
        for(Book b:books){
            out.println("Book #: " + index);
            
            out.println("Author: ");
            out.println(books.get(index).getAuthor());
            
            out.println("Title: ");
            out.println(books.get(index).getTitle());
            
            out.println("Price: ");
            out.println(books.get(index).getPrice());
            
            out.println("Copies: ");
            out.println(books.get(index).getCopies());
        }
    }
    
    private void addBook() {        
        input = new Scanner(System.in);
        String authChoice;
        String titleChoice;
        int copyChoice;
        double priceChoice;
        
        
        out.println("Author: "); 
        authChoice = input.nextLine();
        
        out.println("Title:  ");
        titleChoice = input.nextLine();
        
        out.println("Price: ");
        priceChoice = input.nextDouble();
        
        out.println("Copies: ");
        copyChoice = input.nextInt(); 
        
        
        Book book = new Book(authChoice, titleChoice, priceChoice, copyChoice);
        books.add(book);
        
        }
    
    private void deleteBook(){
        int delChoice;
        for(int i = 0; books.get(i) != null; i++){
            out.println("Book number " + i);
            
            out.println("Author: ");
            out.println(books.get(i).getAuthor());

            out.println("Price: ");
            out.println(books.get(i).getPrice());
                
            out.println("Copies: ");
            out.println(books.get(i).getCopies());
        }
        out.println("Please enter which book to delete: ");
        delChoice = input.nextInt();
        books.remove(delChoice);
    }
    
    private void addMagazine(){
        input = new Scanner(System.in);
        String titleChoice;
        double priceChoice;
        int qtyChoice;
        Date dateChoice;
        int copyChoice;
        
        out.println("Title: ");
        titleChoice = input.nextLine();
        
        out.println("Price: ");
        priceChoice = input.nextDouble();
        
        out.println("Quantity Ordered: ");
        qtyChoice = input.nextInt();
        
        out.println("Enter YYYY, MM, DD for current issue in 3 separate inputs: ");
        dateChoice = new Date(input.nextInt(), input.nextInt(), input.nextInt());
        
        out.println("Copies: ");
        copyChoice = input.nextInt();
        
        Magazine magazine = new Magazine(titleChoice, priceChoice, qtyChoice, dateChoice, copyChoice);
        magazines.add(magazine);
    }
    
    
}
