import java.util.ArrayList;
import java.util.List;
class Auction implements Auctioneer {
    private List<Bidder> bidders = new ArrayList<>();
    private int currentBid = 0;
    private Bidder highestBidder;

    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
        System.out.println(bidder.getName() + " registered auction.");
    }

    @Override
    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
        System.out.println(bidder.getName() + " left auction.");
    }

    @Override
    public void notifyBidders() {
        for (Bidder bidder : bidders) {
            if (bidder != highestBidder) {
                bidder.update(currentBid);
            }
        }
    }

    @Override
    public void newBid(int amount, Bidder bidder) {
        if (amount > currentBid) {
            currentBid = amount;
            highestBidder = bidder;
            System.out.println(bidder.getName() + " placed a bid of $" + amount);
            notifyBidders();
        } else {
            System.out.println("Bid must be higher than current bid of $" + currentBid);
        }
    }

    public void closeAuction()
    {
        System.out.println(highestBidder.getName()+" won auction. Amount: "+currentBid);
    }
}
