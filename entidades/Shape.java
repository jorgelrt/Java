package entidades;

import entidades.enums.ColorEstudo;

public abstract class Shape {
	private ColorEstudo color;
	//Contrutor
	public Shape(ColorEstudo color) {
		this.color = color;
	}
	//Getters and Setters
	public ColorEstudo getColor() {
		return color;
	}
	
	public void setColor(ColorEstudo color) {
		this.color = color;
	}
	//Outros
	public abstract Double area();
}
