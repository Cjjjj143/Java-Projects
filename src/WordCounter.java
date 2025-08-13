import java.util.Scanner;
class WordCounter {
    private final String userInput;
    public WordCounter(String userInput) {
        this.userInput = userInput;
    }
    public int countWords() {
        String[] words = userInput.trim().split("\\s+");
        return words.length;
    }
    public void printWordCount() {
        System.out.format("\nThere are %d words in the sentence.\n\n", countWords());
    }
}
private static final Scanner sc = new Scanner(System.in);
public static String getUserInput(Scanner sc, String prompt){
    System.out.print(prompt);
    return sc.nextLine();
}
public static boolean isValid(WordCounter counter, String userInput){
    return counter.countWords() > 1 && userInput != null && !userInput.isEmpty();
}
public static void exit(){
    System.out.println("Exiting...");
    System.exit(0);
}
public static void printText(String text){
    System.out.println(text);
}
void main(){
    printText("\nWord Counter App");
    printText("\n[Enter e to exit.]\n");
    while (true){
        String sentence = getUserInput(sc, "Enter a sentence: ");
        WordCounter wordCounter = new WordCounter(sentence);

        if (isValid(wordCounter, sentence)){
            if (sentence.trim().equalsIgnoreCase("e")) {
                    exit();
            }
            else {
                wordCounter.printWordCount();
            }
        }
        else {
            System.out.println("Invalid input. Please enter a sentence only.\n");
        }
    }
}