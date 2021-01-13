/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.q6;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorda
 */
public class App {
    ArrayList<Person> people = new ArrayList<>(); 
    private boolean loop = true;
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "1. Add a Person\n"
            + "2. List People\n"
            + "3. Delete a Person\n"           
            + "99. Exit";
    
    private void addPerson() {
        
        
        String stringChoice;
        int intChoice;
        
        Person person = new Person();
        
        out.println("First Name: "); 
        stringChoice = input.next();
        person.setFirst(stringChoice); 
        
        out.println("Last Name: ");
        stringChoice = input.next();
        person.setLast(stringChoice); 
        
        out.println("SIN: ");
        intChoice = input.nextInt();
        person.setSocial(intChoice); 
        
        people.add(person);
        
        }
    
    private void listPeople() {
        int index = 0;
        for(Person p:people) {
                out.println("Person number " + index);
            
                out.println("First name: ");
                out.println(people.get(index).getFirst());

                out.println("Last Name: ");
                out.println(people.get(index).getLast());
                
                out.println("Social: ");
                out.println(people.get(index).getSocial());
                index++;
            }
        }
    
    private void deletePerson(){
            int indexChoice;
            
            out.println("Which person do you want to delete?");
            indexChoice = input.nextInt();
            
            people.set(indexChoice, null);
            int carListLength = people.size() - 1;
            for(int i = 0; i<carListLength; i++){
                if (people.get(i) == null && people.get(i+1) !=null){
                    people.set(i, people.get(i + 1));
                    people.set(i+1, null);
                }
            }
        }
    public void run(){
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
                case 1: addPerson();
                        break;
                case 2: listPeople();   
                        break;
                case 4: deletePerson();
                        break;
                case 99: loop = false;
                        break;
                default: out.println("Input incorrect. Try again.");
            }
        }
    }
}
