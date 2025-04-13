package Arrays;

import java.util.*;

public class WordQuestGame {
    private static final int MAX_ATTEMPTS = 6;

    public static void main(String[] args) {
        String[] wordList = {
                "java", "multiplication", "heart", "ace", "train",
                "galaxy", "wizard", "storm", "element", "mystic"
        };

        String selectedWord = getRandomWord(wordList).toUpperCase();
        char[] gameBoard = prepareGameBoard(selectedWord);
        char[] selectedWordMap = selectedWord.toCharArray();

        runGame(gameBoard, selectedWordMap, selectedWord);
    }

    private static void runGame(char[] gameBoard, char[] selectedWordMap, String selectedWord) {
        Scanner sc = new Scanner(System.in);
        Set<Character> usedLetters = new HashSet<>();
        int wrongAttempts = 0;

        while (isGameOngoing(gameBoard) && wrongAttempts < MAX_ATTEMPTS) {
            printGameBoard(gameBoard);
            System.out.println("Used letters: " + usedLetters);
            System.out.println("You have " + (MAX_ATTEMPTS - wrongAttempts) + " wrong attempts remaining.");
            System.out.print("Guess a character: ");

            char character = scanChar(sc);
            character = Character.toUpperCase(character);

            if (usedLetters.contains(character)) {
                System.out.println("You've already guessed that letter! Try a different one.\n");
                continue;
            }

            usedLetters.add(character);
            boolean correctGuess = false;

            for (int i = 0; i < selectedWordMap.length; i++) {
                if (selectedWordMap[i] == character) {
                    gameBoard[i] = character;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                wrongAttempts++;
                System.out.println("Incorrect guess.\n");
            } else {
                System.out.println("Nice! You found a letter.\n");
            }
        }

        if (!isGameOngoing(gameBoard)) {
            System.out.println("🎉 Congratulations! You found the word: " + selectedWord);
        } else {
            System.out.println("❌ You're out of attempts. The word was: " + selectedWord);
        }

        sc.close();
    }

    private static boolean isGameOngoing(char[] gameBoard) {
        for (char c : gameBoard) {
            if (c == '_') {
                return true;
            }
        }
        return false;
    }

    private static char scanChar(Scanner sc) {
        while (true) {
            String input = sc.next().trim();
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.print("Invalid input. Please enter a single letter: ");
            } else {
                return input.charAt(0);
            }
        }
    }

    private static void printGameBoard(char[] board) {
        for (char c : board) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static char[] prepareGameBoard(String selectedWord) {
        char[] gameBoard = new char[selectedWord.length()];
        Arrays.fill(gameBoard, '_');
        return gameBoard;
    }

    private static String getRandomWord(String[] wordList) {
        Random rand = new Random();
        return wordList[rand.nextInt(wordList.length)];
    }
}

