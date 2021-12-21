package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.config.JpaConfig;
import ru.gb.service.ProductService;

public class ShopApp {



    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
        ProductService productService = context.getBean(ProductService.class);

//        System.out.println(productService.findAllSortedByCostDesc());
        System.out.println(productService.findAllSortedByCostAsc());


    }
}
