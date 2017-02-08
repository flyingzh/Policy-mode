package duck;

import impl.FlyNoWay;
import impl.Quack;

public class ModelDuck extends Duck{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am MallardDuck");
	}
	
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	
	
	
	

}
