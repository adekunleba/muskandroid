package com.musk.musk_android.data

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST
import retrofit2.http.Query

interface PharmacyApiService {

    companion object Factory {
        fun create(): PharmacyApiService {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.musk.com/")
                .build()

            return retrofit.create(PharmacyApiService::class.java)
        }
    }


    //Create a function that post using the api
    @POST("pharmacy/")
    fun updatePharmacy(@Query("q") query: Pharmacy) : Observable<Unit>
}