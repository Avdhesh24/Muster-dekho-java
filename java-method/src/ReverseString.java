public class ReverseString {
        public static String reverse(String str) {
            if (str.isEmpty()) {
                return str;
            }
            return reverse(str.substring(1)) + str.charAt(0);
        }

        public static void main(String[] args) {
            String str = "Muster Dekho"; // Example string
            System.out.println("Reversed string: " + reverse(str));
        }
    }
