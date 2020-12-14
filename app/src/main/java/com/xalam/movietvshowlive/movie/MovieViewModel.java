package com.xalam.movietvshowlive.movie;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.xalam.movietvshowlive.data.source.ContentRepository;
import com.xalam.movietvshowlive.data.source.local.entity.MoviesEntity;

import java.util.List;

public class MovieViewModel extends ViewModel {
    private ContentRepository contentRepository;

    public MovieViewModel(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public LiveData<List<MoviesEntity>> getMovies() {
        return contentRepository.getAllMovies();
    }
}
