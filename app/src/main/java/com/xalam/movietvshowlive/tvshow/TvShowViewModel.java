package com.xalam.movietvshowlive.tvshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.xalam.movietvshowlive.data.source.ContentRepository;
import com.xalam.movietvshowlive.data.source.local.entity.TVShowsEntity;

import java.util.List;

public class TvShowViewModel extends ViewModel {
    private ContentRepository contentRepository;

    public TvShowViewModel(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public LiveData<List<TVShowsEntity>> getTvShows() {
        return contentRepository.getAllTvShows();
    }
}
