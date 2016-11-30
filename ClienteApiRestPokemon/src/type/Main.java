package type;

import java.io.IOException;
import com.google.gson.Gson;
import okio.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main 
{
	private final static String SERVER_URL = "http://apirestpokemon.iesnervion.com/";
	
	public static void main(String[] args) 
	{
		Retrofit retrofit;
		TypeCallback typeCallback = new TypeCallback();
		
		retrofit = new Retrofit.Builder()
							   .baseUrl(SERVER_URL)
							   .addConverterFactory(GsonConverterFactory.create())
							   .build();
		
		TypeInterface typeInter = retrofit.create(TypeInterface.class);
		
		typeInter.getType(18).enqueue(typeCallback);
	}
}
