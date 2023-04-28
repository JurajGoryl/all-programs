
public abstract class UniversalFilm {
	private String movieName;
	private String directorName;
	private int releaseYear;
	private String audienceComment;
	
	
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}	
	public String getDirectorName() {
		return directorName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieName() {
		return movieName;
	}
	
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	
	public void setAudienceComment(String audienceComment) {
		this.audienceComment = audienceComment;
	}
	public String getAudienceComment() {
		return audienceComment;
	}
	
	
	
	

}
