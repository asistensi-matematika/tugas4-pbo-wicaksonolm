
package asis4mek;

import asis4mek.segitiga.JenisSegitiga;
import java.util.Scanner;

public class Asis4mek {

    public static void main(String[] args) {

        BangunDatar a;
        a=new BangunDatar();
        Scanner input=new Scanner(System.in);
        System.out.print("1.Persegi\n2.Lingkaran\n3.Segitiga\n"
                + "masukan pilihan anda :");
                a.jenis=input.nextLine();
                if("1".equals(a.jenis)||"persegi".equals(a.jenis)||"Persegi".equals(a.jenis)){
                   a=new persegi();
                   a.view();
                   
                }
                else if("2".equals(a.jenis)||"lingkaran".equals(a.jenis)||"Lingkaran".equals(a.jenis)){
                   a=new lingkaran();
                   a.view();
                   
                }
                else if("3".equals(a.jenis)||"Segitiga".equals(a.jenis)||"segitiga".equals(a.jenis)){
                    a=new segitiga();
                    a.view();
                    
                   
                   
                }
                else{
                    a.view();
                }
    }
    
    
}

class BangunDatar{
protected String jenis;

    void view(){
        System.out.println("tidak ada pilihan");
    }
    
}
class lingkaran extends BangunDatar{
protected double jari2;
Scanner input=new Scanner(System.in);
double luas(double jari2){
        this.jari2=jari2;
        return 22/7*jari2*jari2;
    }
double keliling(double jari2){
        this.jari2=jari2;
        return 22/7*jari2*2;
    }
    @Override
    void view(){
        
        String name=this.getClass().getName();
        String nama=name.substring(name.lastIndexOf('.') + 1);
        System.out.println("masukan panjang jari jari anda: ");
        this.jari2=input.nextDouble();
        System.out.format("nama bangun datar adalah %s \nluasnya adalah:%.2f cm^2\nkeliling adalah:%.2f cm",nama,this.luas(jari2),this.keliling(jari2));
       
       
        
    }
}

class persegi extends BangunDatar{
protected double sisi;
Scanner input=new Scanner(System.in);
double luas(double sisi){
        this.sisi=sisi;
        return this.sisi*this.sisi;
    }
double keliling(double sisi){
        this.sisi=sisi;
        return this.sisi*4;
    }
    @Override
    void view(){
        String name=this.getClass().getName();
        String nama=name.substring(name.lastIndexOf('.') + 1);
        System.out.println("masukan panjang sisi anda: ");
        this.sisi=input.nextDouble();
        System.out.format("nama bangun datar adalah %s \nluasnya adalah:%.2f cm^2\nkeliling adalah:%.2f cm",nama,this.luas(sisi),this.keliling(sisi));
       
       
        
    } 
}

class segitiga extends BangunDatar{
protected double alas;
protected double tinggi;
String inn;
Scanner input=new Scanner(System.in);


double luas(double alas,double tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
        return 0.5*(alas*tinggi);
    }

    void view(){ 
         JenisSegitiga JS = new JenisSegitiga();
        System.out.print("pilih segitiga yang diinginkan :\n");
        System.out.print("1.Segitiga siku siku\n2.Segitiga sama sisi\n");
        System.out.print("masukan pilihan anda :");
        inn=input.nextLine();

        if("1".equals(inn)){
            System.out.print("masukan alas: ");
            JS.alas=input.nextDouble();
            System.out.print("masukan tinggi: ");
            JS.tinggi=input.nextDouble();
            JS.view(JS.SisiMiring(JS.tinggi,JS.alas));
            
            System.out.println("luas segitiga adalah "+luas(JS.alas,JS.tinggi));
            System.out.println("keliling segitiga adalah "+JS.Keliling(JS.alas,JS.tinggi));
        }
        else if("2".equals(inn)){
            System.out.print("masukan alas: ");
            JS.alas=input.nextDouble();
            System.out.print("masukan tinggi: ");
            JS.tinggi=input.nextDouble();
            JS.view(JS.SisiMiring(JS.tinggi,JS.alas));
            
            System.out.println("luas segitiga adalah "+luas(JS.alas,JS.tinggi));
            System.out.println("keliling segitiga adalah "+JS.Keliling(JS.alas,JS.tinggi));
        
        }
}
class JenisSegitiga extends segitiga{
    int a,b;
    JenisSegitiga(){
    super.alas=a;
    super.tinggi=b;
    }
double SisiMiring(double tinggi,double alas){
    super.tinggi=tinggi;
    super.alas=alas;
    return Math.sqrt((Math.pow(this.alas,2))+(Math.pow(this.tinggi,2)));
}

double Keliling(double sisi){
    
    return (sisi*sisi)+this.tinggi;
}

double Keliling(double tinggi ,double alas){
super.tinggi=tinggi;
super.alas=alas;
return SisiMiring(tinggi,alas)+tinggi+alas;
}
    
void view(double sisi){
    
System.out.print("jenis segitiga adalah segitiga sama kaki\n");
    
}
void view(double tinggi ,double alas){
System.out.print("jenis segitiga adalah segitiga siku siku\n");
    
}

}

}
