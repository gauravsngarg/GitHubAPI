package gauravsngarg.com.githubapi.rest;

import gauravsngarg.com.githubapi.model.GitHubUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by GG on 26/02/18.
 */

public interface GitHubUserEndPoints {

    @GET("/user/{user}")
    Call<GitHubUser> getUser(@Path("user") String user);



}
