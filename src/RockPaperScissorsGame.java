import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissorsGame {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<String> moves = Arrays.asList("🪨", "📃", "✂️");

    public static String get_user_input(String prompt){
        System.out.print(prompt);
        return sc.nextLine();
    }

    static class Player {
        int move;
        String name;

        String playerMove(){
            return moves.get(move - 1);
        }
    }

    static class Computer {
        String move;

        String computerMove() {
            return moves.get((int) (Math.random() * moves.size()));
        }

        void print_compMove() {
            System.out.format("Computer: %d\n", moves.indexOf(move)+1);
        }
    }

    static class Game {
        String check_battle_result(Player user, Computer comp) {
            String userEmojiMove = moves.get(user.move - 1);
            String compEmojiMove = comp.move;

            if (userEmojiMove.equals("🪨") && compEmojiMove.equals("✂️")
                    || userEmojiMove.equals("📃") && compEmojiMove.equals("🪨")
                    || userEmojiMove.equals("✂️") && compEmojiMove.equals("📃")) {
                return String.format("Congrats %s! You win this round.", user.name);
            } else if (userEmojiMove.equals(compEmojiMove)) {
                return "Draw";
            } else {
                return "Oops! The computer wins this round.";
            }
        }

        void print_moves(Player user, Computer comp){
            int spacesToAdd = Math.max(0, user.name.length() - 2);
            String padding = " ".repeat(spacesToAdd);
            String formatted = padding + user.playerMove();

            System.out.format("\n%s | Computer\n", user.name);
            System.out.format("%s : %s\n\n", formatted, comp.move);
        }
    }

    public static void exit(){
        System.out.println("Exiting...");
        System.exit(0);
    }

    private static boolean is_valid(String user_move){
        if (user_move.equals("e")) {
            exit();
        }
        if (Integer.parseInt(user_move) > 3){
            System.out.println("Invalid input. Please enter a number from 1 to 3 or e to exit.\n");
            return false;
        }
        try {
            Integer.parseInt(user_move);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number from 1 to 3 or e to exit.\n");
            return false;
        }
    }

    public static void main(String[] args) {
        String greetings = """
               
                ===========================================
                       Welcome to Rock, Paper, Scissors!
                ===========================================
                
                You will be facing off against the computer! 🤖 \s
                Can you outsmart it and win?
                
                Choose your move by entering a number:
                1 - Rock 🪨
                2 - Paper 📄
                3 - Scissors ✂️
                
                Click Enter to start... ⏎
                """;
        System.out.println(greetings);
        sc.nextLine();
        String userName = get_user_input("Username: ");
        RockPaperScissorsGame.Player player = new Player();
        RockPaperScissorsGame.Computer computer = new Computer();
        int round = 1;
        int userScore = 0;
        int CompScore = 0;
        while (true) {
            System.out.println("\n========================================\n[Note: Enter e to exit.]");
            System.out.format("\nRound %d\n\n", round);
            while (true) {
                String player_move = get_user_input("Move: ");
                if (is_valid(player_move)) {
                    player.move = Integer.parseInt(player_move);
                    computer.move = computer.computerMove();
                    computer.print_compMove();
                    Game game = new Game();
                    player.name = userName;
                    game.print_moves(player, computer);
                    String result = game.check_battle_result(player, computer);
                    System.out.println("Result: " + result + "\n");

                    if (result.contains("Draw")) {
                        break;
                    } else if (result.contains(userName)) {
                        userScore++;
                        System.out.format("Score: %d\n", userScore);
                    } else if (result.contains("computer")) {
                        CompScore++;
                        System.out.format("Computer Score: %d\n", CompScore);
                    }
                    round++;
                    break;
                }
            }

        }
    }
}
