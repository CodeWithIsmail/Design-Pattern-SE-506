interface Auctioneer {
    void registerBidder(Bidder bidder);

    void removeBidder(Bidder bidder);

    void notifyBidders();

    void newBid(int amount, Bidder bidder);
}

// subject
