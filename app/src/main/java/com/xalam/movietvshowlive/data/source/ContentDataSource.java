package com.xalam.movietvshowlive.data.source;

import androidx.lifecycle.LiveData;

import com.xalam.movietvshowlive.data.source.local.entity.MoviesEntity;
import com.xalam.movietvshowlive.data.source.local.entity.TVShowsEntity;

import java.util.List;

public interface ContentDataSource {
    LiveData<List<MoviesEntity>> getAllMovies();

    LiveData<List<TVShowsEntity>> getAllTvShows();
}
