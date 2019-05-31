package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Pub
 */
public class Pub {


	long id;
	String name;
	int numberOfSeats;
	String address;
	List<Pub> allPubs = new ArrayList<>();

	public Pub() {
	}

	public Pub(String name, int numberOfSeats, String address) {
		this.name = name;
		this.numberOfSeats = numberOfSeats;
		this.address = address;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the numberOfSeats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param numberOfSeats the numberOfSeats to set
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "{id: "+id+"}This is the " + name + ", with " + numberOfSeats + " seats at " + address;
	}

	public List<Pub> getAllPubs() {
		return allPubs;
	}
}
