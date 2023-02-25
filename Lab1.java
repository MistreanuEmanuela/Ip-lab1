/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.masina;

/**
 *
 * @author My Pc
 */
abstract class masina{
    String nume;
    String culoare;
    private int km;
    String sofer;
    String[] pasageri;
    abstract void pass(String nume);
    abstract void sofer(String nume);
    abstract void specificatii();
}
class electrica extends masina{
    void electrica(String nume, String culoare, int km)
    {
        this.nume=nume;
        this.culoare=culoare;
        this.km=km;
    }
    void pass(String nume)
    {
        this.pasageri[1]=nume;
    }
    void sofer(String nume)
    {
        this.sofer=nume;
    }
    void specificatii()
    {
        System.out.println(nume);
        System.out.println(culoare);
        System.out.println(sofer);
        System.out.println(km);
        
    }
}

class combustibil extends masina{
    void combustibil(String nume, String culoare, int km)
    {
        this.nume=nume;
        this.culoare=culoare;
        this.km=km;
    }
    void pass(String nume)
    {
        this.pasageri[1]=nume;
    }
    void sofer(String nume)
    {
        this.sofer=nume;
    }
    void verificaSofer()
    {
        System.out.println(sofer);
    }
    void verificaSofer(String nume)
    {
        if(nume.equals(sofer))
            System.out.println("Da!");
        else
            System.out.println("Nu!");
    }
}

public class Masina {

    public static void main(String[] args) {
        masina f = new electrica("ana", "verde", 100);
        masina g = new electrica("bogdan", "negru", 200);
        masina f = new combustibil("ion", "verde", 100);
        masina g = new combustibil("ilie", "negru", 200);
        f.pass("aa");
        f.pass("bba");
        f.pass("cca");
        g.pass("a");
        g.pass("b");
        f.sofer("eu");
        g.sofer("tu");
        f.specificatii();
    }
}
