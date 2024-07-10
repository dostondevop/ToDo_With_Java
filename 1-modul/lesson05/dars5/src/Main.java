public class Main {
    public static void main(String[] args) {
        /*
         String 2 xil usulda yaratiladi
         1.Literal ko'rinishda
         2. Obyekt ko'rinishda
         */
        /*String s = "Hello";
        String s1 = new String("Java");
        System.out.println(s);
        System.out.println(s1);
        String s4 = new String("PDP");
        String s5 = new String("PDP");
        System.out.println(s4.equals(s5));
        */
        long startTime = System.nanoTime();
        StringBuffer  sb = new StringBuffer("PDP");
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello");
        }
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println((double) time / 100000);

    }
}