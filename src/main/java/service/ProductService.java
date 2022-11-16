package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1,"iphone14","https://uscom.vn/wp-content/uploads/2022/09/vang.jpg"));
        products.add(new Product(2,"samsung","https://didongviet.vn/pub/media/catalog/product//g/a/galaxy-s21-ultra-5g-12gb-128gb-didongviet.jpg"));
    }

    public static void save(Product p){
        products.add(p);
    }
    public static void delete(int index){
        products.remove(index);
    }

    public static void edit(int index, Product product){
        products.set(index, product);
    }
    public static Product getProduct(int id){
        return products.get(findIndexById(id));
    }

    public static int findIndexById(int id){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }





}
