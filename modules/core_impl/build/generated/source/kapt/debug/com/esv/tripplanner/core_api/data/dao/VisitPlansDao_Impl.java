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
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Long;
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
public final class VisitPlansDao_Impl implements VisitPlansDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PointOfInterestVisitPlan> __insertionAdapterOfPointOfInterestVisitPlan;

  private final EntityDeletionOrUpdateAdapter<PointOfInterestVisitPlan> __deletionAdapterOfPointOfInterestVisitPlan;

  private final EntityDeletionOrUpdateAdapter<PointOfInterestVisitPlan> __updateAdapterOfPointOfInterestVisitPlan;

  public VisitPlansDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPointOfInterestVisitPlan = new EntityInsertionAdapter<PointOfInterestVisitPlan>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `point_of_interest_visit_plan` (`id`,`pointOfInterestId`,`visitTimeHrs`,`isStartPoint`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PointOfInterestVisitPlan value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getPointOfInterestId());
        if (value.getVisitTimeHrs() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindDouble(3, value.getVisitTimeHrs());
        }
        final int _tmp;
        _tmp = value.isStartPoint() ? 1 : 0;
        stmt.bindLong(4, _tmp);
      }
    };
    this.__deletionAdapterOfPointOfInterestVisitPlan = new EntityDeletionOrUpdateAdapter<PointOfInterestVisitPlan>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `point_of_interest_visit_plan` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PointOfInterestVisitPlan value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfPointOfInterestVisitPlan = new EntityDeletionOrUpdateAdapter<PointOfInterestVisitPlan>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `point_of_interest_visit_plan` SET `id` = ?,`pointOfInterestId` = ?,`visitTimeHrs` = ?,`isStartPoint` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PointOfInterestVisitPlan value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getPointOfInterestId());
        if (value.getVisitTimeHrs() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindDouble(3, value.getVisitTimeHrs());
        }
        final int _tmp;
        _tmp = value.isStartPoint() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public Object save(final PointOfInterestVisitPlan arg0, final Continuation<? super Long> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfPointOfInterestVisitPlan.insertAndReturnId(arg0);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object delete(final PointOfInterestVisitPlan arg0, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPointOfInterestVisitPlan.handle(arg0);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object update(final PointOfInterestVisitPlan arg0, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfPointOfInterestVisitPlan.handle(arg0);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public LiveData<List<PointOfInterestVisitPlan>> loadPointOfInterestVisitPlan() {
    final String _sql = "SELECT * FROM point_of_interest_visit_plan";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"point_of_interest_visit_plan"}, false, new Callable<List<PointOfInterestVisitPlan>>() {
      @Override
      public List<PointOfInterestVisitPlan> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPointOfInterestId = CursorUtil.getColumnIndexOrThrow(_cursor, "pointOfInterestId");
          final int _cursorIndexOfVisitTimeHrs = CursorUtil.getColumnIndexOrThrow(_cursor, "visitTimeHrs");
          final int _cursorIndexOfIsStartPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "isStartPoint");
          final List<PointOfInterestVisitPlan> _result = new ArrayList<PointOfInterestVisitPlan>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PointOfInterestVisitPlan _item;
            final int _tmpPointOfInterestId;
            _tmpPointOfInterestId = _cursor.getInt(_cursorIndexOfPointOfInterestId);
            final Double _tmpVisitTimeHrs;
            if (_cursor.isNull(_cursorIndexOfVisitTimeHrs)) {
              _tmpVisitTimeHrs = null;
            } else {
              _tmpVisitTimeHrs = _cursor.getDouble(_cursorIndexOfVisitTimeHrs);
            }
            final boolean _tmpIsStartPoint;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsStartPoint);
            _tmpIsStartPoint = _tmp != 0;
            _item = new PointOfInterestVisitPlan(_tmpPointOfInterestId,_tmpVisitTimeHrs,_tmpIsStartPoint);
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
  public Object loadPointOfInterestVisitPlan(final int arg0,
      final Continuation<? super List<PointOfInterestVisitPlan>> arg1) {
    final String _sql = "SELECT * FROM point_of_interest_visit_plan WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, arg0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<PointOfInterestVisitPlan>>() {
      @Override
      public List<PointOfInterestVisitPlan> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPointOfInterestId = CursorUtil.getColumnIndexOrThrow(_cursor, "pointOfInterestId");
          final int _cursorIndexOfVisitTimeHrs = CursorUtil.getColumnIndexOrThrow(_cursor, "visitTimeHrs");
          final int _cursorIndexOfIsStartPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "isStartPoint");
          final List<PointOfInterestVisitPlan> _result = new ArrayList<PointOfInterestVisitPlan>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PointOfInterestVisitPlan _item;
            final int _tmpPointOfInterestId;
            _tmpPointOfInterestId = _cursor.getInt(_cursorIndexOfPointOfInterestId);
            final Double _tmpVisitTimeHrs;
            if (_cursor.isNull(_cursorIndexOfVisitTimeHrs)) {
              _tmpVisitTimeHrs = null;
            } else {
              _tmpVisitTimeHrs = _cursor.getDouble(_cursorIndexOfVisitTimeHrs);
            }
            final boolean _tmpIsStartPoint;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsStartPoint);
            _tmpIsStartPoint = _tmp != 0;
            _item = new PointOfInterestVisitPlan(_tmpPointOfInterestId,_tmpVisitTimeHrs,_tmpIsStartPoint);
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
