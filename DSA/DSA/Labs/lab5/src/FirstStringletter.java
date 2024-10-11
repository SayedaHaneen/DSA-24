public class FirstStringletter {
        public static char firstSingleLetter(final char text[], final int n) {
            for (int i = 0; i < n; i++) {
                boolean isUnique = true;
                for (int j = 0; j < n; j++) {
                    if (i != j && text[i] == text[j]) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    return text[i];
                }
            }
            return '\0'; // Return null character if no unique letter is found
        }

        public static void main(String[] args) {
            char[] text = {'A', 'B', 'C', 'A', 'B', 'D', 'E'};
            int n = text.length;
            char result = firstSingleLetter(text, n);
            if (result != '\0') {
                System.out.println("The first single letter is: " + result);
            } else {
                System.out.println("No single letter found.");
            }
        }
    }
