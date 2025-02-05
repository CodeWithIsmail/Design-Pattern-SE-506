public class Main {
    public static void main(String[] args) {
        Auction auction = new Auction();

        Bidder bidder1 = new AuctionBidder("Ismail");
        Bidder bidder2 = new AuctionBidder("Nandan");
        Bidder bidder3 = new AuctionBidder("Tashrif");

        auction.registerBidder(bidder1);
        auction.registerBidder(bidder2);
        auction.registerBidder(bidder3);

        auction.newBid(100, bidder1);
        auction.newBid(150, bidder2);
        auction.newBid(120, bidder3);
        auction.newBid(200, bidder3);

        auction.removeBidder(bidder1);
        auction.newBid(250, bidder2);

        auction.closeAuction();
    }
}





