
public class Block {
	private int index;
	private long timeStamp;
	private String data;
	private int previousHash;
	private int hash;
	
	
	public Block() {
		
	}
	public Block(int index, long timeStamp, String data, int prevHash ) {
		this.index=index;
		this.timeStamp = timeStamp;
		this.data = data;
		this.previousHash = prevHash;
		this.setHash(calculateHash());
		
	}
	public int calculateHash() {
		String blockData = index+timeStamp+data+previousHash;
		return blockData.hashCode();
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index=index;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data =data;
	}
	public int getPreviousHash() {
		return previousHash;
	}
	public void setPreviousHash(int i) {
		this.previousHash = i;
	}
	public int getHash() {
		return hash;
	}
	public void setHash(int hash) {
		this.hash = hash;
	}
}



	