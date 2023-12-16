package org.seat;

abstract public class Seat {
	public void setRoom(String room) {
		this.room = room;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	public String getRoom() {
		return room;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	private String room;
	private boolean isAvailable;

	Seat() {}

	Seat(Seat source) {
		this.room = source.room;
		this.isAvailable = source.isAvailable;
	}

	public abstract Seat clone();

}
