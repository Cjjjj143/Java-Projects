import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class AnagramChecker {
    String[] words;
    ArrayList<String> lowerCasedWords;
    ArrayList<String> sortedWords;

    public AnagramChecker(String[] words){
        this.words = words;
    }
    void convertToLowercase(){
         for (String word: words) {
             String lowerCasedWord = word.toLowerCase();
             lowerCasedWords.add(word);
         }
    }
    void sortWords(){
        for (int i = 0; i < words.length; i++){
            char[] chars = words[(i)].toCharArray();
            Arrays.sort(chars);
            sortedWords.set(i, new String(chars));
        }
    }
    boolean isAnagram(){
        return sortedWords.getFirst().equals(sortedWords.getLast());
    }
    void printResult(){
        if (isAnagram()) {
            System.out.format("\nThe words %s and %s are anagrams.\n", words[0], words[1]);
        }
        System.out.format("\nThe words %s and %s are not anagrams.\n", words[0], words[1]);
    }
}

class AnagramCheckerApp {
    private static final Scanner sc = new Scanner(System.in);
    public static String getUserInput(Scanner sc, String prompt){
        System.out.print(prompt);
        return sc.nextLine();
    }
    public static void printText(String text){
        System.out.println(text);
    }
    public static boolean isValid(String word){
        return word != null && !word.isEmpty();
    }
    public String removeSpaces(String word){
        return word.replace(" ", "");
    }
    public static void exit(){
        System.out.println("Exiting...");
        System.exit(0);
    }

    void main(){
        printText("Anagram Checker App");
        while (true) {
            String firstWord = getUserInput(sc,"Enter a word: ");
            if (firstWord.trim().equalsIgnoreCase("e")) {
                exit();
            }
            if (isValid(firstWord)){
                String secondWord = getUserInput(sc,"Enter another word: ");
                if (secondWord.trim().equalsIgnoreCase("e")) {
                    exit();
                }
                String finalFirstWord = removeSpaces(firstWord);
                String finalSecondWord = removeSpaces(secondWord);
                String[] words = {firstWord, secondWord};
                AnagramChecker anagramChecker = new AnagramChecker(words);
            }
            System.out.println("Invalid input. Please enter a word only");
        }
    }
}
