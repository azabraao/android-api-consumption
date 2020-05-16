package br.com.azabraao.apiconsumption;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
public interface MyApiEndpointInterface {
    @GET("posts")
    Call<List<Post>> getPosts();
}