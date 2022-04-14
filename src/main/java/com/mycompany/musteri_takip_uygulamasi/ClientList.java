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
public class ClientList {

    Scanner sc = new Scanner(System.in);

    NodeClient head = null;
    NodeClient tail = null;
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urunAdi;

    void ekle() {
        System.out.println("id :");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("ad :");
        ad = sc.nextLine();
        System.out.println("Soyad :");
        soyad = sc.nextLine();
        System.out.println("tel :");
        tel = sc.nextLine();
        System.out.println("adres :");
        adres = sc.nextLine();
        System.out.println("urun adi :");
        urunAdi = sc.nextLine();

        NodeClient newNode = new NodeClient(id, ad, soyad, tel, adres, urunAdi);

        if (head == null) {
            head = newNode;
            tail = newNode;
            System.out.println("liste olusturuldu musteri eklendi");
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            System.out.println(id + "numarali musteri kaydedildi");
        }
    }

    void sil() {
        boolean sonuc = false;
        if (head == null) {
            System.out.println("liste bos");

        } else {
            System.out.println("silincek msuteri id :");
            id = sc.nextInt();
            if (head.next == null && head.id == id) {
                head = null;
                tail = null;
                System.out.println(id + " numarali musteri silindi");
                sonuc = true;

            } else if (head.next != null && head.id == id) {
                head = head.next;
                head.prev = null;
                System.out.println(id + " numarali musteri silindi");
                sonuc = true;

            } else if (tail.id == id) {
                tail = tail.prev;
                tail.next = null;
                System.out.println(id + " numarali musteri silindi");
                sonuc = true;

            } else {
                NodeClient temp = head;
                while (temp != null) {
                    if (temp.id == id) {
                        temp.next.prev = temp.prev;
                        temp.prev.next = temp.next;
                        break;
                    }
                    temp = temp.next;
                    sonuc = true;

                }
            }

        }
        if (!sonuc) {
            System.out.println(id + " numarali musteri yok");
        }

    }

    void guncelle() {
        boolean sonuc = false;
        if (head == null) {
            System.out.println("liste bos");

        } else {
            System.out.println("guncellenecek musteri id :");
            id = sc.nextInt();

            NodeClient temp = head;
            while (temp != null) {
                if (temp.id == id) {
                    System.out.println(id + " numaali musteri bilgileri");
                    System.out.println("ad : " + temp.ad);
                    System.out.println("Soyad : " + temp.soyad);
                    System.out.println("tel : " + temp.tel);
                    System.out.println("adres : " + temp.adres);
                    System.out.println("urun : " + temp.urunAdi);
                    System.out.println("yeni urun adini giriniz :");
                    sc.nextLine();
                    urunAdi = sc.nextLine();
                    System.out.println("guncellendi");
                    sonuc = true;
                    break;

                }
                temp = temp.next;
                sonuc = true;

            }

        }
        if (!sonuc) {
            System.out.println(id + " numarali musteri yok");
        }
    }

    void musteriAra() {
        boolean sonuc = false;
        if (head == null) {
            System.out.println("liste bos");

        } else {
            System.out.println("aradiginiz musteri id :");
            id = sc.nextInt();

            NodeClient temp = head;
            while (temp != null) {
                if (temp.id == id) {
                    System.out.println(id + " numaali musteri bilgileri");
                    System.out.println("ad : " + temp.ad);
                    System.out.println("Soyad : " + temp.soyad);
                    System.out.println("tel : " + temp.tel);
                    System.out.println("adres : " + temp.adres);
                    System.out.println("urun : " + temp.urunAdi);
                    System.out.println("yeni urun adini giriniz :");
                    urunAdi = sc.nextLine();
                    System.out.println("guncellendi");
                    sonuc = true;
                    break;

                }
                temp = temp.next;
                sonuc = true;

            }

        }
        if (!sonuc) {
            System.out.println(id + " numarali musteri yok");
        }
    }

    void musterileriListele() {

        if (head == null) {
            System.out.println("liste bos");

        } else {
            System.out.println("numara\nad\nsoyad\ntel\nadres\nurun adi");
            id = sc.nextInt();

            NodeClient temp = head;
            while (temp != null) {

                System.out.println(temp.id + "\t" + temp.ad + "\t" + temp.soyad + "\t" + temp.tel + "\t" + temp.adres + "\t" + temp.adres);
                temp = temp.next;

            }

        }

    }

}
