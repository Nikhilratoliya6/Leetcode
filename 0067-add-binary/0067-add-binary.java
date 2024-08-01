import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Parse the binary strings 'a' and 'b' to BigInteger with radix 2 (binary)
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        
        // Add the two BigIntegers
        BigInteger num3 = num1.add(num2);
        
        // Convert the sum to a binary string with radix 2 (binary)
        String result = num3.toString(2);
        
        return result;
    }
}
