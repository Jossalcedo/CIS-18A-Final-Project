package finalproject;
	
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class Items{
	private String name;

	Items(String n){
	name = n;
	}

void show(){
	System.out.println(name);
	System.out.println();
	}
}

class MenuItems{
	
	public static void main(String ars[]){
	Items drinks[] = new Items[6];
	drinks[0] = new Items("Moscow Mule");
	
	drinks[1] = new Items("Tequila Sunrise: $9.00");

	drinks[2] = new Items("LA Water: $9.00");

	drinks[3] = new Items("Adios: $9.00");

	drinks[4] = new Items("Bloody Mary: $9.00");

	drinks[5] = new Items("Long Island Ice Tea: $9.00");
	
	for(int i=0; i < drinks.length; i++) drinks[i].show();

	ButtonDrinks ob = new ButtonDrinks();
	}
}

