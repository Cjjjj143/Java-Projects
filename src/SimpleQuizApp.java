import java.util.Random;
public static class QuizData {
    String[][] topicsPerCategory = {
            {"Physics", "Biology", "Chemistry", "Astronomy", "Earth Science", "Physics", "Biology", "Chemistry", "Astronomy", "Biology"},
            {"World History", "Ancient History", "Modern History", "Philippine History", "World Leaders", "American History", "Ancient Civilizations", "Exploration", "Wars", "Ancient Rome"},
            {"Geography", "Literature", "Sports", "Food", "Travel", "Music", "Language", "Culture", "Currency", "Flags"},
            {"Computing", "Internet", "Gadgets", "Social Media", "AI", "Software", "Cybersecurity", "Tech History", "Space Tech", "Computer Memory"},
            {"Movies", "Animals", "Food", "Drinks", "Weather", "Math", "Space", "Colors", "Plants", "Human Body"}
    };

    String[][] questionsPerTopics = {
            {"What is the unit of electric current?", "Which part of the plant conducts photosynthesis?", "What is the chemical symbol for gold?", "Which planet is known as the Red Planet?", "What is the largest type of volcano?", "Speed of light in vacuum is approximately?", "Which organ filters blood in the human body?", "pH value of pure water is?", "Which galaxy is Earth located in?", "DNA stands for?"},
            {"Who was the first President of the United States?", "The Pyramids of Giza are located in which country?", "In which year did World War II end?", "Who is known as the national hero of the Philippines?", "Who was the first female Prime Minister of the UK?", "What year did the US declare independence?", "The Great Wall was built in which country?", "Who discovered the sea route to India?", "The Cold War was mainly between the USA and which other country?", "Who was assassinated on the Ides of March?"},
            {"What is the capital of Japan?", "Who wrote 'Romeo and Juliet'?", "Which sport uses a shuttlecock?", "Which country is famous for sushi?", "The Eiffel Tower is located in which city?", "Which instrument has 88 keys?", "'Hola' means hello in which language?", "Diwali is a festival from which religion?", "What is the currency of the Philippines?", "Which country's flag is red with a white cross?"},
            {"What does 'HTTP' stand for?", "Which company owns YouTube?", "The iPhone is made by which company?", "Which platform uses a blue bird as its logo?", "What does 'AI' stand for?", "Microsoft Word is an example of?", "A malicious software is called?", "Who founded Microsoft?", "SpaceX is founded by?", "RAM stands for?"},
            {"'The Avengers' is part of which cinematic universe?", "Which is the largest mammal?", "What is the main ingredient of bread?", "Which drink is made from fermented grapes?", "What is the instrument used to measure temperature?", "What is 12 × 8?", "The moon is a?", "What colors make green?", "Cactus is adapted to live in?", "How many bones does an adult human have?"}
    };

    String[] categoriesOfQuestions = {"Science", "History", "General Knowledge", "Technology", "Mixed Questions"};

