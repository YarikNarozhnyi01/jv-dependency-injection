package mate.academy;

import java.util.List;
import mate.academy.lib.Injector;
import mate.academy.model.Product;
import mate.academy.service.ProductService;

public class Main {

    public static void main(String[] args) {
        Injector injector = Injector.getInjector();
        ProductService productService1  = (ProductService) injector.getInstance(ProductService.class);

        List<Product> products = productService1.getAllFromFile("products.txt");
        products.forEach(System.out::println);
    }
}
