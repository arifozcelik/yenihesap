package hesapmakinesi;

import java.util.Scanner;

public class hesapmakinesi {
    public static final double INCREMENT = 1E-4;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double sayi1,sayi2,kuvvet;
        Scanner input = new Scanner(System.in);
        System.out.println("İşlem Menüsü\n 1-Toplama \n 2-Çıkarma \n " +
                "3-Çarpma \n 4-Bölme \n 5-Üs Alma \n 6-Karekök Alma \n " +
                "7-Türev Alma \n 8-Mod Alma \n 9-Mutlak Değer Hesaplama");
        System.out.print("1-9 Arası Bir işlem seçiniz: ");
        int select = input.nextInt();
        switch (select){
            case 1:
                System.out.print("1.Sayıyı Giriniz: ");
                sayi1=input.nextDouble();
                System.out.print("2.Sayıyı Giriniz: ");
                sayi2=input.nextDouble();
                System.out.println("Toplam sonucu = " + (sayi1+sayi2) );
                break;
            case 2:
                System.out.print("1.Sayıyı Giriniz: ");
                sayi1=input.nextDouble();
                System.out.print("2.Sayıyı Giriniz: ");
                sayi2=input.nextDouble();
                System.out.println("Çıkarma sonucu = " + (sayi1-sayi2));
                break;
            case 3:
                System.out.print("1.Sayıyı Giriniz: ");
                sayi1=input.nextDouble();
                System.out.print("2.Sayıyı Giriniz: ");
                sayi2=input.nextDouble();
                System.out.println("Çarpma Sonucu = " + (sayi1*sayi2));
                break;
            case 4:
                System.out.print("1.Sayıyı Giriniz: ");
                sayi1=input.nextDouble();
                System.out.print("2.Sayıyı Giriniz: ");
                sayi2=input.nextDouble();
                System.out.println("Bölme Sonucu = " + (float)(sayi1/sayi2));
                break;
            case 5:
                System.out.print("1.Sayıyı Giriniz: ");
                sayi1=input.nextDouble();
                System.out.print("2.Sayıyı Giriniz: ");
                sayi2=input.nextDouble();
                double sonuc = Math.pow(sayi1,sayi2);
                System.out.println("Sonuc = " + sonuc);
                break;
            case 7:
                System.out.println("f(x)=c.x^n türevinin alımı..");
                System.out.print("Katsayı olan (c) sayıyıy giriniz: ");
                int katsayii = input.nextInt();
                if (katsayii == 0) {
                    System.out.println("f(x)="+katsayii+"*x^n ise f(x)=0");
                    System.out.println("f'(x)=0");
                }else{
                    System.out.print("Üs giriniz(n)= ");
                    int us=input.nextInt();
                    System.out.println("f(x)="+katsayii+"*x^"+us);
                    System.out.println("f'(x)="+(katsayii*us)+"*x^"+ (us-1));
                }
                break;
            case 8:
                System.out.print("ilk sayiyi giriniz: ");
                int a = input.nextInt();
                System.out.print("ikinci sayiyi giriniz: ");
                int b = input.nextInt();
                System.out.println("Mod İşlemi "+ mod(a,b));
        }

    }
    static int mod(int a,int b){
        return a % b;
    }
    }

