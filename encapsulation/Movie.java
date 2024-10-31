public class Movie {
  private String title;
  private String director;
  private int duration;

  Movie(String title, String director, int duration) {
    this.title = title;
    this.director = director;
    this.duration = duration;
  }

  String getMovieDetails() {
    return ("Movie title: " + title + ", director: " + director + " duration in mins: " + duration);
  }

  public static void main(String[] args) {
    Movie m = new Movie("Interstellar", "Christopher Nolan", 169);
    System.out.println(m.getMovieDetails());
  }
}
