package rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Robert_Georgescu on 17-Oct-16.
 */
@Path("products")
public class ProductService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getProducts() {
        return null;
    }
}
