package com.example.fastnewsrn.api;

import com.example.fastnewsrn.model.NewsResponse;
import com.example.fastnewsrn.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApiService {
    @GET("top-headlines")
    Call<NewsResponse> getTopHeadlines(@Query("country") String country, @Query("apiKey") String apiKey);
}