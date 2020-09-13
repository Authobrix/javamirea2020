package practicenumber2;

import java.util.ArrayList;
public class DogKennel {
    private Dog[] dogs;
    private int j=0;
    public DogKennel(){
        dogs=new Dog[5];
    }
    public void add(Dog... dog){
        int k=0;
        for(;k<dog.length;j++,k++){
            System.out.println(dog[k]);
            dogs[j]=dog[k];
        }
    }
}
