package data.json;

import data.model.Product;
import data.service.ProductService;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by Robert_Georgescu on 19-Oct-16.
 */
public class ProductJsonService {

    private ProductService productService = new ProductService();

    public String getProductsJson() {
        List<Product> p = productService.getProducts();
        JSONObject j = new JSONObject();
        j.put("products", p);
        return j.toString();
    }
}
