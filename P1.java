interface tea{
	abstract public void suger();
}
interface coffee{
	void plan();
}
 class P1 implements tea,coffee
 {
	 public void suger()
	 {
		 System.out.println("Your Suger Free Tea");
	 }
	 public void plan()
	 {
		 System.out.println("Your Cold Coffee");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 m = new P1();
		m.suger();
		m.plan();

	}

}
