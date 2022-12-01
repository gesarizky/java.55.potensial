
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class potensial {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai Massa Benda (m) ");
        System.out.println(" *************************************************************");

        double m = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Gravitasi (g) ");
        System.out.println(" ************************************************************* ");

        double g = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Ketinggian Benda (h) ");
        System.out.println(" ************************************************************* ");

        double h = sc.nextInt();

        double ep = m * g * h;

        System.out.println(" *********************************************************** ");
        System.out.println(" *Maka Nilai Energi Potensial = " + ep);
        System.out.println(" ********************************************************** ");
    }
}
