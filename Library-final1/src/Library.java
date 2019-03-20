
public abstract class Library implements Printable {

	
	private String itemNo;
	private String title;
	private String type;
	private boolean reserve;
	private boolean borrowStatus = false; // to do check in and check out status
	
	
	//Constructor
	public Library(String itemNo, String title) {
		this.itemNo = itemNo;
		this.title = title;
	}
	
	// implementing the toString to represent the object
	public String toString() {
		return ("Item ID: " + itemNo + "\n Reserved: " + this.isReserve() + "\n Checked out: " + 
					this.isBorrowStatus() + "\n Media type: " + type + "\n Title: " + title);
	}
//to check is it reserved or not
	public boolean isReserve() {
		return reserve;
	}

	//to make it reserved
	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}

	//check in or check out
	public boolean isBorrowStatus() {
		return borrowStatus;
	}

	public void setBorrowStatus(boolean borrowStatus) {
		this.borrowStatus = borrowStatus;
	}
	
	//weather it is book or dvd or magazine or cd
	public void setMediaType(String mediaType) {
		this.type = mediaType;
	}
	
	
	
	
	
}
