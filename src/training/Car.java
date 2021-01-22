package training;

public class Car {
	
	private String producer;
	private String model;
	private int year;
	
	Car(String producer, String model, int year) {
		this.setProducer(producer);
		this.setModel(model);
		this.setYear(year);
	}
	
	public String getProducer() {
		return producer;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	void drive() {
		System.out.println("You are driving " + this.producer +" "+ this.model);
	}

}
