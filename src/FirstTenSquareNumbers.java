import java.math.BigInteger;

public class FirstTenSquareNumbers {
    public static void main(String[] args) {

        BigInteger maxLongValue = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger sqrtMaxLongValue = maxLongValue.sqrt();


        BigInteger current = sqrtMaxLongValue.add(BigInteger.ONE);
        int count = 0;

        while (count < 10) {
            BigInteger square = current.pow(2);
            System.out.println(square);
            current = current.add(BigInteger.ONE);
            count++;
        }
    }
}