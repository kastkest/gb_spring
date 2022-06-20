package com.github.kastkest.gb_spring.hw2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Cart cart = context.getBean(Cart.class);
        ProductRepository repository = context.getBean(ProductRepository.class);
        System.out.println(repository.findAll());
        manageCart(scanner, cart);
        context.close();
    }

    public static void manageCart(Scanner scanner, Cart cart) {
        System.out.println("Добавть в корзину - нажмите 1. Удалить из корзины - нажмите 2. Нажмите 0 для выхода");
        String choice = scanner.nextLine();
            if (choice.equals("1")) {
                System.out.println("Введите id продукта, который хотите положить в корзину: ");
                Long s = Long.valueOf(scanner.nextLine());
                cart.addToCardByProductId(s);
                System.out.println(cart);
                manageCart(scanner, cart);
            } else if (choice.equals("2")) {
                System.out.println("Введите id продукта, который хотите удалить из корзины: ");
                Long s = Long.valueOf(scanner.nextLine());
                cart.removeByID(s);
                System.out.println(cart);
                manageCart(scanner, cart);
            } else if (choice.equals("0")) {
                System.exit(0);
        }
    }


}
