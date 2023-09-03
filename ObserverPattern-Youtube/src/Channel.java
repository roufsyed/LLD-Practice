import java.util.ArrayList;
import java.util.List;


public class Channel {
	/*subscribe
	* unsubscribe
	* notify
	* upload
	* list of subscribers*/

	List<Subscriber> subscriberList = new ArrayList<>();
	int uploadCount = 0;

	public void subscribeChannel(Subscriber subscriber) {
		subscriberList.add(subscriber);
	}

	public void unsubscribeChannel(Subscriber subscriber) {
		subscriberList.remove(subscriber);
	}
	
	public void sendNotificationToSubscribers(String videoName) {
		for(Subscriber subscribers : subscriberList) {
			subscribers.update(videoName);
		}
	}

	public void upload (String videoName) {
		uploadCount++;
		if(uploadCount>0) {
			sendNotificationToSubscribers(videoName);
		}
	}

}
