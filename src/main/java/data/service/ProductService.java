package data.service;

import data.model.Product;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Robert_Georgescu on 19-Oct-16.
 */
public class ProductService {

    public List<Product> getProducts() {
        Product a = new Product("Apple", "Fresh green apples", 5);
        Product e = new Product("Egg", "The best eggs ever", 3);
        Product b = new Product("Bacon", "Finest bacon you'll find", 7);
        Product o = new Product("Orange juice", "Fresh orange juice", 8);
        Product s = new Product("Salad", "Fresh green salad", 2);
        return Arrays.asList(a, e, b, o, s);
    }
}
