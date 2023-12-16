package org.seat;

public class Sofa extends Seat{
	private int totalSeats;
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	Sofa(){}
	Sofa(Sofa source){
		super(source);
		this.totalSeats = source.totalSeats;
	}
	@Override
	public Seat clone() {
		return new Sofa(this);
	}
}
