/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan53.rabbit;

/**
 *Nama  : Brigita Julia Puspita Nai Goncalves
 *Kelas : PBO2
 *NIM   : 1017074
 *Deskripsi Program : program ini berisi tentang profil dari seekor binatang
 */
public class PBO210117074Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter",false,"grass",4,"grey");
        System.out.println("Hello, his name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian? "+rabbit.isiVegetarian());
        System.out.println(rabbit.getName()+" eats "+rabbit.getEats());
        System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());
    }
    
}
