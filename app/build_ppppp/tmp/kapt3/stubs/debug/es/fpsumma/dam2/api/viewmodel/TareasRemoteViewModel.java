package es.fpsumma.dam2.api.viewmodel;

/**
 * ViewModel "remoto": obtiene datos desde una API (Retrofit) y expone un estado
 * que la UI (Compose) puede observar.
 *
 * La UI NO llama a Retrofit directamente: solo observa `state`.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Les/fpsumma/dam2/api/viewmodel/TareasRemoteViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "api", "Les/fpsumma/dam2/api/data/remote/api/TareaAPI;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Les/fpsumma/dam2/api/ui/screen/tareas/TareasUIState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadTareas", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class TareasRemoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final es.fpsumma.dam2.api.data.remote.api.TareaAPI api = null;
    
    /**
     * Estado interno (mutable) del ViewModel.
     * Lo mantenemos privado para que SOLO el ViewModel pueda modificarlo.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<es.fpsumma.dam2.api.ui.screen.tareas.TareasUIState> _state = null;
    
    /**
     * Estado público (solo lectura). La UI se suscribe a este StateFlow:
     * - con collectAsState() en Compose
     * - o con collect en otras capas
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<es.fpsumma.dam2.api.ui.screen.tareas.TareasUIState> state = null;
    
    public TareasRemoteViewModel() {
        super();
    }
    
    /**
     * Estado público (solo lectura). La UI se suscribe a este StateFlow:
     * - con collectAsState() en Compose
     * - o con collect en otras capas
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<es.fpsumma.dam2.api.ui.screen.tareas.TareasUIState> getState() {
        return null;
    }
    
    /**
     * Carga el listado de tareas desde la API.
     * - Pone loading=true
     * - Llama al endpoint
     * - Si va bien: convierte DTO -> modelo de app (Tarea) y lo guarda en el estado
     * - Si falla: guarda el error en el estado
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job loadTareas() {
        return null;
    }
}