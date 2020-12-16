package emanuelkrowegoran.gmail.com.Login.api;

public class koneksi {

    public static final String BASE_URL_API = "http://192.168.1.222/api/";

    public static BaseApiService getAPIService() {
        return RetrofitClient.getClient(BASE_URL_API)
                .create(BaseApiService.class);
    }

}