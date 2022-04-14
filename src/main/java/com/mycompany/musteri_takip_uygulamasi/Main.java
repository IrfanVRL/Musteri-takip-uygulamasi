/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musteri_takip_uygulamasi;

import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClientList liste = new ClientList();

        int secim = -1;
        while (secim != 0) {
            System.out.println("1- ekle");
            System.out.println("2- sil");
            System.out.println("3- guncelle");
            System.out.println("4- musteri ara");
            System.out.println("5- yazdir");
            System.out.println("0- cikis");
            secim = sc.nextInt();
            sc.nextLine();

            switch (secim) {
                case 1:
                    liste.ekle();

                    break;
                case 2:
                    liste.sil();
                    break;
                case 3:
                    liste.guncelle();
                    break;
                case 4:
                    liste.musteriAra();
                    break;
                case 5:
                    liste.musterileriListele();
                    break;
                case 0 :
                    System.out.println("cikis yaptiniz");
                    break;
               
                    
                    
            }
        }
    }

}
