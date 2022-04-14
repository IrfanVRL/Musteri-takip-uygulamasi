/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musteri_takip_uygulamasi;

/**
 *
 * @author irfan
 */
public class NodeClient {
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urunAdi;
    
    NodeClient next;
    NodeClient prev;

    public NodeClient(int id, String ad, String soyad, String tel, String adres, String urunAdi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.adres = adres;
        this.urunAdi = urunAdi;
        next = null;
        prev = null;
        
    }

        
    

}
