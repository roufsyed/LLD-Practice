public class Subscriber {

	/*
	* update
	* */

	private String subscriberName = "";


	public Subscriber(String nameOfSubscriber) {
		subscriberName = nameOfSubscriber;
	}

	public void update(String videoName) {
		System.out.println(subscriberName + ", New video uploaded: " + videoName);
	}
}
