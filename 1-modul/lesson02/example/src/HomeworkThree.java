import java.util.Scanner;

public class HomeworkThree {
    public static void main(String[] args) {
        /*21.Uchta son berilgan.
        Agar berilgan sonlar o’sish tartibida bo’lsa, sonlarni ikkilantiring,
        aks holda sonlarni ishorasi o’zgaritirilsin.
        Yangi sonlarni ekranga chiqaring.
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("a=");
        a = scanner.nextInt();
        System.out.println("b=");
        b = scanner.nextInt();
        System.out.println("c=");
        c = scanner.nextInt();
        if ((a < b && b < c) || (c < b && b < a)) {
            a *= 2;
            b *= 2;
            c *= 2;
        }
        System.out.print(a + " , ");
        System.out.print(b + " , ");
        System.out.print(c + " , ");
        */
        /* 22. To’rtta son berilgan. Shu sonlar orasidan kattasini toping.(Math classi yordamisiz)
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, maxNum;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        maxNum = a;
        if (maxNum < b) {
            maxNum = b;
        } if (maxNum < c) {
            maxNum = c;
        } if (maxNum < d){
            maxNum = d;
        }
        System.out.println(maxNum);*/
        /*23. n soni berilgan. 1 dan n gacha bo’lgan sonlar orasida toq sonlarni va ularning yig’indisini ekranga chiqaring.
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int summa = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0){
                System.out.println(i);
                summa += i;
            }
        }
        System.out.println(summa);*/
        /*24. n soni berilgan. 1 dan n gacha bo’lgan sonlar orasidan
         3 ga bo’linadigan lekin 5 ga bo’linmaydigan sonlarni ekranga chiqaring.
         Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0){
                System.out.print(i + " , ");
            }
        }*/
        /*25. N soni berilgan. N dan 1 gacha sonlarni kamayish tartibida chiqaring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0  ; i--) {
            System.out.println(i);
        }
    }
        */
        /*26.Berilgan a sonni tub sonligini tekshiring.
        Yordam: Berilgan sonning bo’luvchilar soni topilsin. Shu sanoq 2 ta bo’lsa, tub son deyiladi
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sanoq = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sanoq++;
            }
        }
        if (sanoq == 2) {
            System.out.println("Bu son tub");
        } else {
            System.out.println("Bu son tub son emas");
        }
        */
        /*27. n soni berilgan. 1 dan n gacha tub sonlarni chiqaring.
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sanoq = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sanoq++;
            }
        }*/
        /*28.Kiritilgan n ga mos ravishda quyidagi shakllarni chiqaruvchi dastur tuzing.
Input:  n = 5
Output:
12345
1234
123
12
1
*/
        /*Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || i >= j){
                    System.out.println(j + " ");
                }
                System.out.println();
            }
        }*/


    }
}
