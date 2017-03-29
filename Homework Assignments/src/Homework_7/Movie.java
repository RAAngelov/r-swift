package Homework_7;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;
import java.io.Serializable;

public class Movie implements Serializable {
	String title;
	String director;
	String [] actors;
	String ReleaseDate;
	Movie(String title,String director,String [] actors,String ReleaseDate){
		this.title = title;
		this.director = director;
		this.actors = (String[]) Arrays.copyOf(actors,actors.length);
		this.ReleaseDate = ReleaseDate;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setDirector(String director){
		this.director = director;
	}
	public String getDirector(){
		return director;
	}
	public void setActors(String [] actors){
		this.actors = (String[]) Arrays.copyOf(actors,actors.length);
	}
	public String [] getActors(){
		return actors;
	}
	public void setDate(String ReleaseDate){
		this.ReleaseDate = ReleaseDate;
	}
	public String getReleaseDate(){
		return ReleaseDate;
	}
	public String toString() {
        return String.format("%s %s %s %s",title,director,Arrays.toString(actors),ReleaseDate);
        
        
    }
}

