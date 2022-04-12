package polymorphism;

public class AirPlane extends FlyingObject{
	@Override
	public void fly() {
		System.out.println("エンジンと機体で飛びます！");
	}
}
