package concepts;

import java.util.ArrayList;
import java.util.List;

public class Overriding {


    public static void main(String[] args) {
        List<Honda> list = new ArrayList<Honda>();
        list.add(new Honda());
        list.add(new Civic());
        list.forEach(h->{
        /* if(h instanceof Civic){
             ((Civic) h).callSuper();
         }else{*/
             h.print();
//         }

        });
    }


}

class Honda{

    private static  String made(){return  "1900";}


    static void  print(){
        System.out.println("A Honda"+made());
    }
}

class Civic extends Honda{

    private static  String made(){ return "2000";}

    static  void print() {
        System.out.println("A Civic" + made());
    }

    void callSuper(){
        super.print();
    }
}