import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> moods = new ArrayList<>(Arrays.asList(
                "neutral",
                "happy",
                "tired",
                "anxious",
                "frustrated",
                "sad",
                "hopeful",
                "bored"
        ));

        List<CharSequence> emojis = new ArrayList<>(Arrays.asList(
                "\uD83D\uDE10",
                "\uD83D\uDE0A",
                "\uD83D\uDE29",
                "\uD83D\uDE1F",
                "\uD83D\uDE20",
                "\uD83D\uDE14",
                "\uD83C\uDF31",
                "\uD83D\uDE12"
        ));

        List<String> colors = new ArrayList<>(Arrays.asList(
                "\033[38;5;250m",
                "\033[38;5;226m",
                "\033[38;5;110m",
                "\033[38;5;216m",
                "\033[38;5;202m",
                "\033[38;5;19m",
                "\033[38;5;121m",
                "\033[38;5;180m"
        ));

        List<String> color_names = new ArrayList<>(Arrays.asList(
                "Light Gray",
                "Yellow",
                "Muted Blue",
                "Pale Orange",
                "Red-Orange",
                "Deep Blue",
                "Mint Green"
        ));

        System.out.println("Mood-Based Color Generator");
        System.out.print("Name: ");
        String user_name = sc.nextLine();
        System.out.print("Mood: ");
        String user_mood = sc.nextLine();

        String final_user_mood = user_mood.toLowerCase();
        int user_mood_index = moods.indexOf(final_user_mood);
        CharSequence user_emoji = emojis.get(user_mood_index);
        String color = colors.get(user_mood_index);
        String color_name = color_names.get(user_mood_index);
        String user_color = color+color_name;

        if (moods.contains(final_user_mood)){
            String format = String.format("Name: %s\nMood: %s\nColor: %s", user_name, user_emoji, user_color);
            System.out.println("\n"+format);
        }
    }
}