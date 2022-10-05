/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author udaxd
 */
public class Cat extends Animal {
    private String warna,jenis;
    public Cat (){
       warna ="Hitam";
       jenis ="Anggora";
    }
    public Cat(String color, String type){
       this.warna = color;
       this.jenis = type
    }

    @Override
    public void Sound() {
        System.out.println("Meoww"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cat{" + "warna=" + warna + ", jenis=" + jenis + '}';
    }
    
    
    
}
