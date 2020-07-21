package com.esv.tripplanner.core_api.data.dao;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.esv.tripplanner.core_api.data.database_converters.DbDateConverter;
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan;
import com.esv.tripplanner.core_api.data.entities.Trip;
import com.esv.tripplanner.core_api.data.entities.TripPointOfInterestVisitPlanJoin;
import com.esv.tripplanner.core_api.data.entities.TripRouteJoin;
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripPoiVisitPlanJoinRelation;
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripRouteRelation;
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansAndPoiRelation;
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TripDao_Impl implements TripDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Trip> __insertionAdapterOfTrip;

  private final DbDateConverter __dbDateConverter = new DbDateConverter();

  private final EntityInsertionAdapter<TripPointOfInterestVisitPlanJoin> __insertionAdapterOfTripPointOfInterestVisitPlanJoin;

  private final EntityInsertionAdapter<TripRouteJoin> __insertionAdapterOfTripRouteJoin;

  private final EntityDeletionOrUpdateAdapter<Trip> __updateAdapterOfTrip;

  public TripDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrip = new EntityInsertionAdapter<Trip>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `trip` (`id`,`dateSaved`,`name`,`description`,`isRouteGenerated`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Trip value) {
        stmt.bindLong(1, value.getId());
        final Long _tmp;
        _tmp = __dbDateConverter.convertDateToLong(value.getDateSaved());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        final int _tmp_1;
        _tmp_1 = value.isRouteGenerated() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
      }
    };
    this.__insertionAdapterOfTripPointOfInterestVisitPlanJoin = new EntityInsertionAdapter<TripPointOfInterestVisitPlanJoin>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `TripPointOfInterestVisitPlanJoin` (`tripId`,`poiVisitPlanId`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TripPointOfInterestVisitPlanJoin value) {
        stmt.bindLong(1, value.getTripId());
        stmt.bindLong(2, value.getPoiVisitPlanId());
      }
    };
    this.__insertionAdapterOfTripRouteJoin = new EntityInsertionAdapter<TripRouteJoin>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `TripRouteJoin` (`tripId`,`poiVisitPlanId`,`order`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TripRouteJoin value) {
        stmt.bindLong(1, value.getTripId());
        stmt.bindLong(2, value.getPoiVisitPlanId());
        stmt.bindLong(3, value.getOrder());
      }
    };
    this.__updateAdapterOfTrip = new EntityDeletionOrUpdateAdapter<Trip>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `trip` SET `id` = ?,`dateSaved` = ?,`name` = ?,`description` = ?,`isRouteGenerated` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Trip value) {
        stmt.bindLong(1, value.getId());
        final Long _tmp;
        _tmp = __dbDateConverter.convertDateToLong(value.getDateSaved());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        final int _tmp_1;
        _tmp_1 = value.isRouteGenerated() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public Object save(final Trip arg0, final Continuation<? super Long> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfTrip.insertAndReturnId(arg0);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object save(final TripPointOfInterestVisitPlanJoin arg0,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTripPointOfInterestVisitPlanJoin.insert(arg0);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object save(final TripRouteJoin arg0, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTripRouteJoin.insert(arg0);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object update(final Trip arg0, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTrip.handle(arg0);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public List<Trip> loadTrips() {
    final String _sql = "SELECT * FROM trip";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDateSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "dateSaved");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfIsRouteGenerated = CursorUtil.getColumnIndexOrThrow(_cursor, "isRouteGenerated");
      final List<Trip> _result = new ArrayList<Trip>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Trip _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final boolean _tmpIsRouteGenerated;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsRouteGenerated);
        _tmpIsRouteGenerated = _tmp != 0;
        _item = new Trip(_tmpName,_tmpDescription,_tmpIsRouteGenerated);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final Date _tmpDateSaved;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfDateSaved)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfDateSaved);
        }
        _tmpDateSaved = __dbDateConverter.convertLongToDate(_tmp_1);
        _item.setDateSaved(_tmpDateSaved);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object loadTrip(final int arg0, final Continuation<? super List<Trip>> arg1) {
    final String _sql = "SELECT * FROM trip  WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, arg0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Trip>>() {
      @Override
      public List<Trip> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDateSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "dateSaved");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfIsRouteGenerated = CursorUtil.getColumnIndexOrThrow(_cursor, "isRouteGenerated");
          final List<Trip> _result = new ArrayList<Trip>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Trip _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final boolean _tmpIsRouteGenerated;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsRouteGenerated);
            _tmpIsRouteGenerated = _tmp != 0;
            _item = new Trip(_tmpName,_tmpDescription,_tmpIsRouteGenerated);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final Date _tmpDateSaved;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDateSaved)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDateSaved);
            }
            _tmpDateSaved = __dbDateConverter.convertLongToDate(_tmp_1);
            _item.setDateSaved(_tmpDateSaved);
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

  @Override
  public List<TripVisitPlansAndPoiRelation> loadTripWithRelations(final int arg0) {
    final String _sql = "SELECT * FROM trip WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, arg0);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
        final int _cursorIndexOfDateSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "dateSaved");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
        final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
        final int _cursorIndexOfIsRouteGenerated = CursorUtil.getColumnIndexOrThrow(_cursor, "isRouteGenerated");
        final LongSparseArray<ArrayList<PointOfInterestVisitPlan>> _collectionPointOfInterestVisitPlanList = new LongSparseArray<ArrayList<PointOfInterestVisitPlan>>();
        final LongSparseArray<ArrayList<PointOfInterestVisitPlan>> _collectionRoute = new LongSparseArray<ArrayList<PointOfInterestVisitPlan>>();
        while (_cursor.moveToNext()) {
          final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
          ArrayList<PointOfInterestVisitPlan> _tmpPointOfInterestVisitPlanListCollection = _collectionPointOfInterestVisitPlanList.get(_tmpKey);
          if (_tmpPointOfInterestVisitPlanListCollection == null) {
            _tmpPointOfInterestVisitPlanListCollection = new ArrayList<PointOfInterestVisitPlan>();
            _collectionPointOfInterestVisitPlanList.put(_tmpKey, _tmpPointOfInterestVisitPlanListCollection);
          }
          final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
          ArrayList<PointOfInterestVisitPlan> _tmpRouteCollection = _collectionRoute.get(_tmpKey_1);
          if (_tmpRouteCollection == null) {
            _tmpRouteCollection = new ArrayList<PointOfInterestVisitPlan>();
            _collectionRoute.put(_tmpKey_1, _tmpRouteCollection);
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan(_collectionPointOfInterestVisitPlanList);
        __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan_1(_collectionRoute);
        final List<TripVisitPlansAndPoiRelation> _result = new ArrayList<TripVisitPlansAndPoiRelation>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final TripVisitPlansAndPoiRelation _item;
          final Trip _tmpTrip;
          if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfDateSaved) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfIsRouteGenerated))) {
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final boolean _tmpIsRouteGenerated;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsRouteGenerated);
            _tmpIsRouteGenerated = _tmp != 0;
            _tmpTrip = new Trip(_tmpName,_tmpDescription,_tmpIsRouteGenerated);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _tmpTrip.setId(_tmpId);
            final Date _tmpDateSaved;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDateSaved)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDateSaved);
            }
            _tmpDateSaved = __dbDateConverter.convertLongToDate(_tmp_1);
            _tmpTrip.setDateSaved(_tmpDateSaved);
          }  else  {
            _tmpTrip = null;
          }
          ArrayList<PointOfInterestVisitPlan> _tmpPointOfInterestVisitPlanListCollection_1 = null;
          final long _tmpKey_2 = _cursor.getLong(_cursorIndexOfId);
          _tmpPointOfInterestVisitPlanListCollection_1 = _collectionPointOfInterestVisitPlanList.get(_tmpKey_2);
          if (_tmpPointOfInterestVisitPlanListCollection_1 == null) {
            _tmpPointOfInterestVisitPlanListCollection_1 = new ArrayList<PointOfInterestVisitPlan>();
          }
          ArrayList<PointOfInterestVisitPlan> _tmpRouteCollection_1 = null;
          final long _tmpKey_3 = _cursor.getLong(_cursorIndexOfId);
          _tmpRouteCollection_1 = _collectionRoute.get(_tmpKey_3);
          if (_tmpRouteCollection_1 == null) {
            _tmpRouteCollection_1 = new ArrayList<PointOfInterestVisitPlan>();
          }
          _item = new TripVisitPlansAndPoiRelation(_tmpTrip,_tmpPointOfInterestVisitPlanListCollection_1,_tmpRouteCollection_1);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<TripVisitPlansRelation> loadTripWithVisitPlanRelationNoLiveData(final int arg0) {
    final String _sql = "SELECT * FROM trip WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, arg0);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
        final int _cursorIndexOfDateSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "dateSaved");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
        final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
        final int _cursorIndexOfIsRouteGenerated = CursorUtil.getColumnIndexOrThrow(_cursor, "isRouteGenerated");
        final LongSparseArray<ArrayList<PointOfInterestVisitPlan>> _collectionPointOfInterestVisitPlanList = new LongSparseArray<ArrayList<PointOfInterestVisitPlan>>();
        while (_cursor.moveToNext()) {
          final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
          ArrayList<PointOfInterestVisitPlan> _tmpPointOfInterestVisitPlanListCollection = _collectionPointOfInterestVisitPlanList.get(_tmpKey);
          if (_tmpPointOfInterestVisitPlanListCollection == null) {
            _tmpPointOfInterestVisitPlanListCollection = new ArrayList<PointOfInterestVisitPlan>();
            _collectionPointOfInterestVisitPlanList.put(_tmpKey, _tmpPointOfInterestVisitPlanListCollection);
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan(_collectionPointOfInterestVisitPlanList);
        final List<TripVisitPlansRelation> _result = new ArrayList<TripVisitPlansRelation>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final TripVisitPlansRelation _item;
          final Trip _tmpTrip;
          if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfDateSaved) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfIsRouteGenerated))) {
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final boolean _tmpIsRouteGenerated;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsRouteGenerated);
            _tmpIsRouteGenerated = _tmp != 0;
            _tmpTrip = new Trip(_tmpName,_tmpDescription,_tmpIsRouteGenerated);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _tmpTrip.setId(_tmpId);
            final Date _tmpDateSaved;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDateSaved)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDateSaved);
            }
            _tmpDateSaved = __dbDateConverter.convertLongToDate(_tmp_1);
            _tmpTrip.setDateSaved(_tmpDateSaved);
          }  else  {
            _tmpTrip = null;
          }
          ArrayList<PointOfInterestVisitPlan> _tmpPointOfInterestVisitPlanListCollection_1 = null;
          final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
          _tmpPointOfInterestVisitPlanListCollection_1 = _collectionPointOfInterestVisitPlanList.get(_tmpKey_1);
          if (_tmpPointOfInterestVisitPlanListCollection_1 == null) {
            _tmpPointOfInterestVisitPlanListCollection_1 = new ArrayList<PointOfInterestVisitPlan>();
          }
          _item = new TripVisitPlansRelation(_tmpTrip,_tmpPointOfInterestVisitPlanListCollection_1);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<TripVisitPlansRelation>> loadTripWithVisitPlanRelation(final int arg0) {
    final String _sql = "SELECT * FROM trip WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, arg0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"TripPointOfInterestVisitPlanJoin","point_of_interest_visit_plan","trip"}, true, new Callable<List<TripVisitPlansRelation>>() {
      @Override
      public List<TripVisitPlansRelation> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfDateSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "dateSaved");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfIsRouteGenerated = CursorUtil.getColumnIndexOrThrow(_cursor, "isRouteGenerated");
            final LongSparseArray<ArrayList<PointOfInterestVisitPlan>> _collectionPointOfInterestVisitPlanList = new LongSparseArray<ArrayList<PointOfInterestVisitPlan>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<PointOfInterestVisitPlan> _tmpPointOfInterestVisitPlanListCollection = _collectionPointOfInterestVisitPlanList.get(_tmpKey);
              if (_tmpPointOfInterestVisitPlanListCollection == null) {
                _tmpPointOfInterestVisitPlanListCollection = new ArrayList<PointOfInterestVisitPlan>();
                _collectionPointOfInterestVisitPlanList.put(_tmpKey, _tmpPointOfInterestVisitPlanListCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan(_collectionPointOfInterestVisitPlanList);
            final List<TripVisitPlansRelation> _result = new ArrayList<TripVisitPlansRelation>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final TripVisitPlansRelation _item;
              final Trip _tmpTrip;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfDateSaved) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfIsRouteGenerated))) {
                final String _tmpName;
                _tmpName = _cursor.getString(_cursorIndexOfName);
                final String _tmpDescription;
                _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                final boolean _tmpIsRouteGenerated;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfIsRouteGenerated);
                _tmpIsRouteGenerated = _tmp != 0;
                _tmpTrip = new Trip(_tmpName,_tmpDescription,_tmpIsRouteGenerated);
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                _tmpTrip.setId(_tmpId);
                final Date _tmpDateSaved;
                final Long _tmp_1;
                if (_cursor.isNull(_cursorIndexOfDateSaved)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = _cursor.getLong(_cursorIndexOfDateSaved);
                }
                _tmpDateSaved = __dbDateConverter.convertLongToDate(_tmp_1);
                _tmpTrip.setDateSaved(_tmpDateSaved);
              }  else  {
                _tmpTrip = null;
              }
              ArrayList<PointOfInterestVisitPlan> _tmpPointOfInterestVisitPlanListCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpPointOfInterestVisitPlanListCollection_1 = _collectionPointOfInterestVisitPlanList.get(_tmpKey_1);
              if (_tmpPointOfInterestVisitPlanListCollection_1 == null) {
                _tmpPointOfInterestVisitPlanListCollection_1 = new ArrayList<PointOfInterestVisitPlan>();
              }
              _item = new TripVisitPlansRelation(_tmpTrip,_tmpPointOfInterestVisitPlanListCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TripPoiVisitPlanJoinRelation>> loadTripPoiVisitPlanJoin(final int arg0) {
    final String _sql = "SELECT * FROM trippointofinterestvisitplanjoin WHERE tripId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, arg0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"TripPointOfInterestVisitPlanJoin","point_of_interest_visit_plan","trippointofinterestvisitplanjoin"}, true, new Callable<List<TripPoiVisitPlanJoinRelation>>() {
      @Override
      public List<TripPoiVisitPlanJoinRelation> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfTripId = CursorUtil.getColumnIndexOrThrow(_cursor, "tripId");
            final int _cursorIndexOfPoiVisitPlanId = CursorUtil.getColumnIndexOrThrow(_cursor, "poiVisitPlanId");
            final LongSparseArray<ArrayList<PointOfInterestVisitPlan>> _collectionPointOfInterestVisitPlanList = new LongSparseArray<ArrayList<PointOfInterestVisitPlan>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfTripId);
              ArrayList<PointOfInterestVisitPlan> _tmpPointOfInterestVisitPlanListCollection = _collectionPointOfInterestVisitPlanList.get(_tmpKey);
              if (_tmpPointOfInterestVisitPlanListCollection == null) {
                _tmpPointOfInterestVisitPlanListCollection = new ArrayList<PointOfInterestVisitPlan>();
                _collectionPointOfInterestVisitPlanList.put(_tmpKey, _tmpPointOfInterestVisitPlanListCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan(_collectionPointOfInterestVisitPlanList);
            final List<TripPoiVisitPlanJoinRelation> _result = new ArrayList<TripPoiVisitPlanJoinRelation>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final TripPoiVisitPlanJoinRelation _item;
              final TripPointOfInterestVisitPlanJoin _tmpTripJoin;
              if (! (_cursor.isNull(_cursorIndexOfTripId) && _cursor.isNull(_cursorIndexOfPoiVisitPlanId))) {
                final int _tmpTripId;
                _tmpTripId = _cursor.getInt(_cursorIndexOfTripId);
                final int _tmpPoiVisitPlanId;
                _tmpPoiVisitPlanId = _cursor.getInt(_cursorIndexOfPoiVisitPlanId);
                _tmpTripJoin = new TripPointOfInterestVisitPlanJoin(_tmpTripId,_tmpPoiVisitPlanId);
              }  else  {
                _tmpTripJoin = null;
              }
              ArrayList<PointOfInterestVisitPlan> _tmpPointOfInterestVisitPlanListCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfTripId);
              _tmpPointOfInterestVisitPlanListCollection_1 = _collectionPointOfInterestVisitPlanList.get(_tmpKey_1);
              if (_tmpPointOfInterestVisitPlanListCollection_1 == null) {
                _tmpPointOfInterestVisitPlanListCollection_1 = new ArrayList<PointOfInterestVisitPlan>();
              }
              _item = new TripPoiVisitPlanJoinRelation(_tmpTripJoin,_tmpPointOfInterestVisitPlanListCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object loadTripWithRouteRelation(final int arg0,
      final Continuation<? super List<TripRouteRelation>> arg1) {
    final String _sql = "SELECT * FROM trip WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, arg0);
    return CoroutinesRoom.execute(__db, true, new Callable<List<TripRouteRelation>>() {
      @Override
      public List<TripRouteRelation> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfDateSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "dateSaved");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfIsRouteGenerated = CursorUtil.getColumnIndexOrThrow(_cursor, "isRouteGenerated");
            final LongSparseArray<ArrayList<PointOfInterestVisitPlan>> _collectionRoute = new LongSparseArray<ArrayList<PointOfInterestVisitPlan>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<PointOfInterestVisitPlan> _tmpRouteCollection = _collectionRoute.get(_tmpKey);
              if (_tmpRouteCollection == null) {
                _tmpRouteCollection = new ArrayList<PointOfInterestVisitPlan>();
                _collectionRoute.put(_tmpKey, _tmpRouteCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan_1(_collectionRoute);
            final List<TripRouteRelation> _result = new ArrayList<TripRouteRelation>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final TripRouteRelation _item;
              final Trip _tmpTrip;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfDateSaved) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfIsRouteGenerated))) {
                final String _tmpName;
                _tmpName = _cursor.getString(_cursorIndexOfName);
                final String _tmpDescription;
                _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                final boolean _tmpIsRouteGenerated;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfIsRouteGenerated);
                _tmpIsRouteGenerated = _tmp != 0;
                _tmpTrip = new Trip(_tmpName,_tmpDescription,_tmpIsRouteGenerated);
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                _tmpTrip.setId(_tmpId);
                final Date _tmpDateSaved;
                final Long _tmp_1;
                if (_cursor.isNull(_cursorIndexOfDateSaved)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = _cursor.getLong(_cursorIndexOfDateSaved);
                }
                _tmpDateSaved = __dbDateConverter.convertLongToDate(_tmp_1);
                _tmpTrip.setDateSaved(_tmpDateSaved);
              }  else  {
                _tmpTrip = null;
              }
              ArrayList<PointOfInterestVisitPlan> _tmpRouteCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpRouteCollection_1 = _collectionRoute.get(_tmpKey_1);
              if (_tmpRouteCollection_1 == null) {
                _tmpRouteCollection_1 = new ArrayList<PointOfInterestVisitPlan>();
              }
              _item = new TripRouteRelation(_tmpTrip,_tmpRouteCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  private void __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan(
      final LongSparseArray<ArrayList<PointOfInterestVisitPlan>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<PointOfInterestVisitPlan>> _tmpInnerMap = new LongSparseArray<ArrayList<PointOfInterestVisitPlan>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<PointOfInterestVisitPlan>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `point_of_interest_visit_plan`.`id` AS `id`,`point_of_interest_visit_plan`.`pointOfInterestId` AS `pointOfInterestId`,`point_of_interest_visit_plan`.`visitTimeHrs` AS `visitTimeHrs`,`point_of_interest_visit_plan`.`isStartPoint` AS `isStartPoint`,_junction.`tripId` FROM `TripPointOfInterestVisitPlanJoin` AS _junction INNER JOIN `point_of_interest_visit_plan` ON (_junction.`poiVisitPlanId` = `point_of_interest_visit_plan`.`id`) WHERE _junction.`tripId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 4; // _junction.tripId;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "id");
      final int _cursorIndexOfPointOfInterestId = CursorUtil.getColumnIndex(_cursor, "pointOfInterestId");
      final int _cursorIndexOfVisitTimeHrs = CursorUtil.getColumnIndex(_cursor, "visitTimeHrs");
      final int _cursorIndexOfIsStartPoint = CursorUtil.getColumnIndex(_cursor, "isStartPoint");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<PointOfInterestVisitPlan> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final PointOfInterestVisitPlan _item_1;
          final int _tmpPointOfInterestId;
          if (_cursorIndexOfPointOfInterestId == -1) {
            _tmpPointOfInterestId = 0;
          } else {
            _tmpPointOfInterestId = _cursor.getInt(_cursorIndexOfPointOfInterestId);
          }
          final Double _tmpVisitTimeHrs;
          if (_cursorIndexOfVisitTimeHrs == -1) {
            _tmpVisitTimeHrs = null;
          } else {
            if (_cursor.isNull(_cursorIndexOfVisitTimeHrs)) {
              _tmpVisitTimeHrs = null;
            } else {
              _tmpVisitTimeHrs = _cursor.getDouble(_cursorIndexOfVisitTimeHrs);
            }
          }
          final boolean _tmpIsStartPoint;
          if (_cursorIndexOfIsStartPoint == -1) {
            _tmpIsStartPoint = false;
          } else {
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsStartPoint);
            _tmpIsStartPoint = _tmp != 0;
          }
          _item_1 = new PointOfInterestVisitPlan(_tmpPointOfInterestId,_tmpVisitTimeHrs,_tmpIsStartPoint);
          if (_cursorIndexOfId != -1) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item_1.setId(_tmpId);
          }
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan_1(
      final LongSparseArray<ArrayList<PointOfInterestVisitPlan>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<PointOfInterestVisitPlan>> _tmpInnerMap = new LongSparseArray<ArrayList<PointOfInterestVisitPlan>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan_1(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<PointOfInterestVisitPlan>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshippointOfInterestVisitPlanAscomEsvTripplannerCoreApiDataEntitiesPointOfInterestVisitPlan_1(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `point_of_interest_visit_plan`.`id` AS `id`,`point_of_interest_visit_plan`.`pointOfInterestId` AS `pointOfInterestId`,`point_of_interest_visit_plan`.`visitTimeHrs` AS `visitTimeHrs`,`point_of_interest_visit_plan`.`isStartPoint` AS `isStartPoint`,_junction.`tripId` FROM `TripRouteJoin` AS _junction INNER JOIN `point_of_interest_visit_plan` ON (_junction.`poiVisitPlanId` = `point_of_interest_visit_plan`.`id`) WHERE _junction.`tripId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 4; // _junction.tripId;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "id");
      final int _cursorIndexOfPointOfInterestId = CursorUtil.getColumnIndex(_cursor, "pointOfInterestId");
      final int _cursorIndexOfVisitTimeHrs = CursorUtil.getColumnIndex(_cursor, "visitTimeHrs");
      final int _cursorIndexOfIsStartPoint = CursorUtil.getColumnIndex(_cursor, "isStartPoint");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<PointOfInterestVisitPlan> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final PointOfInterestVisitPlan _item_1;
          final int _tmpPointOfInterestId;
          if (_cursorIndexOfPointOfInterestId == -1) {
            _tmpPointOfInterestId = 0;
          } else {
            _tmpPointOfInterestId = _cursor.getInt(_cursorIndexOfPointOfInterestId);
          }
          final Double _tmpVisitTimeHrs;
          if (_cursorIndexOfVisitTimeHrs == -1) {
            _tmpVisitTimeHrs = null;
          } else {
            if (_cursor.isNull(_cursorIndexOfVisitTimeHrs)) {
              _tmpVisitTimeHrs = null;
            } else {
              _tmpVisitTimeHrs = _cursor.getDouble(_cursorIndexOfVisitTimeHrs);
            }
          }
          final boolean _tmpIsStartPoint;
          if (_cursorIndexOfIsStartPoint == -1) {
            _tmpIsStartPoint = false;
          } else {
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsStartPoint);
            _tmpIsStartPoint = _tmp != 0;
          }
          _item_1 = new PointOfInterestVisitPlan(_tmpPointOfInterestId,_tmpVisitTimeHrs,_tmpIsStartPoint);
          if (_cursorIndexOfId != -1) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item_1.setId(_tmpId);
          }
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
