public class ConditionalState {
    static void main(String[] args) {
        String fruit = "Mango";
        //We can also use a string in switch case
        switch (fruit){
            case "Apple":
                System.out.println("Yesss it's an Apple");
                break;
            case "Mango":
                System.out.println("Yeessss it's a Mango");
                break;
            case "Banana":
                System.out.println("Yeess it's Banana");
                break;
            case "Strawberry":
                System.out.println("Yeesss it's a Strawberry");
                break;
            default:
                System.out.println("Invalid fruit selection.");
                break;
        }
    }
}
