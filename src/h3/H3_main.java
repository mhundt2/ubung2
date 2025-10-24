package h3;

public class H3_main {
    public static void main(String[] args) {

      int i = 210;
      int j = 102;
      int k = -10;

      boolean ausdruck1 = i > j;
      boolean ausdruck2 = i > 200;
        boolean ausdruck3 = j > 100;
        if (ausdruck1 && !ausdruck2 && !ausdruck3) {
            k = 1;
        } else if (ausdruck1 && ausdruck2 && !ausdruck3) {
            k = 2;
        } else if (ausdruck1 && ausdruck2 && ausdruck3) {
            k = 3;
        } else if (!ausdruck1 && !ausdruck2 && !ausdruck3) {
            k = 4;
        }
System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
}
