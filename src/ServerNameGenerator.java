public class ServerNameGenerator {

    private static String[] adjectives = {"Adorable", "Bad", "Clever", "Dangerous", "Expensive", "Funny", "Grumpy", "Hilarious", "Jolly", "Kind"};

    private static String[] nouns = {"Kangaroo", "Lunch", "Magician", "Notebook", "Oyster", "Planet", "Queen", "Raincoat", "Sandwich", "Train"};

    private static String randomElement (String[] strings) {
        int random_int = (int)Math.floor(Math.random() * strings.length);
        return strings[random_int];
    }

    public static void randomName(String[] adjective, String[] noun) {
        String adjective1 = randomElement(adjective);
        String noun1 = randomElement(noun);
        String message = String.format("Your name is: %s-%s", adjective1, noun1);
        System.out.println(message);
    }

    public static void main(String[] args) {
        randomName(adjectives, nouns);
    }//end psvm
}//end class ServerNameGenerator
