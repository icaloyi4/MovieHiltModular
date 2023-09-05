package id.lunartechno.features.home.repository

import id.lunartechno.moviehiltmodular.core.network.ApiClient
import id.lunartechno.moviehiltmodular.core.network.BaseResponse
import id.lunartechno.moviehiltmodular.core.network.response.MovieResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class HomeRepository @Inject constructor(private val apiClient: ApiClient){

    fun getTopRatedMovie(page : String? ="1", language: String? ="", region : String? ="") =  flow<BaseResponse<MovieResponse>> {
        try {
            val data = HashMap<String, String>()
            data["language"] = language ?: ""
            data["page"] = page ?: "1"
            data["region"] = region ?: ""
            val getTopRated = apiClient.getTopRatedMovie(queryMap = data)
            if (getTopRated.isSuccessful){
                emit(BaseResponse<MovieResponse>(data= getTopRated.body()))
            } else {
                emit(BaseResponse(code = getTopRated.code(), message = getTopRated.message()))
            }
        } catch (e: Exception){
            emit(BaseResponse(code = 500, message = e.message))
        }
    }.flowOn(Dispatchers.IO)

    fun getNowPlayingMovie(page : String? ="1", language: String? ="", region : String? ="") =  flow<BaseResponse<MovieResponse>> {
        try {
            val data = HashMap<String, String>()
            data["language"] = language ?: ""
            data["page"] = page ?: "1"
            data["region"] = region ?: ""
            val getTopRated = apiClient.getNowPlayingMovie(queryMap = data)
            if (getTopRated.isSuccessful){
                emit(BaseResponse<MovieResponse>(data= getTopRated.body()))
            } else {
                emit(BaseResponse(code = getTopRated.code(), message = getTopRated.message()))
            }
        } catch (e: Exception){
            emit(BaseResponse(code = 500, message = e.message))
        }
    }.flowOn(Dispatchers.IO)
}