public class Youtube {
    public static void main(String[] args) {

        Subscriber s1 = new Subscriber("Rouf");
        Subscriber s2 = new Subscriber("Priyank");
        Subscriber s3 = new Subscriber("asd");
        Subscriber s4 = new Subscriber("qwe");


        Channel ch = new Channel();

        ch.subscribeChannel(s1);
        ch.subscribeChannel(s2);
        ch.subscribeChannel(s3);
        ch.unsubscribeChannel(s1);
        ch.subscribeChannel(s4);

        ch.upload("How to write bad ass OOP");

        ch.subscribeChannel(s1);

        ch.upload("How to write good unit test");

    }
}