package concepts.oops.solid;

public class InnerTest<K> {

    class InnerMost<K> {
        private K someData;

        private InnerMost( K parcel){
            this.someData = parcel;
        }

    }
private InnerMost<K> box;




public void setData(K data){
    box = new InnerMost<>(data);   
}

public K getData(){
    return box.someData;
}
    

public static void main(String[] args) {
    
    InnerTest<String> object = new InnerTest<>();
    String str = "OTG";
    object.setData(str);
    System.out.println(object.getData());

}

}
