package com.example.demo.box.dto;

public class Box {

	private int no;
	private int x;
	private int y;
	private int width;
	private int height;
	private String color;
	
	@Override
	public String toString() {
		return "box [no=" + no + ", x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", color="
				+ color + "]";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	
	
}
