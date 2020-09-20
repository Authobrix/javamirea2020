package practicenumber3;

public class BookTest {

    public static void main(String []args){

        Book kniga1 = new Book("Хемингуэй", "По ком звонит колокол?", 1940 , 290);
        System.out.println(kniga1.getAuthor()+ " " + kniga1.getName() + " " + kniga1.getYear() + " " + kniga1.getLabel());
}
}
