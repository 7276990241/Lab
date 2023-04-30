package assignment27;

public class StringBufferManipulation {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is StringBuffer");

        // Adds the string"- This is a sample program" to existing string and display it
        sb.append("- This is a sample program");
        System.out.println("Appended string: " + sb);

        // Inserts the string "Object" into the existing string at 21st postion and display it
        sb.insert(21, "Object ");
        System.out.println("Inserted string: " + sb);

        // Reverses the entire string and displays it
        sb.reverse();
        System.out.println("Reversed string: " + sb);

        // Replaces the word "Buffer" with "Builder" and display it
        sb.replace(sb.indexOf("Buffer"), sb.indexOf("Buffer") + "Buffer".length(), "Builder");
        System.out.println("Replaced string: " + sb);
    }
}
