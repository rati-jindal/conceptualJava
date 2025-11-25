package MultiThreading;
//We are going to build a Producer-Consumer pattern. This is the logic behind every queue system (Kafka, RabbitMQ).
//
//Scenario:
//
//Baker (Producer): Bakes a pizza. Cannot bake another one until the current one is eaten.
//
//Customer (Consumer): Eats the pizza. Cannot eat if there is no pizza.

public class PizzaShop {

    boolean pizzaReady = false;
    static boolean isShopOpen = true;

    synchronized void bake() {
        if (!pizzaReady) {
            System.out.println("Pizza Baked!");
            pizzaReady = true;
            notify();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized void eat() {
        if (pizzaReady & isShopOpen) {
            System.out.println("Pizza Eaten!");
            pizzaReady = false;
            notify();
        }
        if(!isShopOpen){
            return;
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized void status(){
        isShopOpen = false;
        notify();
    }

    public static void main(String[] args) {
        PizzaShop shop = new PizzaShop();



        Thread baker = new Thread(() -> {
            for (int n = 0; n < 10; n++) {
                shop.bake();
            }
            shop.status();

        });
        Thread consumer = new Thread(() -> {
            for (int n = 0; n < 10; n++) {
                shop.eat();
            }
        });

        baker.start();
        consumer.start();
    }

}
