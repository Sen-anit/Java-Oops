public class TestString {
    static void main(String[] args) {
        String name = "Anit Sen";
        int length = name.length();
        System.out.println(length);
        char c = name.charAt(2);
        System.out.println(c);
        String name2 = "anit Sen";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

    }
}
