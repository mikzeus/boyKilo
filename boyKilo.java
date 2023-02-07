import java.util.Scanner;

public class boyKilo {
    public static void main(String[] args) {

        double boy;
        double kilo;
        Scanner inp= new Scanner(System.in);

        System.out.println("lutfen kilonuzu giriniz: ");
        kilo=inp.nextDouble();

        System.out.println("Lutfen Boy olcusunu giriniz: ");
        boy=inp.nextDouble();

        System.out.println("Vucut kitle indexiniz= " + kilo / ( boy*boy));

    }
}
