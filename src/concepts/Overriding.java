package concepts;

import java.util.ArrayList;
import java.util.List;

public class Overriding {


    public static void main(String[] args) {
        List<Honda> list = new ArrayList<Honda>();
        list.add(new Honda());
        list.add(new Civic());
        list.forEach(h -> {
        /* if(h instanceof Civic){
             ((Civic) h).callSuper();
         }else{*/
            Honda.print();
//         }

        });
    }


}

class Honda {

    private String made() {
        return "1900";
    }

     void print() {
        System.out.println("A Honda" + made());
    }
}

class Civic extends Honda { 

    private  String made() {
        return "2000";
    }

}