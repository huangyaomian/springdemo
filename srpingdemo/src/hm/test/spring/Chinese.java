package hm.test.spring;

public class Chinese implements Person{
	private Axe axe;
	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	public void useAxe() {
		System.out.println("我打算去砍点柴火");
		System.out.println(axe.chop());
	}

}
