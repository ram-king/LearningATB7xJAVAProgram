package Aug_24.EX_04082024.hasA;

import Aug_24.EX_04082024.AccessModifiers.Developer.DatingApp;

public class Car {
    void StartTheCar(){
        new Engine().start();
    }
    void BMW(){
        System.out.println("-----BMW Car------");
        new Engine().start(); // by using an object we're calling
        new Tyres().tyres();
        new Engine().stop();
    }
    void Lamborghini(){
        System.out.println("-----Lamborghini Car------");
        new Engine().start();
        new Tyres().tyres();
        new Engine().stop();
    }

    public static void main(String[] args) {
        new Car().Lamborghini();
        new Car().BMW();

    }
}
