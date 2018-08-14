package com.rahul.dm;

import java.util.Scanner;
class base {
	private int centment =10;
	protected int sand =10;
	int brick =10;
	public base() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCentment() {
		return centment;
	}
	public void setCentment(int centment) {
		this.centment = centment;
	}
	public int getSand() {
		return sand;
	}
	public void setSand(int sand) {
		this.sand = sand;
	}
	public int getBrick() {
		return brick;
	}
	public void setBrick(int brick) {
		this.brick = brick;
	}
	
}
public class dsa extends base{
	public dsa() {
		super();
	}
	static int a1=7;
	String name ="asd";
	public final void hello(){
		System.out.println("in sds");
	}
	public static void main(String[] args) {
		base ba = new dsa();
		dsa fs =  new dsa();
		fs.setBrick(30);
		System.out.println(fs.sand);
		ba =fs;
		System.out.println(ba.brick);
		
	}
	
	

}
