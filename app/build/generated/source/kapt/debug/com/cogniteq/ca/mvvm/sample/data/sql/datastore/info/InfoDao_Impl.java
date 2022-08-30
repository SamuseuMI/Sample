package com.cogniteq.ca.mvvm.sample.data.sql.datastore.info;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InfoDao_Impl implements InfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<InfoEntity> __insertionAdapterOfInfoEntity;

  private final EntityDeletionOrUpdateAdapter<InfoEntity> __updateAdapterOfInfoEntity;

  public InfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInfoEntity = new EntityInsertionAdapter<InfoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `information` (`info`,`last_update_date`,`id`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InfoEntity value) {
        if (value.getInfo() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getInfo());
        }
        if (value.getLastUpdateDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLastUpdateDate());
        }
        stmt.bindLong(3, value.getId());
      }
    };
    this.__updateAdapterOfInfoEntity = new EntityDeletionOrUpdateAdapter<InfoEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `information` SET `info` = ?,`last_update_date` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InfoEntity value) {
        if (value.getInfo() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getInfo());
        }
        if (value.getLastUpdateDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLastUpdateDate());
        }
        stmt.bindLong(3, value.getId());
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public Object save(final InfoEntity model, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfInfoEntity.insert(model);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final InfoEntity model, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfInfoEntity.handle(model);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<InfoEntity>> getAll() {
    final String _sql = "SELECT * FROM information";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"information"}, new Callable<List<InfoEntity>>() {
      @Override
      public List<InfoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfInfo = CursorUtil.getColumnIndexOrThrow(_cursor, "info");
          final int _cursorIndexOfLastUpdateDate = CursorUtil.getColumnIndexOrThrow(_cursor, "last_update_date");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<InfoEntity> _result = new ArrayList<InfoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final InfoEntity _item;
            final String _tmpInfo;
            if (_cursor.isNull(_cursorIndexOfInfo)) {
              _tmpInfo = null;
            } else {
              _tmpInfo = _cursor.getString(_cursorIndexOfInfo);
            }
            final String _tmpLastUpdateDate;
            if (_cursor.isNull(_cursorIndexOfLastUpdateDate)) {
              _tmpLastUpdateDate = null;
            } else {
              _tmpLastUpdateDate = _cursor.getString(_cursorIndexOfLastUpdateDate);
            }
            _item = new InfoEntity(_tmpInfo,_tmpLastUpdateDate);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getAllData(final SupportSQLiteQuery query,
      final Continuation<? super List<? extends InfoEntity>> continuation) {
    final SupportSQLiteQuery _internalQuery = query;
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<? extends InfoEntity>>() {
      @Override
      public List<? extends InfoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final List<InfoEntity> _result = new ArrayList<InfoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final InfoEntity _item;
            _item = __entityCursorConverter_comCogniteqCaMvvmSampleDataSqlModelInfoEntity(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private InfoEntity __entityCursorConverter_comCogniteqCaMvvmSampleDataSqlModelInfoEntity(
      Cursor cursor) {
    final InfoEntity _entity;
    final int _cursorIndexOfInfo = cursor.getColumnIndex("info");
    final int _cursorIndexOfLastUpdateDate = cursor.getColumnIndex("last_update_date");
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final String _tmpInfo;
    if (_cursorIndexOfInfo == -1) {
      _tmpInfo = null;
    } else {
      if (cursor.isNull(_cursorIndexOfInfo)) {
        _tmpInfo = null;
      } else {
        _tmpInfo = cursor.getString(_cursorIndexOfInfo);
      }
    }
    final String _tmpLastUpdateDate;
    if (_cursorIndexOfLastUpdateDate == -1) {
      _tmpLastUpdateDate = null;
    } else {
      if (cursor.isNull(_cursorIndexOfLastUpdateDate)) {
        _tmpLastUpdateDate = null;
      } else {
        _tmpLastUpdateDate = cursor.getString(_cursorIndexOfLastUpdateDate);
      }
    }
    _entity = new InfoEntity(_tmpInfo,_tmpLastUpdateDate);
    if (_cursorIndexOfId != -1) {
      final long _tmpId;
      _tmpId = cursor.getLong(_cursorIndexOfId);
      _entity.setId(_tmpId);
    }
    return _entity;
  }
}
