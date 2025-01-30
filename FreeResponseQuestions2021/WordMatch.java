package FreeResponseQuestions2021;

// 主要考察method
// substring
// equals
// compareTo
// ASCII
public class WordMatch {
    public static void main(String[] args) {
        WordMatch game = new WordMatch("mississippi");

        System.out.println(game.scoreGuess("i"));
        System.out.println(game.scoreGuess("iss"));
        System.out.println(game.scoreGuess("issipp"));
        System.out.println(game.scoreGuess("mississippi"));

        game = new WordMatch("concatenation");
        System.out.println(game.findBetterGuess("cat", "con"));
    }

    private String secret;

    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        // score = times * length * length

        int count = 0;
        int length = guess.length();
        for (int i = 0; i + length <= secret.length(); i++) {
            if (secret.substring(i, i + length).equals(guess)) {
                count++;
            }
        }
        return count * length * length;
    }

    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if (score1 > score2) {
            return guess1;
        } else if (score1 < score2) {
            return guess2;
        }

        if (guess1.compareTo(guess2) > 0) {
            return guess1;
        } else {
            return guess2;
        }
    }
}