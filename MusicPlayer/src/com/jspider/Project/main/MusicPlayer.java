
package com.jspider.Project.main;

import java.util.LinkedList;
import java.util.Scanner;

import com.jspiders.musicOperations.MusicOperation;

import Song.Song;

public class MusicPlayer {
	
		
		static MusicOperation songOperation = new MusicOperation();
		static boolean loop = true;
		private static Song song;
		public static void main(String[] args) {
		while (loop) {
		menu();
		}
		}
		private static Song menu() {
		System.out.println("Please Select Menu option:\n" + "1.Play\n"
		+ "2.Add/Remove\n"
		+ "3.Edit\n"
		+ "4.Exit");
		try (Scanner sc = new Scanner(System.in)) {
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
		System.out.println("Please Select option:\n1.Choose Song\n"
		+ "2.Play All Song\n"
		+ "3.Random Song\n"
		+ "4.Go Back ");
		int option = sc.nextInt();
		switch (option) {
		case 1: {
		songOperation.chooseSongToPlay();
		menu();
		break;
		}
		case 2: {
		songOperation.playAllSongs();
		menu();
		break;
		}
		case 3: {
		songOperation.playRandomSong();
		menu();
		break;
		}
		case 4: {
		System.out.println("Exit from Playlist.");
		menu();
		break;
		}
		default:
		throw new IllegalArgumentException("Unexpected value: " + option);
		}
		break;
		}
		case 2:{
		System.out.println("Please Select option:\n1.Add Song\n"
		+ "2.Remove Song");
		int option = sc.nextInt();
		switch (option) {
		case 1: {
		songOperation.addSongs();
		menu();
		break;
		}
		case 2: {
		songOperation.removeSong();
		menu();
		break;
		}
		default:
		throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		break;
		}
		// case 3: {
		// songOperation.editSong();
		// loop = false;
		// break;
		// }
		case 4: {
		System.out.println("Exit from Playlist......");
		menu();
		break;
		}
		default:
		throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		}
		return song;
		}
		}
