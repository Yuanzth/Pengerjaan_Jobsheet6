import java.util.Scanner;

public class Pemilihan2Percobaan202 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        double totalSudut, sudut1, sudut2, sudut3;
        System.out.println("Masukkan Sudut Pertama : ");
        sudut1 = input02.nextDouble();
        System.out.println("Masukkan Sudut Kedua : ");
        sudut2 = input02.nextDouble();
        System.out.println("Masukkan Sudut Ketiga : ");
        sudut3 = input02.nextDouble();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180)
        {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
            {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }
            else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60))
            {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            }
            else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1))
            {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            }
            else 
            {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        }
        else 
        {
            System.out.println("Bukan Segitiga");
        }

    }
}
