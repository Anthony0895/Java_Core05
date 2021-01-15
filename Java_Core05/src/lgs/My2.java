package lgs;

public class My2 {

	private int number;
	private String name;
	private String city;

	My2 (){
		number = 1;
		name = "Jan";
		city = "Oslo";
	}
	
	public My2 (int number, String name){
		this.number = number;
		this.name = name;
	}

	public My2 (int number, String name, String city) {
		this (number, name);
		this.city = city;
	}
	
}
