package com.yagmurerdogan.movieapp.screens.home

import android.util.Log
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yagmurerdogan.movieapp.model.Movie
import com.yagmurerdogan.movieapp.model.getMovies
import com.yagmurerdogan.movieapp.navigation.MovieScreens
import com.yagmurerdogan.movieapp.widgets.MovieRow

@ExperimentalAnimationApi
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Transparent,
                elevation = 0.dp
            ) {
                Text(text = "Movies")
            }
        },
    ) {
        MainContent(navController = navController)
    }
}

@ExperimentalAnimationApi
@Composable
fun MainContent(
    navController: NavController,
    moviesList: List<Movie> = getMovies()
) {
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = moviesList) {
                MovieRow(movie = it) { movie ->
                    navController.navigate(route = MovieScreens.DetailScreen.name + "/$movie")
                }
            }
        }
    }
}