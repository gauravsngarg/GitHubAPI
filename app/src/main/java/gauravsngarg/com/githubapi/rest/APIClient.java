package gauravsngarg.com.githubapi.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by GG on 26/02/18.
 */

public class APIClient {
    public static final String BASE_URL = "https://api.github.com/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }

        return retrofit;
    }
}
