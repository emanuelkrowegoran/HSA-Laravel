package emanuelkrowegoran.gmail.com.Login.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface BaseApiService {

    @FormUrlEncoded
    @POST("submitLogin")
    Call<ResponseBody> submitLogin(
            @Field("email") String email,
            @Field("password") String password
    );

}