import javax.jws.Oneway;
import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
        /* 11. Uch xonali son berilgan. Uni raqamlar yig’indisini aniqlovchi programma tuzilsin.

        Scanner scanner = new Scanner(System.in);
        int a, qoldiq = 0;
        System.out.println("3 xonali son kiriting: ");
        a = scanner.nextInt();
        while (a > 0) {
            qoldiq += a % 10;
            a = a / 10;
        }
        System.out.println("Raqamlar yig'indisi: " + qoldiq);
         */
        /* 12. Uch xonali son berilgan.
        Uni raqamlarini teskari tartibda yozishdan hosil bo’lgan sonni aniqlovchi programma tuzilsin. (Masalan: input - 123, output - 321)
         Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("3 xonali son kiriting: ");
        a = scanner.nextInt();
        int birlar, onlar, yuzlar;
        birlar = a / 1 % 10;
        onlar = a / 10 % 10;
        yuzlar = a / 100 % 10;
        System.out.print(birlar);
        System.out.print(onlar);
        System.out.print(yuzlar);
         */
        /* 13. Uch xonali son berilgan. Uni o’ngdan birinchi raqamni o’chirib, chap tarafiga yozishdan hosil bo’lgan sonni aniqlovchi programma tuzilsin.
         (Masalan: input - 473, output - 347)
         Scanner scanner = new Scanner(System.in);
        System.out.println("3 xonali son kiriting: ");
        int son;
        son = scanner.nextInt();
         */
        /* 14.
         */
        /*15. Foydalanuvchi tomonidan kiritilgan a sonining kubini xisoblovchi dastur tuzilsin.
        (Math classi orqali)

        Scanner scanner = new Scanner(System.in);
        double a,aCube;
        System.out.println("a = ");
        a = scanner.nextInt();
        aCube = Math.pow(a,3);
        System.out.println("a^3 = " + aCube);
        */
        /*Berilgan 2 xonali sonda 3 raqami ishtirok etgan bo’lsa,
        ha 3 bor aks holda 3 raqami yo’q degan yozuvni ekranga chiqaring.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        if (a / 10 == 3 || a % 10 == 3) {
            System.out.println("Ha");
        } else {
            System.out.println("Yo'q");
        }
        */
        /*17. Ikkita butun son berilgan.
         Berilgan sonlar orasida kattasini aniqlovchi programma tuzilsin.(Math classi yordamisiz)
         Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        if (a > b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
         */
        /*18. Butun son berilgan. Agar son musbat bo’lsa 15 martaga oshiring,
         manfiy bo’lsa absolut qiymatini (ya’ni modulini),
        aks holda berilgan sonning o’zini ekranga chiqaruvchi dastur tuzing.

        Scanner scanner = new Scanner(System.in);
        double a;
        System.out.println("a = ");
        a = scanner.nextInt();
        if (a > 0){
            System.out.println(Math.pow(a,15));
        }else if (a < 0){
            System.out.println(Math.abs(a));
        }
        else {
            System.out.println(a);
        }
        */
        /*19.5 ta butun son berilgan.
        Berilgan sonlar orasida nechta juft va nechta toq son borligini aniqlovchi programma tuzilsin.
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d,e;
        int sanoqJuft = 0, sanoqToq = 0;
        System.out.println("a=");
        a = scanner.nextInt();
        System.out.println("b=");
        b = scanner.nextInt();
        System.out.println("c=");
        c = scanner.nextInt();
        System.out.println("d=");
        d = scanner.nextInt();
        System.out.println("e=");
        e = scanner.nextInt();

        if (a % 2 == 0){
            sanoqJuft++;
        }else{
            sanoqToq++;
        }
        if (b % 2 == 0){
            sanoqJuft++;
        }else{
            sanoqToq++;
        }
        if (c % 2 == 0){
            sanoqJuft++;
        }else{
            sanoqToq++;
        }
        if (d % 2 == 0){
            sanoqJuft++;
        }else{
            sanoqToq++;
        }
        if (e % 2 == 0){
            sanoqJuft++;
        }else{
            sanoqToq++;
        }
        System.out.println("Juft sonlar: " + sanoqJuft + " ta");
        System.out.println("Toq sonlar: " + sanoqToq + " ta");
        */
        /*20.Imtihondan olingan ball kiritilsa uning bahosini aniqlovchi dastur tuzing.
         Bunda 0-54 2 baho, 55-70 3 baho, 71-84 4 baho, 85-100 5 baho ga teng.
         Scanner scanner = new Scanner(System.in);
        int baho;
        System.out.println("Enter grade: ");
        baho = scanner.nextInt();
        if(baho > 0 && baho <= 54){
            System.out.println(" 2 baho ");
        }else if(baho > 54 && baho <= 70){
            System.out.println(" 3 baho ");
        }
        else if(baho > 70 && baho <= 84){
            System.out.println(" 4 baho ");
        }
        else if(baho > 84 && baho <= 100){
            System.out.println(" 5 baho ");
        }else{
            System.out.println("Siz noto'g'ri ball kiritdingiz!");
        }
         */

    }
}
