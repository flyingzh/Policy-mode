package duck;

import inter.FlyBehavior;
import inter.QuackBehavior;

public abstract class Duck {

	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;

	public Duck() {
	}

	public abstract void display();

	public void swim() {
		System.out.println("I can swimming");
	}

	public void performFly() {
		flyBehavior.fly();// 委托给行为类
	}

	public void performQuack() {
		quackBehavior.quack();// 委托给行为类
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
