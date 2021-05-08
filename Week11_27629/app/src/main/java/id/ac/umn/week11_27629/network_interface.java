package id.ac.umn.week11_27629;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface network_interface {
    @GET("posts")
    Call<ArrayList<PostModel>> getPosts();

    @GET("")
    Call<ArrayList<PostModel>> getSomething();
}
