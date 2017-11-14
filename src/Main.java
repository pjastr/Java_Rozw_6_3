import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Figura figura1= new Figura();
        Trojkat trojkat1 = new Trojkat(3,4,5);
        System.out.println(trojkat1.ObliczPole());

        Kwadrat kwadrat1 = new Kwadrat(5);
        System.out.println(kwadrat1.ObliczPole());

        List<Figura> figury = new ArrayList<Figura>();
        figury.add(new Trojkat(5,6,7));
        figury.add(new Kwadrat(7));
        figury.add(new Trojkat(3,5,4));
        figury.add(new Kwadrat(9));
        for (Figura element:figury) {
            System.out.println(element.ObliczPole());
        }
    }
}
