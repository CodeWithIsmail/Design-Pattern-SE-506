public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        publisher.registerObserver(new NewsSubscriber("John"));
        publisher.registerObserver(new NewsSubscriber("Alice"));
        publisher.setNews("New news!"); 
    }
}

/*

 */