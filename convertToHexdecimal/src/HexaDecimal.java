public class HexaDecimal {

    public static String decimalToHex(int decimal) {
        char[] hexDigits = "0123456789ABCDEF".toCharArray();  // Tableau des chiffres hexadécimaux

        if (decimal ==0){
            return"0";
        }

        StringBuilder hexaDecimal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexaDecimal.append(hexDigits[remainder]);
            decimal = decimal / 16;
        }
        return hexaDecimal.reverse().toString();
    }
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal = decimal / 2;
        }
        return binary.reverse().toString();
    }
    public static int binaryToDecimal(int binary) {
            int decimal = 0;
            String binaryString = Integer.toString(binary);
            if (binary == 0) {
                return 0;
            }
            for(int i =0; i< binaryString.length();i++){
                char bit = binaryString.charAt(binaryString.length()-1 - i);
                if(bit == '1') {
                    decimal += (int) Math.pow(2, i);
                }
            }
            return decimal;
    }

    public static void main(String[] args) {
        int decimalNumber = 42;
        String hexResult = decimalToHex(decimalNumber);
        String binaryResult = decimalToBinary(decimalNumber);
        System.out.println("Le nombre décimal " + decimalNumber + " en hexadécimal est : " + hexResult);
        System.out.println("Le nombre décimal " + decimalNumber + " en binaire est : " + binaryResult);

        int binaryNumber = 1010;  // Example binary number
        int decimalResult = binaryToDecimal(binaryNumber);
        System.out.println("Le nombre binaire " + binaryNumber + " en décimal est : " + decimalResult);
    }
}