package type;

import java.util.Vector;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TypeInterface 
{
	@GET("type/{id}/")
	Call<Vector<Type>> getType (@Path("id") int id);
}
