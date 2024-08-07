public class NewSwitchCase {
        public static void main(String[] args) {
            String day = "Sunday";

            String result = switch (day) {
                case "Saturday", "Sunday" -> "11am";
                case "Mon", "Tue" -> "9am";
                default -> "10am";
            };

            System.out.println("Opening time on " + day + ": " + result);
        }
    }

