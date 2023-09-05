package id.lunartechno.moviehiltmodular.core.network

import id.lunartechno.moviehiltmodular.core.network.response.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.QueryMap

interface ApiClient {

    @Headers("Authorization:${accessToken}")
    @GET(topRated)
    suspend fun getTopRatedMovie(@QueryMap queryMap: Map<String, String>) : Response<MovieResponse>

    @Headers("Authorization:${accessToken}")
    @GET(nowPlaying)
    suspend fun getNowPlayingMovie(@QueryMap queryMap: Map<String, String>) : Response<MovieResponse>

}