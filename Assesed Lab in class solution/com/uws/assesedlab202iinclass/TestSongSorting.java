package com.uws.assesedlab202iinclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSongSorting {

	@Test
	void testSort() throws SongTitleNotUniqueException {
		//Set the environment
		Song inmylife = new Song("In my life", "Beatles", 1967);
		Song help = new Song("Help", "Beatles", 1967);
		Song goodnight = new Song("GoodNight", "Kidsongss", 1981);
		
		Playlist testItem = new Playlist(3);
		testItem.addSong(inmylife);
		testItem.addSong(help);
		testItem.addSong(goodnight);
		
		//set upthe input & stimulate the test item
		testItem.sort();
		//Compare outputs
		Song[] aux = testItem.getSongs();
		assertEquals(help, aux[0]);
		assertEquals(inmylife, aux[1]);
		assertEquals(goodnight, aux[2]);
	}

}
