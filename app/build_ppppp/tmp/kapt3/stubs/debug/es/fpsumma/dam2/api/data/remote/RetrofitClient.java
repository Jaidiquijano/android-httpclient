package es.fpsumma.dam2.api.data.remote;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Les/fpsumma/dam2/api/data/remote/RetrofitClient;", "", "<init>", "()V", "BASE_URL", "", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit$delegate", "Lkotlin/Lazy;", "tareaAPI", "Les/fpsumma/dam2/api/data/remote/api/TareaAPI;", "getTareaAPI", "()Les/fpsumma/dam2/api/data/remote/api/TareaAPI;", "tareaAPI$delegate", "app_debug"})
public final class RetrofitClient {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "http://10.0.2.2:3000/";
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy retrofit$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy tareaAPI$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final es.fpsumma.dam2.api.data.remote.RetrofitClient INSTANCE = null;
    
    private RetrofitClient() {
        super();
    }
    
    private final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final es.fpsumma.dam2.api.data.remote.api.TareaAPI getTareaAPI() {
        return null;
    }
}