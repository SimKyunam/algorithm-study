package step1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.*;

public class ADivB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a, b;
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        BigDecimal ba = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);

        System.out.println(ba.divide(bb, MathContext.DECIMAL128));
        System.out.println(a / b);
    }
}
