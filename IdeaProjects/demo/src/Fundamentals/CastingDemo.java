package Fundamentals;

public class CastingDemo {

    public static void main(String[] args) {
        String exampleStr = "this is an example string";
        String doubleStr = "99999.918273";
        String intStr = "99999";
        int charCode = 68;

        char charChar = (char) charCode;
        double doubleDouble = Double.parseDouble(doubleStr);
        int intInt = Integer.parseInt(intStr);

        byte intByte = (byte) charCode;
        int intDouble = (int) Double.parseDouble(doubleStr);

        System.out.println(charChar);
        System.out.println(doubleDouble);
        System.out.println(intInt);
        System.out.println(intByte);
        System.out.println(intDouble);

    }

}
