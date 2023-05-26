package org.exercise;

import org.common.Category;
import org.common.Customer;
import org.common.Order;
import org.common.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = generateProductList();
        List<Order> orderList = generateOrderList();

        //Exercise 1
        List<Product> books = productList.stream().filter(product -> product.getCategory().equals("Books")).collect(Collectors.toList());
        System.out.println(books);

        //Exercise2
        orderList.stream().forEach(order -> order.setProducts(
                order.getProducts().stream().filter(product -> product.getCategory().equals("Toys")).collect(Collectors.toList())
        ));
        List<Order> ordersBaby = orderList.stream().filter(order -> !order.getProducts().isEmpty()).collect(Collectors.toList());
        System.out.println(ordersBaby);

        //Exercise3
        List<Product> toys = productList.stream().filter(product -> product.getCategory().equals("Toys")).collect(Collectors.toList());
        toys.stream().forEach(
                toy -> toy.setPrice(toy.getPrice() * 0.9)
        );
        System.out.println(toys);

        //Exercise4
        Optional<Product> cheapestBook = books.stream().min(Comparator.comparing(Product::getPrice));
        System.out.println(cheapestBook);

        //Exercise5
        Comparator<Order> comparator = Comparator.comparing(Order::getOrderDate);
        Collections.sort(orderList, comparator);
        List<Order> recentOrders = orderList.stream().limit(3).collect(Collectors.toList());
        System.out.println(recentOrders);

        //Exercise6
        double sumPrice = books.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        double avgPrice = books.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0);
        double minPrice = books.stream()
                .mapToDouble(Product::getPrice)
                .min()
                .orElse(0);
        double maxPrice = books.stream()
                .mapToDouble(Product::getPrice)
                .max()
                .orElse(0);
        long countPrice = books.stream()
                .mapToDouble(Product::getPrice)
                .count();

        System.out.println("Sum price: " + sumPrice);
        System.out.println("Average price: " + avgPrice);
        System.out.println("Minimum price: " + minPrice);
        System.out.println("Maximum price: " + maxPrice);
        System.out.println("Count price: " + countPrice);
    }


    public static List<Product> generateProductList(){
        List<Product> productList = new ArrayList<>();
        var precision = 1000; // 2 decimals
        for(int index = 0; index < 10; index++){
            var randomNum = Math.floor(Math.random() * (10 * precision - precision) + precision) / (precision);
            productList.add(new Product((long)Math.random(), UUID.randomUUID().toString(), Category.randomCategory(), Math.abs(randomNum)));
        }
        return productList;
    }

    public static Customer generateCustomer(){
        return new Customer((long)Math.random(), UUID.randomUUID().toString(), ThreadLocalRandom.current().nextInt(0, 10));
    }

    public static List<Order> generateOrderList(){
        List<Order> orderList = new ArrayList<>();
        var precision = 1; // 2 decimals
        for(int index = 0; index < 100; index++){
            var randomNum = Math.floor(Math.random() * (10 * precision - precision) + precision) / (precision);
            LocalDate date = LocalDate.now();
            orderList.add(
                    new Order(
                            (long)Math.random(),
                            UUID.randomUUID().toString(),
                            date.minusDays((long)randomNum),
                            date.minusDays((long)randomNum),
                            generateProductList(),
                            generateCustomer()
                    ));
        }
        return orderList;
    }
}