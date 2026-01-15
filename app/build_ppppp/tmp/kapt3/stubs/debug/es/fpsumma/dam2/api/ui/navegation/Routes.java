package es.fpsumma.dam2.api.ui.navegation;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Les/fpsumma/dam2/api/ui/navegation/Routes;", "", "<init>", "()V", "HOME", "", "TAREA_LISTADO", "TAREA_ADD", "TAREA_VIEW", "TAREA_LISTADO_API", "tareaView", "id", "", "app_debug"})
public final class Routes {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOME = "home";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAREA_LISTADO = "tareas/listado";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAREA_ADD = "tareas/nueva";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAREA_VIEW = "tareas/detalle/{id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAREA_LISTADO_API = "tareas_api/listado";
    @org.jetbrains.annotations.NotNull()
    public static final es.fpsumma.dam2.api.ui.navegation.Routes INSTANCE = null;
    
    private Routes() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String tareaView(int id) {
        return null;
    }
}