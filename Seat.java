package test;

public class Seat {
	
	 /**
	 * Seat's id. 
	 */ 

	private int seatId;
	
	 /**
	 * Determines if the seat is assigned or not. 
	 */ 
	
	private boolean assigned;
	
	 /**
	 * The customerId related to the seat.
	 */ 
	
	private int customerId = 0;
	
	 /**
	 * Creates a seat. 
	 * @param seat-id - the seat's id.
	 */ 
	
	public Seat(int seat_id){
		seatId = seat_id;
	}
	
	 /** 
	 * @returns int - the seat's id.
	 */

	public int getSeatID(){
		return seatId;
	}
	
	 /** 
	 * @returns int - the customer's id.
	 */
	
	public int getCustomerId(){
		return customerId;
	}
	
	 /** 
	 * @returns boolean - if the seat is occupied or not.
	 */
	
	public boolean isOccupied(){
		return assigned;
	}
	
	 /**
	 * Assigns the seat. 
	 * @param cust-id - the customer's id.
	 */ 
	
	public void assign(int cust_id){
		customerId = cust_id;
		assigned = true;
	}
	
	 /**
	 * Unassigns the seat. 
	 */ 
	
	public void unAssign(){
		assigned = false;
		customerId = 0;
	}
}