    String[][][] choicesPerQuestions = {
            {
                    {"A) Volt", "B) Watt", "C) Ampere", "D) Ohm"},
                    {"A) Roots", "B) Leaves", "C) Stem", "D) Flowers"},
                    {"A) Au", "B) Ag", "C) Gd", "D) Go"},
                    {"A) Mars", "B) Venus", "C) Jupiter", "D) Saturn"},
                    {"A) Stratovolcano", "B) Shield volcano", "C) Cinder cone", "D) Lava dome"},
                    {"A) 300,000 km/s", "B) 150,000 km/s", "C) 1,000 km/s", "D) 3,000 km/s"},
                    {"A) Heart", "B) Kidney", "C) Lungs", "D) Liver"},
                    {"A) 0", "B) 7", "C) 14", "D) 5"},
                    {"A) Milky Way", "B) Andromeda", "C) Triangulum", "D) Whirlpool"},
                    {"A) Deoxyribonucleic acid", "B) Deoxyribose nitrogen acid", "C) Deoxyribonucleic acid", "D) None of the above"}
            },

            {
                    {"A) Thomas Jefferson", "B) George Washington", "C) Abraham Lincoln", "D) John Adams"},
                    {"A) Sudan", "B) Egypt", "C) Morocco", "D) Iraq"},
                    {"A) 1940", "B) 1945", "C) 1948", "D) 1950"},
                    {"A) Emilio Aguinaldo", "B) Andres Bonifacio", "C) Jose Rizal", "D) Apolinario Mabini"},
                    {"A) Theresa May", "B) Margaret Thatcher", "C) Queen Elizabeth II", "D) Angela Merkel"},
                    {"A) 1776", "B) 1789", "C) 1804", "D) 1812"},
                    {"A) Japan", "B) China", "C) Korea", "D) Mongolia"},
                    {"A) Ferdinand Magellan", "B) Vasco da Gama", "C) Christopher Columbus", "D) Marco Polo"},
                    {"A) China", "B) Soviet Union", "C) Germany", "D) Japan"},
                    {"A) Julius Caesar", "B) Nero", "C) Augustus", "D) Caligula"}
            },

            {
                    {"A) Tokyo", "B) Osaka", "C) Kyoto", "D) Hiroshima"},
                    {"A) William Shakespeare", "B) Charles Dickens", "C) Mark Twain", "D) Jane Austen"},
                    {"A) Tennis", "B) Badminton", "C) Squash", "D) Table tennis"},
                    {"A) China", "B) Japan", "C) Korea", "D) Thailand"},
                    {"A) London", "B) Paris", "C) Rome", "D) Madrid"},
                    {"A) Guitar", "B) Piano", "C) Violin", "D) Harp"},
                    {"A) French", "B) Spanish", "C) Italian", "D) Portuguese"},
                    {"A) Islam", "B) Hinduism", "C) Christianity", "D) Buddhism"},
                    {"A) Yen", "B) Peso", "C) Ringgit", "D) Rupiah"},
                    {"A) Denmark", "B) Switzerland", "C) Norway", "D) Sweden"}
            },

            {
                    {"A) Hyper Text Transfer Protocol", "B) High Tech Transmission Process", "C) Hyper Transfer Technology Protocol", "D) Hyper Terminal Transfer Process"},
                    {"A) Microsoft", "B) Google", "C) Meta", "D) Amazon"},
                    {"A) Samsung", "B) Apple", "C) Huawei", "D) Xiaomi"},
                    {"A) Twitter", "B) Facebook", "C) TikTok", "D) Instagram"},
                    {"A) Automated Integration", "B) Artificial Intelligence", "C) Automatic Internet", "D) Analytical Information"},
                    {"A) Operating system", "B) Word processor", "C) Spreadsheet", "D) Database"},
                    {"A) Malware", "B) Firewall", "C) Cloud", "D) Bandwidth"},
                    {"A) Steve Jobs", "B) Bill Gates", "C) Larry Page", "D) Jeff Bezos"},
                    {"A) Richard Branson", "B) Elon Musk", "C) Jeff Bezos", "D) Yuri Milner"},
                    {"A) Random Access Memory", "B) Rapid Action Module", "C) Read All Memory", "D) Read Access Mode"}
            },

            {
                    {"A) DC", "B) Marvel", "C) Pixar", "D) DreamWorks"},
                    {"A) Elephant", "B) Blue whale", "C) Giraffe", "D) Orca"},
                    {"A) Flour", "B) Rice", "C) Corn", "D) Sugar"},
                    {"A) Beer", "B) Wine", "C) Whisky", "D) Vodka"},
                    {"A) Barometer", "B) Thermometer", "C) Hygrometer", "D) Anemometer"},
                    {"A) 96", "B) 86", "C) 102", "D) 112"},
                    {"A) Star", "B) Natural satellite", "C) Planet", "D) Comet"},
                    {"A) Blue and yellow", "B) Red and blue", "C) Yellow and red", "D) Blue and red"},
                    {"A) Rainforest", "B) Desert", "C) Ocean", "D) Mountains"},
                    {"A) 206", "B) 208", "C) 210", "D) 204"}
            }
    };


    String[][] correctAnswers = {
            {"C - Ampere", "B - Leaves", "A - Au", "A - Mars", "B - Shield volcano", "A - 300,000 km/s", "B - Kidney", "B - 7", "A - Milky Way", "A - Deoxyribonucleic acid"},
            {"B - George Washington", "B - Egypt", "B - 1945", "C - Jose Rizal", "B - Margaret Thatcher", "A - 1776", "B - China", "B - Vasco da Gama", "B - Soviet Union", "A - Julius Caesar"},
            {"A - Tokyo", "A - William Shakespeare", "B - Badminton", "B - Japan", "B - Paris", "B - Piano", "B - Spanish", "B - Hinduism", "B - Peso", "A - Denmark"},
            {"A - Hyper Text Transfer Protocol", "B - Google", "B - Apple", "A - Twitter", "B - Artificial Intelligence", "B - Word processor", "A - Malware", "B - Bill Gates", "B - Elon Musk", "A - Random Access Memory"},
            {"B - Marvel", "B - Blue whale", "A - Flour", "B - Wine", "B - Thermometer", "A - 96", "B - Natural satellite", "A - Blue and yellow", "B - Desert", "A - 206"}
    };

