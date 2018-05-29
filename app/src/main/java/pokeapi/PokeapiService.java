package pokeapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import models.PokemonRespuesta;

public interface PokeapiService {

    @GET("pokemon")
    retrofit2.Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);

}

