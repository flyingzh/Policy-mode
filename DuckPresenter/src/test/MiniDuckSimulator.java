package test;

import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import impl.FlyWithWings;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.swim();
		
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.performQuack();
		modelDuck.setFlyBehavior(new FlyWithWings());
		modelDuck.performFly();
	}

}
