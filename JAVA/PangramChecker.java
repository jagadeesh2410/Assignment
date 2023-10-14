public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; 
        boolean isPangram = checkIfPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String str) {
        str = str.toLowerCase(); 
        boolean[] alphabet = new boolean[26]; 

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
