package es.fpsumma.dam2.api.data.local;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import es.fpsumma.dam2.api.data.local.entity.TareaEntity;
import java.lang.Class;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class TareaDao_Impl implements TareaDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<TareaEntity> __insertAdapterOfTareaEntity;

  private final EntityDeleteOrUpdateAdapter<TareaEntity> __updateAdapterOfTareaEntity;

  public TareaDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfTareaEntity = new EntityInsertAdapter<TareaEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR IGNORE INTO `tareas` (`id`,`titulo`,`descripcion`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final TareaEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitulo() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getTitulo());
        }
        if (entity.getDescripcion() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getDescripcion());
        }
      }
    };
    this.__updateAdapterOfTareaEntity = new EntityDeleteOrUpdateAdapter<TareaEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `tareas` SET `id` = ?,`titulo` = ?,`descripcion` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final TareaEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitulo() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getTitulo());
        }
        if (entity.getDescripcion() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getDescripcion());
        }
        statement.bindLong(4, entity.getId());
      }
    };
  }

  @Override
  public Object insert(final TareaEntity tarea, final Continuation<? super Unit> $completion) {
    if (tarea == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfTareaEntity.insert(_connection, tarea);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object update(final TareaEntity tarea, final Continuation<? super Unit> $completion) {
    if (tarea == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __updateAdapterOfTareaEntity.handle(_connection, tarea);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Flow<TareaEntity> getTarea(final int id) {
    final String _sql = "SELECT * from tareas WHERE id = ?";
    return FlowUtil.createFlow(__db, false, new String[] {"tareas"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitulo = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "titulo");
        final int _columnIndexOfDescripcion = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "descripcion");
        final TareaEntity _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpTitulo;
          if (_stmt.isNull(_columnIndexOfTitulo)) {
            _tmpTitulo = null;
          } else {
            _tmpTitulo = _stmt.getText(_columnIndexOfTitulo);
          }
          final String _tmpDescripcion;
          if (_stmt.isNull(_columnIndexOfDescripcion)) {
            _tmpDescripcion = null;
          } else {
            _tmpDescripcion = _stmt.getText(_columnIndexOfDescripcion);
          }
          _result = new TareaEntity(_tmpId,_tmpTitulo,_tmpDescripcion);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Flow<List<TareaEntity>> getAllTareas() {
    final String _sql = "SELECT * from tareas ORDER BY titulo ASC";
    return FlowUtil.createFlow(__db, false, new String[] {"tareas"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitulo = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "titulo");
        final int _columnIndexOfDescripcion = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "descripcion");
        final List<TareaEntity> _result = new ArrayList<TareaEntity>();
        while (_stmt.step()) {
          final TareaEntity _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpTitulo;
          if (_stmt.isNull(_columnIndexOfTitulo)) {
            _tmpTitulo = null;
          } else {
            _tmpTitulo = _stmt.getText(_columnIndexOfTitulo);
          }
          final String _tmpDescripcion;
          if (_stmt.isNull(_columnIndexOfDescripcion)) {
            _tmpDescripcion = null;
          } else {
            _tmpDescripcion = _stmt.getText(_columnIndexOfDescripcion);
          }
          _item = new TareaEntity(_tmpId,_tmpTitulo,_tmpDescripcion);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Object deleteById(final int id, final Continuation<? super Unit> $completion) {
    final String _sql = "DELETE FROM tareas WHERE id = ?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
