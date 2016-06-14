package com.practice.JStreams;

public class Student {
private String name;
private String city;
private boolean isPlayer;
private String play_games;
private int age;
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + ", isPlayer=" + isPlayer + ", play_games=" + play_games
			+ ", age=" + age + "]";
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the isPlayer
 */
public boolean isPlayer() {
	return isPlayer;
}
/**
 * @param isPlayer the isPlayer to set
 */
public void setPlayer(boolean isPlayer) {
	this.isPlayer = isPlayer;
}
/**
 * @return the play_games
 */
public String getPlay_games() {
	return play_games;
}
/**
 * @param play_games the play_games to set
 */
public void setPlay_games(String play_games) {
	this.play_games = play_games;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}

}
