package Jan_10_2025;

public class Answer {
    public static void main(String[] args) {
        String[] exampleInput = { 
            "Level", 
            "Radar", 
            "Noon", 
            "Taco cat", 
            "Aibohphobia", 
            "Was it a car or a cat I saw?", 
            "Too bad I hit a boot", 
            "A Santa at NASA"
        };

        // Transforming the initial string to lowercase and removing special characters
        for (String input : exampleInput) {
            System.out.println(input + " isPalidrome = " + isPalindrome(input));
        }

        System.out.println("\n\n");

        // Transforming all characters in the string to lowercase and removing special characters
        for (String input : exampleInput) {
            System.out.println(input + " isPalidrome = " + isPalindrome(input.toLowerCase()));
        }
    }

    public static String lowering(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = lowering(str);
        //System.out.println(str);

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == ' ') {
                i++;
                continue;
            }
            if (str.charAt(j) == ' ') {
                j--;
                continue;
            }
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}