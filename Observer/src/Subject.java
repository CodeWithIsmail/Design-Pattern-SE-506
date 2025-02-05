 interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}


/*
an auctioner, in his auction shop, accepts bids from bidders. to participate in the auction, the bidders must register with the auctioner.a bidder must register for that specific bidding event. the autioner must calls out the price of a product. when a bidder acceepts a bid he she raiser a numbered paddle, which identifies the bidder . the bid price then changes and all other bidder must be notified of the change. the autioner must then broadcast the new bid to the bidders.
 */

