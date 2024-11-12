import java.math.BigInteger;

public class FirstTenNumbers {
    public static void main(String[] args) {

        BigInteger start = BigInteger.TEN.pow(49);
        BigInteger end = BigInteger.TEN.pow(50);


        BigInteger two = BigInteger.valueOf(2);
        BigInteger three = BigInteger.valueOf(3);


        int count = 0;


        for (BigInteger i = start; i.compareTo(end) < 0; i = i.add(BigInteger.ONE)) {

            if (i.mod(two).equals(BigInteger.ZERO) || i.mod(three).equals(BigInteger.ZERO)) {
                System.out.println(i);
                count++;

                if (count == 10) {
                    break;
                }
            }
        }
    }
}