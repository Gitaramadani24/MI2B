/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

class Genshin {
  String username = "ai-chan";
  String cekGenshin() { 
    return "Ini berasal dari class Genshin"; 
  }
};
 
class Character extends Genshin {
  String chara1="Gita";
  String chara2="Gita";
  String cekCharacter() { 
    return "Ini berasal dari class Character"; 
  }
};
 
class Task1 {
  public static void main(String args[]){
    Character CharacterGita = new Character();
    Scanner input = new Scanner(System.in);
    int level;
    System.out.println(CharacterGita.username);
    System.out.print("masukkan level : ");
    level = input.nextInt();
    int n=4,i;
    
    if (level>=30){
        for(i=0;i<n;i++){
        System.out.println(CharacterGita.chara1);}
    }
    else{
        for(i=0;i<n;i++){
        System.out.println(CharacterGita.chara2);}
    }
    System.out.println(CharacterGita.cekGenshin());
    System.out.println(CharacterGita.cekCharacter());}
}