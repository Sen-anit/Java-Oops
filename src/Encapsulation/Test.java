package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(21);
        System.out.println(student.getAge());
        student.setName("Anit Sen");
        System.out.println(student.getName());
        student.setMarks(93.433f);
        System.out.println(student.getMarks());



        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(-50);
        bankAccount.withdraw(47);
        bankAccount.deposit(1000);
        bankAccount.withdraw(200);
        System.out.println("Your available balance: "+bankAccount.getBalance());
    }
}
