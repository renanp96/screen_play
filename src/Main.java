import resources.Movie;

public class Main {
	public static void main(String[] args) {
		Movie mv1 = new Movie();
		mv1.setMovieName("Godzilla vs Kong");
        mv1.setReleaseYear(2022);
		System.out.println(mv1.getMovieName());
	}
}
