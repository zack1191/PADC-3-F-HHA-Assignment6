package com.hha.heinhtetaung.movieshelf.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hha.heinhtetaung.movieshelf.R;
import com.hha.heinhtetaung.movieshelf.adapters.MovieImageAdapter;
import com.hha.heinhtetaung.movieshelf.adapters.MovieTrailerAdapter;
import com.hha.heinhtetaung.movieshelf.viewitems.ImagesMovieViewItem;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5 on 12/13/2017.
 */

public class MovieDetailsActivity extends AppCompatActivity {
    //    @BindView(R.id.vp_movie_trailer)
//    ViewPager viewPager;
    @BindView(R.id.rv_movie_trailer)
    RecyclerView recyclerView2;

    private MovieImageAdapter movieImageAdapter;
    private MovieTrailerAdapter movieTrailerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_movie_details);
        ButterKnife.bind(this, this);
//        movieImageAdapter = new MovieImageAdapter();
//        viewPager.setAdapter(movieImageAdapter);
        movieTrailerAdapter = new MovieTrailerAdapter();
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(linearLayoutManager1);
        recyclerView2.setAdapter(movieTrailerAdapter);


    }
}
