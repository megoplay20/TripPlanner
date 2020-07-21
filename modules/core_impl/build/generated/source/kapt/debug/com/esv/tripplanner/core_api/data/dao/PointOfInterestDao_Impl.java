package com.esv.tripplanner.core_api.data.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.esv.tripplanner.core_api.data.database_converters.DbLocalTimeConverter;
import com.esv.tripplanner.core_api.data.entities.Location;
import com.esv.tripplanner.core_api.data.entities.PointOfInterest;
import com.esv.tripplanner.core_api.helpers.TimeHolder;
import com.esv.tripplanner.core_api.helpers.TimeSpan;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PointOfInterestDao_Impl implements PointOfInterestDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PointOfInterest> __insertionAdapterOfPointOfInterest;

  private final DbLocalTimeConverter __dbLocalTimeConverter = new DbLocalTimeConverter();

  private final EntityDeletionOrUpdateAdapter<PointOfInterest> __deletionAdapterOfPointOfInterest;

  private final EntityDeletionOrUpdateAdapter<PointOfInterest> __updateAdapterOfPointOfInterest;

  public PointOfInterestDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPointOfInterest = new EntityInsertionAdapter<PointOfInterest>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `point_of_interest` (`id`,`name`,`description`,`latitude`,`longitude`,`openTime`,`closeTime`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PointOfInterest value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        final Location _tmpLocation = value.getLocation();
        if(_tmpLocation != null) {
          stmt.bindDouble(4, _tmpLocation.getLatitude());
          stmt.bindDouble(5, _tmpLocation.getLongitude());
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
        }
        final TimeSpan _tmpWorkingHours = value.getWorkingHours();
        if(_tmpWorkingHours != null) {
          final String _tmp;
          _tmp = __dbLocalTimeConverter.convertDateToString(_tmpWorkingHours.getOpenTime());
          if (_tmp == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmp);
          }
          final String _tmp_1;
          _tmp_1 = __dbLocalTimeConverter.convertDateToString(_tmpWorkingHours.getCloseTime());
          if (_tmp_1 == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmp_1);
          }
        } else {
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
      }
    };
    this.__deletionAdapterOfPointOfInterest = new EntityDeletionOrUpdateAdapter<PointOfInterest>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `point_of_interest` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PointOfInterest value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfPointOfInterest = new EntityDeletionOrUpdateAdapter<PointOfInterest>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `point_of_interest` SET `id` = ?,`name` = ?,`description` = ?,`latitude` = ?,`longitude` = ?,`openTime` = ?,`closeTime` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PointOfInterest value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        final Location _tmpLocation = value.getLocation();
        if(_tmpLocation != null) {
          stmt.bindDouble(4, _tmpLocation.getLatitude());
          stmt.bindDouble(5, _tmpLocation.getLongitude());
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
        }
        final TimeSpan _tmpWorkingHours = value.getWorkingHours();
        if(_tmpWorkingHours != null) {
          final String _tmp;
          _tmp = __dbLocalTimeConverter.convertDateToString(_tmpWorkingHours.getOpenTime());
          if (_tmp == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmp);
          }
          final String _tmp_1;
          _tmp_1 = __dbLocalTimeConverter.convertDateToString(_tmpWorkingHours.getCloseTime());
          if (_tmp_1 == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmp_1);
          }
        } else {
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
        stmt.bindLong(8, value.getId());
      }
    };
  }

  @Override
  public Object save(final PointOfInterest arg0, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPointOfInterest.insert(arg0);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object delete(final PointOfInterest arg0, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPointOfInterest.handle(arg0);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object update(final PointOfInterest arg0, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfPointOfInterest.handle(arg0);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public LiveData<List<PointOfInterest>> loadPointOfInterest() {
    final String _sql = "SELECT * FROM point_of_interest";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"point_of_interest"}, false, new Callable<List<PointOfInterest>>() {
      @Override
      public List<PointOfInterest> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfOpenTime = CursorUtil.getColumnIndexOrThrow(_cursor, "openTime");
          final int _cursorIndexOfCloseTime = CursorUtil.getColumnIndexOrThrow(_cursor, "closeTime");
          final List<PointOfInterest> _result = new ArrayList<PointOfInterest>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PointOfInterest _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final Location _tmpLocation;
            if (! (_cursor.isNull(_cursorIndexOfLatitude) && _cursor.isNull(_cursorIndexOfLongitude))) {
              final double _tmpLatitude;
              _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
              final double _tmpLongitude;
              _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
              _tmpLocation = new Location(_tmpLatitude,_tmpLongitude);
            }  else  {
              _tmpLocation = null;
            }
            final TimeSpan _tmpWorkingHours;
            if (! (_cursor.isNull(_cursorIndexOfOpenTime) && _cursor.isNull(_cursorIndexOfCloseTime))) {
              final TimeHolder _tmpOpenTime;
              final String _tmp;
              _tmp = _cursor.getString(_cursorIndexOfOpenTime);
              _tmpOpenTime = __dbLocalTimeConverter.convertLongToDate(_tmp);
              final TimeHolder _tmpCloseTime;
              final String _tmp_1;
              _tmp_1 = _cursor.getString(_cursorIndexOfCloseTime);
              _tmpCloseTime = __dbLocalTimeConverter.convertLongToDate(_tmp_1);
              _tmpWorkingHours = new TimeSpan(_tmpOpenTime,_tmpCloseTime);
            }  else  {
              _tmpWorkingHours = null;
            }
            _item = new PointOfInterest(_tmpName,_tmpDescription,_tmpLocation,_tmpWorkingHours);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
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
  public Object loadPointOfInterest(final int arg0,
      final Continuation<? super List<PointOfInterest>> arg1) {
    final String _sql = "SELECT * FROM point_of_interest WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, arg0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<PointOfInterest>>() {
      @Override
      public List<PointOfInterest> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfOpenTime = CursorUtil.getColumnIndexOrThrow(_cursor, "openTime");
          final int _cursorIndexOfCloseTime = CursorUtil.getColumnIndexOrThrow(_cursor, "closeTime");
          final List<PointOfInterest> _result = new ArrayList<PointOfInterest>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PointOfInterest _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final Location _tmpLocation;
            if (! (_cursor.isNull(_cursorIndexOfLatitude) && _cursor.isNull(_cursorIndexOfLongitude))) {
              final double _tmpLatitude;
              _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
              final double _tmpLongitude;
              _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
              _tmpLocation = new Location(_tmpLatitude,_tmpLongitude);
            }  else  {
              _tmpLocation = null;
            }
            final TimeSpan _tmpWorkingHours;
            if (! (_cursor.isNull(_cursorIndexOfOpenTime) && _cursor.isNull(_cursorIndexOfCloseTime))) {
              final TimeHolder _tmpOpenTime;
              final String _tmp;
              _tmp = _cursor.getString(_cursorIndexOfOpenTime);
              _tmpOpenTime = __dbLocalTimeConverter.convertLongToDate(_tmp);
              final TimeHolder _tmpCloseTime;
              final String _tmp_1;
              _tmp_1 = _cursor.getString(_cursorIndexOfCloseTime);
              _tmpCloseTime = __dbLocalTimeConverter.convertLongToDate(_tmp_1);
              _tmpWorkingHours = new TimeSpan(_tmpOpenTime,_tmpCloseTime);
            }  else  {
              _tmpWorkingHours = null;
            }
            _item = new PointOfInterest(_tmpName,_tmpDescription,_tmpLocation,_tmpWorkingHours);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }
}
