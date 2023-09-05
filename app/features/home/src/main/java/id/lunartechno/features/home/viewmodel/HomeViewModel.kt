package id.lunartechno.features.home.viewmodel

import android.app.Application
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import id.lunartechno.features.home.repository.HomeRepository
import id.lunartechno.moviehiltmodular.core.network.response.MovieResponse
import id.lunartechno.moviehiltmodular.core.network.response.ResultMovie
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val _app: Application , private val _repo: HomeRepository) : AndroidViewModel(_app) {
    private val _topRated = mutableStateOf<List<ResultMovie>>(emptyList())
    val topRatedList : State<List<ResultMovie>> = _topRated

    private val _nowPlaying = mutableStateOf<List<ResultMovie>>(emptyList())
    val nowPlayingList : State<List<ResultMovie>> = _nowPlaying

    init {
        getTopRatedMovie()
        getNowPlayingMovie()
    }

    private fun getTopRatedMovie(){
       viewModelScope.launch {
           _repo.getTopRatedMovie().collect(){
               if (it.code==200){
                   it.data?.results?.let { listMovie ->
                       _topRated.value = listMovie
                   }

               }
           }
       }
    }

    private fun getNowPlayingMovie(){
        viewModelScope.launch {
            _repo.getNowPlayingMovie().collect(){
                if (it.code==200){
                    it.data?.results?.let { listMovie ->
                        _nowPlaying.value = listMovie
                    }

                }
            }
        }
    }
}