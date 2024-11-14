public class MyResult {
    public static boolean PrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }


    public static boolean PalindromeWord(String str) {
        if (str == null) return false;
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
}
