package az.itbrains.ecommerce.services.impls;

import az.itbrains.ecommerce.services.ProductService;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductService productService;

    public ProductServiceImpl(ProductService productService) {
        this.productService = productService;
    }
}
