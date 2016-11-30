package type;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.Vector;

import okhttp3.Headers;

public class TypeCallback implements Callback<Vector<Type>> 
{
	@Override
	public void onFailure(Call<Vector<Type>> arg0, Throwable arg1) 
	{
		int i;
		i=0;
		
	}

	@Override
	public void onResponse(Call<Vector<Type>> arg0, Response<Vector<Type>> resp) 
	{
		Vector<Type> types;
		String contentType;
		int code;
		String message;
		boolean isSuccesful;
		
		types = resp.body();
		
		Headers cabeceras = resp.headers();
		contentType = cabeceras.get("Content-Type");
		code = resp.code();
		message = resp.message();
		isSuccesful = resp.isSuccessful();
		
		System.out.println(types.get(0).getId()+", "+types.get(0).getName());
	}
}