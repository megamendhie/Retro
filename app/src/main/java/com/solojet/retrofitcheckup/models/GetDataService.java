package com.solojet.retrofitcheckup.models;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("api/Enrollees?PolicyNumber=NHA-649194554162")
    Call<List<Model>> employee();
}
