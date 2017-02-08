package duck;

import impl.FlyWithWings;
import impl.Quack;
import inter.FlyBehavior;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am MallardDuck");
	}

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	

}
