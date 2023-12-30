package com.example;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("-------------------------");

		Duck mallard = new MallardDuck();
		mallard.swim();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();

		System.out.println("-------redefine fly------------------");
		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.performFly();

		System.out.println("-------------------------");

		Duck redhead = new RedheadDuck();
		redhead.swim();
		redhead.display();
		redhead.performFly();
		redhead.performQuack();

		System.out.println("-------------------------");

		Duck rubber = new RubberDuck();
		rubber.swim();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();

		System.out.println("-------------------------");

		Duck decoy = new DecoyDuck();
		decoy.swim();
		decoy.display();
		decoy.performFly();
		decoy.performQuack();
	}
}
