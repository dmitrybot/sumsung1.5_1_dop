import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Double x, y;
        x = in.nextDouble();
        y = in.nextDouble();
        System.out.println(x < 2 && y > 0 && x * x + y * y > 4 && y < x ? "YES" : "NO");
    }
}
