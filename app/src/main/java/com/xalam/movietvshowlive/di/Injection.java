package com.xalam.movietvshowlive.di;

import android.content.Context;

import com.xalam.movietvshowlive.data.source.ContentRepository;
import com.xalam.movietvshowlive.data.source.remote.RemoteDataSources;
import com.xalam.movietvshowlive.utils.JsonHelper;

public class Injection {
    public static ContentRepository provideRepository(Context context) {
        RemoteDataSources remoteDataSources = RemoteDataSources.getInstance(new JsonHelper(context));

        return ContentRepository.getInstance(remoteDataSources);
    }
}
