import Sem1Products.CursedProducts;
import Sem1Products.Product;
import Sem1Products.WendingMachine;
import Sem1Products.Beer;
import Sem1Products.Chocolate;
import Sem1Products.Product;
import Sem1Products.WendingMachine;

import java.util. *;
public class main {
    public static void main(String[] args) {

        WendingMachine store = new WendingMachine();

        store.addProduct(new Product("Lays" , 123.45))
                .addProduct(new Product("fanta" , 98.76))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new CursedProducts("milk" , 56.65, 7))
                .addProduct(new Beer("alcoholfree" , 67.89))
                .addProduct(new Beer("notbeer" , 67.89, 99))
                .addProduct(new Chocolate("Milka", 111.11, 90));

        System.out.println(store);

        System.out.println("searching for ay's");
        System.out.println(store.findProduct("ys"));


        System.out.println("buying Lay's" );
        store.buy("Lays", 123.45);
        System.out.println(store);

        System.out.println("buying fan's" );
        store.buy("fan", 43.21);
        System.out.println(store);
        System.out.println("buying a's" );
        store.buy("fan", 4.1);
        System.out.println(store);
        System.out.println("buying a's" );
        store.buy("milk", 56.65);
        System.out.println(store);
        store.buy("Milka",111.11);
        System.out.println(store);





    }

}
