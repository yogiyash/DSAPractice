package other;

public class Ambiguity {

    public static void main(String[] args) {
        Ambiguity boss = new Ambiguity();
        boss.hand(89);
        boss.hand(8.9);
    }

    private void hand(Integer num){
        System.out.println("method1");
    }
    
    private void hand(Number nums){
        System.out.println("method2");
    }
}
