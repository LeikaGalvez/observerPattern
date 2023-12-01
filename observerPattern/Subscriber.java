package observerPattern;

public class Subscriber implements SubscribersObserver{
    private String subscriberName;

    public Subscriber(String name) {
        this.subscriberName = name;
    }

    @Override
    public void updateSubscribers(String news) {
        System.out.println(subscriberName + " received news \"" + news +"\"");
    }
}
