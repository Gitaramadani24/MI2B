/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class KelasInput {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nama : ");
        Person P = new Person();
        P.setNama(sc.nextLine());
        System.out.println("nama saya adalah " + P.getNama());
    }
}
