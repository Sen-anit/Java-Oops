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

        String str1 = "remote";
        String str2 = "ramote";
        System.out.println('e' + 0);//ASCII
        System.out.println('a' + 0);
        int i = str2.compareTo(str1);
        System.out.println(i);

        String name3 = "Max Verstappen";
        String substring = name3.substring(2,9);
        System.out.println(substring);
        
    }
}
