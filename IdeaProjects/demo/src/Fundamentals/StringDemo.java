package Fundamentals;

public class StringDemo {
    public static void main(String[] args) {

        String message = "message";
        String message2 = "message2";
        String mergedMessage = message + message2;
        String uppercasedMergedMessage = mergedMessage.toUpperCase();
        String lowercasedMergedMessage = mergedMessage.toLowerCase();
        Integer lengthOfMergedMessage = mergedMessage.length();

        System.out.println(mergedMessage + " length of this message is" + lengthOfMergedMessage + " this is the uppercase " + uppercasedMergedMessage + " and this is lowercased" + lowercasedMergedMessage);


    }
}
