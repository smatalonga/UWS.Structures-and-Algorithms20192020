package com.uws.assesedlab202iinclass;

import java.util.*;

public class Song implements Comparable{
	//Attributes ~ members
	private String songTitle;
	private String artist;
	private int year;
	//Consutrctor --> special type of method
	public Song() {
		this.songTitle = "";
		this.artist = "";
		this.year = -1;
	}
	public Song(String songName, String artist2, int year2) {
		this.songTitle = songName;
		this.artist= artist2;
		this.year = year2;
	}
	//setters and getters
	public String getSongTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year < 1900) {
			//Throw errror
		}
		else {
			this.year = year;    
		}
		
	}
	@Override
	public String toString() {
		return "Song [songTitle=" + songTitle + ", artist=" + artist + ", year=" + year + "]";
	}
	@Override
	public int compareTo(Object arg0) {
	
		Song aux = (Song) arg0;
		int answer = this.year - aux.getYear();
		if (answer == 0) {
			answer = this.songTitle.compareToIgnoreCase(aux.getSongTitle());
		}
		else if (answer > 0) {
			answer = 1;
		}
		else {
			answer = -1;
		}
		return answer;
	}
	
	
	//methods

}
