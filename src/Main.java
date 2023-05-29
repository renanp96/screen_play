import resources.Movie;

public class Main {
	public static void main(String[] args) {
		Movie mv1 = new Movie();
		mv1.setMovieName("Godzilla vs Kong");
        mv1.setSynopsis("O terror de Toquio contra o solitario gorila da Ilha da Caveira");
        mv1.setReleaseYear(2022);
        mv1.setAvaliable(true);
        mv1.setRating(8.1);

		System.out.println(mv1.toString());
	}
}
