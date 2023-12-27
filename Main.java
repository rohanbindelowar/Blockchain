import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        
        Blockchain myBlockchain = new Blockchain();

        // Add some blocks
        myBlockchain.addBlock(new Block(1, new Date(System.currentTimeMillis()).getTime(), "Transaction Data 1", myBlockchain.getLatestBlock().getHash()));
        myBlockchain.addBlock(new Block(2, new Date(System.currentTimeMillis()+10).getTime(), "Transaction Data 2", myBlockchain.getLatestBlock().getHash()));
        myBlockchain.addBlock(new Block(3, new Date(System.currentTimeMillis()+20).getTime(), "Transaction Data 3", myBlockchain.getLatestBlock().getHash()));
        myBlockchain.addBlock(new Block(4, new Date(System.currentTimeMillis()+50).getTime(), "Transaction Data 4", myBlockchain.getLatestBlock().getHash()));
        myBlockchain.addBlock(new Block(5, new Date(System.currentTimeMillis()+100).getTime(), "Transaction Data 5", myBlockchain.getLatestBlock().getHash()));

       
        boolean isValid = myBlockchain.validateChain();
        System.out.println("Is blockchain valid? " + isValid);

        
        myBlockchain.DisplayBlockChain();
    }
}
