package resources;

public class Movie {
	private String movieName;
	private String synopsis;
	private int releaseYear;
    private boolean avaliable;
    private double rating;
	
    //Empty construcutor
	public Movie() {}
	
    //Constructor with params
	public Movie(String movieName, int releaseYear) {
		this.movieName = movieName;
		this.releaseYear = releaseYear;
	}

    //Getters and Setters
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

    public boolean isAvaliable() {
        return this.avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public boolean getAvaliable() {
        return this.avaliable;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    //Overriding toString method from Object
    @Override
    public String toString() {
        return "{" +
            " movieName='" + getMovieName() + "'" +
            ", synopsis='" + getSynopsis() + "'" +
            ", releaseYear='" + getReleaseYear() + "'" +
            ", avaliable='" + isAvaliable() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }
}
