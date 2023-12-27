import java.util.Date;
import java.util.ArrayList;

public class Blockchain {
	ArrayList<Block> chain = new ArrayList<Block>();
	
	public Blockchain() {
		
		Block genericBlock = new Block(0, new Date().getTime(),"Generic Block Data",0);
		
		chain.add(genericBlock);
	}
	public void addBlock(Block newBlock) {
	    Block prevBlock = chain.get(chain.size() - 1);
	    newBlock.setPreviousHash(prevBlock.getHash());
	    newBlock.setHash(newBlock.calculateHash()); 
	    chain.add(newBlock); 
	}
	
	public boolean validateChain() {
		for(int i=1;i<chain.size();i++) {
			Block prevBlock = chain.get(i-1);
			Block currBlock = chain.get(i);
			
			if(!(currBlock.getHash()==currBlock.calculateHash())) {
				System.out.print("Hash MisMatch,Chain invalid");
				return false;
			}
			if(!(currBlock.getPreviousHash()==prevBlock.getHash())) {
				System.out.print("PrevHash MisMatch,Chain invalid");
				return false;
			}
		}
		return true;
		
	}
	public void DisplayBlockChain() {
		for(Block block: chain) {
			 System.out.println("Block #" + block.getIndex()+"\t" + "  Hash: " + block.getHash()+"\t"+" Time: " + block.getTimeStamp()+"\t"+"  Data: "+ block.getData()+"\t" +"  PrevHash: "+ block.getPreviousHash());
		}
	}
	public Block getLatestBlock() {
		
		return chain.get(chain.size()-1);
	}


}
