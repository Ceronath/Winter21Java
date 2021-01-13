/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.q6;

/**
 *
 * @author jorda
 */
public class Person {
    public static String firstName;
    public static String lastName;
    private static int social;
    
    public Person(){
        
    }
    
    public Person(String firstArg, String lastArg, int socialArg){
        firstName = firstArg;
        lastName = lastArg;
        social = socialArg;
                
    }
    
    public String getFirst(){
        return this.firstName;
    }
    void setFirst(String firstNameArg){
        this.firstName = firstNameArg;
    }
    public String getLast(){
        return this.lastName;
    }
    void setLast(String lastNameArg){
        this.lastName = lastNameArg;
    }
    public int getSocial(){
        return this.social;
    }
    void setSocial(int socialArg){
        this.social = socialArg;
    }
    @Override
    public String toString(){
        return "First name : " + firstName + "\n"
                + "Last name : " + lastName + "\n"
                + "Social : " + social + "\n";                
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        
        if(! (o instanceof Person))
            return false;
        
        Person p = (Person) o;
        if( p.firstName == this.firstName && p.lastName == this.lastName && p.social
                == this.social){
            return true;
        }
        else return false;
    }
}
