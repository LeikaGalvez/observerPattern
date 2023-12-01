package observerPattern;

import java.util.*;

public class NewsAgency implements NewsAgencySubject{

    private List<SubscribersObserver> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notify(String news) {
        for (SubscribersObserver subscriber : subscribers) {
            subscriber.updateSubscribers(news);
        }
    }
}
