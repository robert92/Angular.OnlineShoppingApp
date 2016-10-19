package rest.services;

import data.json.ProductJsonService;
import data.model.Product;
import data.service.ProductService;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Robert_Georgescu on 17-Oct-16.
 */
@Path("products")
public class ProductRestService {

    private ProductJsonService productJsonService = new ProductJsonService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getProducts() {
        return productJsonService.getProductsJson();
    }
}
