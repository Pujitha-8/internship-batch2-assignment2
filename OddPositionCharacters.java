public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "type here to search";
        String result = getOddPositionCharacters(text);

        System.out.println("Odd position characters (ignoring white spaces): " + result);
    }

    public static String getOddPositionCharacters(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Ignore white spaces and consider only characters at odd positions
            if (currentChar != ' ' && i % 2 != 0) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
