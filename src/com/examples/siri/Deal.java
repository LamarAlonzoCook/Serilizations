package com.examples.siri;

import java.io.Serializable;

public class Deal implements Serializable {
private static final long servialVersionUID = 4444444L;
//String filename = "./DealDeal.txt";
String name;
String favGame;
boolean aDeal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFavGame() {
	return favGame;
}
public void setFavGame(String favGame) {
	this.favGame = favGame;
}
public boolean isaDeal() {
	return aDeal;
}
public void setaDeal(boolean aDeal) {
	this.aDeal = aDeal;
}
@Override
public String toString() {
	return "Deal [name=" + name + ", favGame=" + favGame + ", aDeal=" + aDeal + "]";
}
public Deal(String name, String favGame, boolean aDeal) {
	super();
	this.name = name;
	this.favGame = favGame;
	this.aDeal = aDeal;
}

}
