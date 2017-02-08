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
		flyBehavior.fly();// ί�и���Ϊ��
	}

	public void performQuack() {
		quackBehavior.quack();// ί�и���Ϊ��
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
