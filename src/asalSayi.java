import java.util.Scanner;
public class asalSayi {

    static Scanner input= new Scanner(System.in);
    static  boolean asalmi(int a, int b){
        if (a<2){
            return false;

        }
        if (b==0){
            return true;

        }
        if (a%b==0){
            return false;
        }
        if (b * b > a){
            return true;
        }
        return asalmi(a,b+1);

    }
    public static void main(String[] args) {
        System.out.print("sayıyı giriniz:");
        int a= input.nextInt();
        if (asalmi(a,2)){
            System.out.println( a +" asal sayıdır");

        }else
            System.out.println( a + " asal sayı değildir");


    }

}
