package observerPattern;

public class NewsLetter {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Subscriber sub1 = new Subscriber("Leika");
        Subscriber sub2 = new Subscriber("Anne");
        Subscriber sub3 = new Subscriber("Galvez");
        Subscriber sub4 = new Subscriber("Lanie");

        newsAgency.subscribe(sub1);
        newsAgency.subscribe(sub2);
        newsAgency.subscribe(sub3);
        newsAgency.subscribe(sub4);

        newsAgency.notify("10 ways to effectively study for an exam [CLICK NOW]!");

        newsAgency.unsubscribe(sub1);
        System.out.println();

        newsAgency.notify("Famous couple \"KathNiel\" have officially broken up [CLICK NOW]!");

        newsAgency.unsubscribe(sub4);
        System.out.println();

        newsAgency.notify("How much do you know about your body? Learn more [CLICK NOW]!");

    }
}
