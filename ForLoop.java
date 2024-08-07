public class ForLoop {
        public static void main(String[] args) {

            int[] numbers = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

            for (int number : numbers) {
                if (number == 5) {
                    continue;
                }

                if (number == 10) {
                    break;
                }

                System.out.println("Number: " + number);
            }

            System.out.println("Loop ended.");
        }
    }
