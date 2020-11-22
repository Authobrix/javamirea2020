package prc21;

public class ConcreteFactory implements abstract_factory{
    public Complex createComplex(){
        return new Complex();
    }
    public Complex CreateComplex(int real, int image){
        return new Complex(real, image);
    }
}
