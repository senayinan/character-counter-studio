import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {


    public void countCharacters(String textToCount) {
        HashMap<String, Integer> characters = new HashMap<>();
        // For Bonus Mission 2 I'll make textToCount lowercase
        textToCount = textToCount.toLowerCase();
        char[] charactersInString = textToCount.toCharArray();
        //System.out.println(charactersInString[0]);

        for (int i = 0; i < charactersInString.length; i++) {
            //System.out.println(charactersInString[i]);
            char character = charactersInString[i];
            //Bonus Mission 3
            /*if(Character.isLetter(charactersInString[i]) == false){
                continue;
            }*/


            boolean found = characters.containsKey(character + "");

            if (found) {
                characters.put(character + "", characters.get(character + "") + 1);
            } else {
                characters.put(character + "",1);
            }
            //System.out.println(characters);

            characters.forEach((key,value) -> {
                System.out.println(key + ":" +value);
        });
    }
    }
    public String userInput() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a text: ");
        String input = myScanner.nextLine();
        myScanner.close();
        return input;
    }
}
