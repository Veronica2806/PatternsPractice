package org.seat;

public class Chair extends Seat{
	Chair(){}
	Chair(Chair source){
		super(source);
	}

	@Override
	public Seat clone() {
		return new Chair(this);
	}
}
