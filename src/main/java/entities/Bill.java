/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author jose
 */
public class Bill {
    
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;
    
    public double consumo(){
        
        if (gender == 'F'){
            return ((beer * 5) + (barbecue * 7) + (softDrink * 3));
        }else{
            return ((beer * 5) + (barbecue * 7) + (softDrink * 3));
        }
        
    }
    
    public double couvert(){
        if (consumo() < 30){
            return 4.00;
        }else{
            return 0.00;
        }
    }
    
    public double ingresso(){
        if(gender == 'F'){
            return 8.00;
        }else{
            return 10.00;
        }
    }
    
    public double total(){
        return consumo() + couvert() + ingresso(); 
    }
}
