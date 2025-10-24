package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 4;
        int j = 6;
        int k = 8;
        int min = i;
        if (j < min) min = j;
        if (k < min) min = k;

        int max = i;
        if (j > max) max = j;
        if (k > max) max = k;

        System.out.println("Minimum:i" + min);
        System.out.println("Maximum:k" + max);
    }
}

