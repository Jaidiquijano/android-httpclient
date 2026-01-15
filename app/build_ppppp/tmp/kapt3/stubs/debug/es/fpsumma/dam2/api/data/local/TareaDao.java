package es.fpsumma.dam2.api.data.local;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\rH\'\u00a8\u0006\u0010\u00c0\u0006\u0003"}, d2 = {"Les/fpsumma/dam2/api/data/local/TareaDao;", "", "insert", "", "tarea", "Les/fpsumma/dam2/api/data/local/entity/TareaEntity;", "(Les/fpsumma/dam2/api/data/local/entity/TareaEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "deleteById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTarea", "Lkotlinx/coroutines/flow/Flow;", "getAllTareas", "", "app_debug"})
@androidx.room.Dao()
public abstract interface TareaDao {
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    es.fpsumma.dam2.api.data.local.entity.TareaEntity tarea, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    es.fpsumma.dam2.api.data.local.entity.TareaEntity tarea, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM tareas WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * from tareas WHERE id = :id")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<es.fpsumma.dam2.api.data.local.entity.TareaEntity> getTarea(int id);
    
    @androidx.room.Query(value = "SELECT * from tareas ORDER BY titulo ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<es.fpsumma.dam2.api.data.local.entity.TareaEntity>> getAllTareas();
}