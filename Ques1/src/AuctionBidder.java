class AuctionBidder implements Bidder {
    private String name;
    private int currentBid;

    public AuctionBidder(String name) {
        this.name = name;
    }

    @Override
    public void update(int newBid) {
        this.currentBid = newBid;
        System.out.println(name + " notified. New bid is: $" + newBid);
    }

    @Override
    public String getName() {
        return name;
    }
}
