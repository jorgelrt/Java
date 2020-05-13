package entidades;

import entidades.enums.ColorEstudo;

public class Rectangle extends Shape{
	private Double widht;
	private Double height;
	//Construtor
	public Rectangle(ColorEstudo color, Double widht, Double height) {
		super(color);
		this.widht = widht;
		this.height = height;		
	}
	//Getters and Setters
	public Double getWidht() {
		return widht;
	}
	public void setWidht(Double widht) {
		this.widht = widht;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	@Override
	public Double area() {
		return widht * height;
	};
}
