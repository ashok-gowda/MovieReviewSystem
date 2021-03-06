package service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import model.Movie;
import model.MovieWithComments;

public interface IMovieService {
	
	
	public List<Movie> getListOfMoviesByGenre(String genre);
	
	public List<Movie> getListOfMoviesByLanguage(String language);
	
	public List<Movie> getListOfMoviesByReleaseRange(String category);
	
	public List<Movie> getListOfMoviesBySearchTerm(String term);
	
	public Movie getMovieInformationById(String id);
	
	public MovieWithComments getMovieInformationWithCommentsByMovieId(String movieId);
	
	public boolean checkIfMovieIdisValid(String movieId);
	
	public void insertCommentsAndRatings(String userId, String movieId, String comment, String rating);
	
	public void insertMovie(Movie movie);
	
	public void deleteMovie(String movieId);
	
	public List<Movie> fetchAllMovies();
	
	public void updateMovie(Movie movie,String movieId);
	
	public List<Movie> getListOfTopRatedMovies();
	
	public List<Integer> getDistinctUsersWhoHaveCommented();
	
	public Map<Integer,Integer> getMappingOfMoviesCommentedWithRatingsForUser(String userId);
	
	public List<Movie> getRecommendedMovies(String username);
	
	public List<Movie> getMoviesByListOfIds(List<Integer> listOfIds);

	
	public Movie getMovieForEditInformation(String movieId) ;
}
