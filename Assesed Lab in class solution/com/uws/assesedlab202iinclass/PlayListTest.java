package com.uws.assesedlab202iinclass;

public class PlayListTest {

	public static void main(String[] args) {
		Playlist mySongList = new Playlist(1);
		
		int userInput = -1;
		do {
			showMenu();
			userInput=askTheUserForInput();
			evaluateUserInput(userInput, mySongList);
			
		}while(userInput != 10);
	}

	private static void evaluateUserInput(int userInput, Playlist mySongList) {
		switch (userInput) {
			case 1:
				addSongToList(mySongList);
				break;
			case 2:
				displaySongs(mySongList);
				break;
			case 3:
				sort(mySongList);
				break;
			case 10:
				break;
			default:
				System.out.println("Plase choose a correct option");
				break;
		}
	}

	private static void sort(Playlist mySongList) {
		mySongList.sort();
		
	}

	private static void displaySongs(Playlist mySongList) {
		Song[] list = mySongList.getSongs();
		
		System.out.println("List of songs");
		for (int i = 0; i<list.length; i++) {
			Song aux = list[i];
			if (aux != null) {
				System.out.println(aux.toString());
			}
		}
		
	}

	private static void addSongToList(Playlist mySongList) {
		try {
			String songName = Input.getString("Enter song name:");
			String artist = Input.getString("Enter artist:");
			int year = Input.getInteger("Enter year:");
		
			Song toBeAdded = new Song(songName, artist, year);
			mySongList.addSong(toBeAdded);
		}
		catch(IndexOutOfBoundsException ioe) {
			System.out.println("Songlist is full");
		}
		catch (SongTitleNotUniqueException sne) {
			System.out.println("Song already in the system");
		}
	}

	private static int askTheUserForInput() {
		return Input.getInteger("Choose an option:");
	}

	private static void showMenu() {
		System.out.println("Welcome to PlayList");
		System.out.println("These are the options");
		System.out.println(" 1) Add a song");
		System.out.println(" 2) Display songs");
		System.out.println(" 3) Sort songs");
		System.out.println("10) Exit");
		
	}

}
