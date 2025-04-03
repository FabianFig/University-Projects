package Project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Project1.Movies;
import Project1.TVShows;
import Project1.VideoGames;
import Project1.MusicAlbums;		

public class Manager<T> {
	ArrayList<T> mediaList = new ArrayList<T>();

	public void loadCSV(String filename) {
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String type = data[1];
				switch (type) {
				case "Movie":
					Movies movie = new Movie(data[0], data[2], data[3], data[4], Integer.parseInt(data[5]), data[6], Integer.parseInt(data[7]), data[8]);
					mediaList.add((T) movie);
					break;
				case "TV Show":
					TVShows tvShow = new TVShows(data[0], data[2], data[3], data[4], Integer.parseInt(data[5]), data[6], Integer.parseInt(data[7]), data[8]);
					mediaList.add((T) tvShow);
					break;
				case "Video Game":
					VideoGames videoGame = new VideoGames(data[0], data[2], data[3], Integer.parseInt(data[4]), data[5], data[6], Double.parseDouble(data[7]));
					mediaList.add((T) videoGame);
					break;
				case "Music Album":
					MusicAlbums musicAlbum = new MusicAlbums(data[0], Integer.parseInt(data[2]), data[3], data[4], Double.parseDouble(data[5]), Integer.parseInt(data[6]), Double.parseDouble(data[7]), data[8]);
					mediaList.add((T) musicAlbum);
					break;
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}