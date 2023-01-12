/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.curso;


import entities.Bill;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Curso {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Bill bill = new Bill();
        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);
        System.out.println("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.println("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.println("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();
        
        System.out.println("");
        System.out.println("RELATÓRIO: ");
        System.out.printf("Consumo = R$ %.2f\n",bill.consumo());
        
        if (bill.couvert() == 0.00){
            System.out.println("Isento de Couvert");
        }else{
            System.out.printf("Couvert = R$ %.2f\n",bill.couvert());
        }
        
        System.out.printf("Ingresso = R$ %.2f\n",bill.ingresso());
        System.out.println("");
        System.out.printf("Valor a pagar = R$ %.2f",bill.total());

        sc.close();
        
    }
}
