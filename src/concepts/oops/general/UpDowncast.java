package concepts.oops.general;

public class UpDowncast {


   

    public static void main(String[] args) {
        
        Fruit a = new Apple();
        System.out.println(a.getClass());

    }
}

 class Fruit {

        String name;
         String who(){
            String s = "fruit";
            System.out.println(s);
            return s;
        }


    }
  
    class Apple extends Fruit{


        String taste = "sweet and sour";
         int who(){
            System.out.println("apple");
        }
        Apple(){
            super();
        }

    }
