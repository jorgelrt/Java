package entidades;

import entidades.enums.ColorEstudo;

public class Circle extends Shape {
	private static final Double PI=3.1416;
	
	private Double radius;
	//Construtor
	public Circle(ColorEstudo color, Double radius) {
		super(color);
		this.radius = radius;
	}
	@Override
	public Double area() {
		return PI*radius*radius;
	}

	
	
}