    String[][] correctAnswerLetters = {
            {"C", "B", "A", "A", "B", "A", "B", "B", "A", "A"},
            {"B", "B", "B", "C", "B", "A", "B", "B", "B", "A"},
            {"A", "A", "B", "B", "B", "B", "B", "B", "B", "A"},
            {"A", "B", "B", "A", "B", "B", "A", "B", "B", "A"},
            {"B", "B", "A", "B", "B", "A", "B", "A", "B", "A"}
    };
}
public static class ResultMessages {
    String[] winMessages = {"Nice! You got it right.", "Correct! Keep it up.", "Spot on!", "Yes! You’re on a roll.", "Right answer — well played!"};
    String[] lossMessages = {"Oops! That’s not it.", "Incorrect — but you’ve got this.", "Not quite. Try the next one!", "Wrong answer. Don’t give up.", "Missed it, but keep going!"};
}
private static int randomNumberGeneratorForResultMessages(Random rand){
    return rand.nextInt(5);
}
public static boolean isWin(String userInput, String correctAnswer) {
    return userInput.trim().equalsIgnoreCase(correctAnswer);
}
public static void printText(String text){
    System.out.println(text);
}
public static boolean quizCategoryIsFinished(){
    try {
        return false;
    } catch (IndexOutOfBoundsException e) {
        return true;
    }
}
public static boolean isValidAnswer(String userInput){
    return userInput != null && userInput.matches("(?i)[a-z]") && !userInput.isEmpty();
}

public static void printQuizCategories(QuizData data){
    int count = 1;
    for (String category : data.categoriesOfQuestions) {
        System.out.format("%d. %s\n", count, category);
        count++;
    }
}
public static void printChoices(){
    System.out.println("\nChoices:\n");
    for (String choice: choices) {
        System.out.println(choice);
    }
}
public static class Indexes {
    private static int topicIndex;
    private static int questionIndex;
    private static int choicesIndex;
    private static int correctAnswerLetterIndex;
    private static int correctAnswerIndex;
}
private static void setIndexes(int chosenCategory){
    Indexes.topicIndex = chosenCategory - 1;
    Indexes.questionIndex = chosenCategory - 1;
    Indexes.choicesIndex = chosenCategory - 1;
    Indexes.correctAnswerLetterIndex = chosenCategory - 1;
    Indexes.correctAnswerIndex = chosenCategory - 1;
}

private static String category;
private static String topic;
private static String question;
private static String[] choices;
private static String correctAnswerLetter;
private static String correctAnswer;

private static void getData(QuizData data, int chosenCategory){
    category = data.categoriesOfQuestions[chosenCategory - 1];
    topic = data.topicsPerCategory[chosenCategory - 1][Indexes.topicIndex];
    question = data.questionsPerTopics[chosenCategory - 1][Indexes.questionIndex];
    choices = data.choicesPerQuestions[chosenCategory - 1][Indexes.choicesIndex];
    correctAnswerLetter = data.correctAnswerLetters[chosenCategory - 1][Indexes.correctAnswerLetterIndex];
    correctAnswer = data.correctAnswers[chosenCategory - 1][Indexes.correctAnswerIndex];
}

private static void updateIndexes(){
    Indexes.topicIndex++;
    Indexes.questionIndex++;
    Indexes.choicesIndex++;
    Indexes.correctAnswerIndex++;
    Indexes.correctAnswerLetterIndex++;
}

private static final Scanner sc = new Scanner(System.in);
private static final Random rand = new Random();
void main() {
    printText("""
            
                [QuizQuest]
            
            Welcome to QuizQuest!\uD83C\uDFAF
            Pick your favorite category and get ready to test your skills!
            You’ll face 10 exciting multiple-choice questions from a variety of topics within your chosen field.
            Choose the best answer, think fast, and aim for a perfect score.
            Ready to prove you’re the ultimate quiz master? Let’s go!\uD83D\uDE80
            
                            [Press enter to proceed.]
            """);
    sc.nextLine();
    QuizData data = new QuizData();
    ResultMessages result = new ResultMessages();
    while (true) {
        System.out.println("\nTopic Categories\n");
        printQuizCategories(data);
        System.out.print("\nEnter category no: ");
        int chosen_category = sc.nextInt();
        sc.nextLine();
        setIndexes(chosen_category);
        int itemCount = 1;
        int score = 0;
        int tries = 5;
        while (true) {
            try {
                getData(data, chosen_category);
                String format = String.format("\n=============================================\nTopic Category: %s\n\n%d. Topic: %s\nQuestion: %s\n", category, itemCount, topic, question);
                System.out.println(format);
                printChoices();
                while (true) {
                    System.out.print("\nEnter the letter of the correct answer: ");
                    String userInput = sc.nextLine();
                    if (isValidAnswer(userInput)) {
                        if (isWin(userInput, correctAnswerLetter)) {
                            score++;
                            printText("\n"+result.winMessages[randomNumberGeneratorForResultMessages(rand)]);
                        } else {
                            tries--;
                            printText("\n"+result.lossMessages[randomNumberGeneratorForResultMessages(rand)]);
                            System.out.format("\nCorrect Answer: %s\n", correctAnswer);
                        }
                        System.out.format("\n\nScore: %d\nAvailable Tries: %d\n", score, tries);
                        updateIndexes();
                        itemCount++;
                        break;
                    }
                    else {
                        System.out.println("Invalid input. Please enter letter a, b, c or d.");
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.format("\nCongratulations you've completed the %s quiz category\n", category);
                break;
            }
        }
    }
}
