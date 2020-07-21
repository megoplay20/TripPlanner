package com.esv.tripplanner.core_impl.data.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.esv.tripplanner.core_api.data.dao.PointOfInterestDao;
import com.esv.tripplanner.core_api.data.dao.PointOfInterestDao_Impl;
import com.esv.tripplanner.core_api.data.dao.TripDao;
import com.esv.tripplanner.core_api.data.dao.TripDao_Impl;
import com.esv.tripplanner.core_api.data.dao.VisitPlansDao;
import com.esv.tripplanner.core_api.data.dao.VisitPlansDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TripDatabase_Impl extends TripDatabase {
  private volatile PointOfInterestDao _pointOfInterestDao;

  private volatile VisitPlansDao _visitPlansDao;

  private volatile TripDao _tripDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(8) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `point_of_interest` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `openTime` TEXT NOT NULL, `closeTime` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `point_of_interest_visit_plan` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `pointOfInterestId` INTEGER NOT NULL, `visitTimeHrs` REAL, `isStartPoint` INTEGER NOT NULL, FOREIGN KEY(`pointOfInterestId`) REFERENCES `point_of_interest`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_point_of_interest_visit_plan_pointOfInterestId` ON `point_of_interest_visit_plan` (`pointOfInterestId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `trip` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dateSaved` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `isRouteGenerated` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TripRouteJoin` (`tripId` INTEGER NOT NULL, `poiVisitPlanId` INTEGER NOT NULL, `order` INTEGER NOT NULL, PRIMARY KEY(`tripId`, `poiVisitPlanId`), FOREIGN KEY(`poiVisitPlanId`) REFERENCES `point_of_interest_visit_plan`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`tripId`) REFERENCES `trip`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_TripRouteJoin_tripId` ON `TripRouteJoin` (`tripId`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_TripRouteJoin_poiVisitPlanId` ON `TripRouteJoin` (`poiVisitPlanId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TripPointOfInterestVisitPlanJoin` (`tripId` INTEGER NOT NULL, `poiVisitPlanId` INTEGER NOT NULL, PRIMARY KEY(`tripId`, `poiVisitPlanId`), FOREIGN KEY(`poiVisitPlanId`) REFERENCES `point_of_interest_visit_plan`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`tripId`) REFERENCES `trip`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_TripPointOfInterestVisitPlanJoin_tripId` ON `TripPointOfInterestVisitPlanJoin` (`tripId`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_TripPointOfInterestVisitPlanJoin_poiVisitPlanId` ON `TripPointOfInterestVisitPlanJoin` (`poiVisitPlanId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '584c6405f633904c15d755515dfb4f06')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `point_of_interest`");
        _db.execSQL("DROP TABLE IF EXISTS `point_of_interest_visit_plan`");
        _db.execSQL("DROP TABLE IF EXISTS `trip`");
        _db.execSQL("DROP TABLE IF EXISTS `TripRouteJoin`");
        _db.execSQL("DROP TABLE IF EXISTS `TripPointOfInterestVisitPlanJoin`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPointOfInterest = new HashMap<String, TableInfo.Column>(7);
        _columnsPointOfInterest.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPointOfInterest.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPointOfInterest.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPointOfInterest.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPointOfInterest.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPointOfInterest.put("openTime", new TableInfo.Column("openTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPointOfInterest.put("closeTime", new TableInfo.Column("closeTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPointOfInterest = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPointOfInterest = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPointOfInterest = new TableInfo("point_of_interest", _columnsPointOfInterest, _foreignKeysPointOfInterest, _indicesPointOfInterest);
        final TableInfo _existingPointOfInterest = TableInfo.read(_db, "point_of_interest");
        if (! _infoPointOfInterest.equals(_existingPointOfInterest)) {
          return new RoomOpenHelper.ValidationResult(false, "point_of_interest(com.esv.tripplanner.core_api.data.entities.PointOfInterest).\n"
                  + " Expected:\n" + _infoPointOfInterest + "\n"
                  + " Found:\n" + _existingPointOfInterest);
        }
        final HashMap<String, TableInfo.Column> _columnsPointOfInterestVisitPlan = new HashMap<String, TableInfo.Column>(4);
        _columnsPointOfInterestVisitPlan.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPointOfInterestVisitPlan.put("pointOfInterestId", new TableInfo.Column("pointOfInterestId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPointOfInterestVisitPlan.put("visitTimeHrs", new TableInfo.Column("visitTimeHrs", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPointOfInterestVisitPlan.put("isStartPoint", new TableInfo.Column("isStartPoint", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPointOfInterestVisitPlan = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysPointOfInterestVisitPlan.add(new TableInfo.ForeignKey("point_of_interest", "CASCADE", "NO ACTION",Arrays.asList("pointOfInterestId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesPointOfInterestVisitPlan = new HashSet<TableInfo.Index>(1);
        _indicesPointOfInterestVisitPlan.add(new TableInfo.Index("index_point_of_interest_visit_plan_pointOfInterestId", false, Arrays.asList("pointOfInterestId")));
        final TableInfo _infoPointOfInterestVisitPlan = new TableInfo("point_of_interest_visit_plan", _columnsPointOfInterestVisitPlan, _foreignKeysPointOfInterestVisitPlan, _indicesPointOfInterestVisitPlan);
        final TableInfo _existingPointOfInterestVisitPlan = TableInfo.read(_db, "point_of_interest_visit_plan");
        if (! _infoPointOfInterestVisitPlan.equals(_existingPointOfInterestVisitPlan)) {
          return new RoomOpenHelper.ValidationResult(false, "point_of_interest_visit_plan(com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan).\n"
                  + " Expected:\n" + _infoPointOfInterestVisitPlan + "\n"
                  + " Found:\n" + _existingPointOfInterestVisitPlan);
        }
        final HashMap<String, TableInfo.Column> _columnsTrip = new HashMap<String, TableInfo.Column>(5);
        _columnsTrip.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrip.put("dateSaved", new TableInfo.Column("dateSaved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrip.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrip.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrip.put("isRouteGenerated", new TableInfo.Column("isRouteGenerated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTrip = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTrip = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTrip = new TableInfo("trip", _columnsTrip, _foreignKeysTrip, _indicesTrip);
        final TableInfo _existingTrip = TableInfo.read(_db, "trip");
        if (! _infoTrip.equals(_existingTrip)) {
          return new RoomOpenHelper.ValidationResult(false, "trip(com.esv.tripplanner.core_api.data.entities.Trip).\n"
                  + " Expected:\n" + _infoTrip + "\n"
                  + " Found:\n" + _existingTrip);
        }
        final HashMap<String, TableInfo.Column> _columnsTripRouteJoin = new HashMap<String, TableInfo.Column>(3);
        _columnsTripRouteJoin.put("tripId", new TableInfo.Column("tripId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTripRouteJoin.put("poiVisitPlanId", new TableInfo.Column("poiVisitPlanId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTripRouteJoin.put("order", new TableInfo.Column("order", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTripRouteJoin = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysTripRouteJoin.add(new TableInfo.ForeignKey("point_of_interest_visit_plan", "CASCADE", "NO ACTION",Arrays.asList("poiVisitPlanId"), Arrays.asList("id")));
        _foreignKeysTripRouteJoin.add(new TableInfo.ForeignKey("trip", "CASCADE", "NO ACTION",Arrays.asList("tripId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesTripRouteJoin = new HashSet<TableInfo.Index>(2);
        _indicesTripRouteJoin.add(new TableInfo.Index("index_TripRouteJoin_tripId", false, Arrays.asList("tripId")));
        _indicesTripRouteJoin.add(new TableInfo.Index("index_TripRouteJoin_poiVisitPlanId", false, Arrays.asList("poiVisitPlanId")));
        final TableInfo _infoTripRouteJoin = new TableInfo("TripRouteJoin", _columnsTripRouteJoin, _foreignKeysTripRouteJoin, _indicesTripRouteJoin);
        final TableInfo _existingTripRouteJoin = TableInfo.read(_db, "TripRouteJoin");
        if (! _infoTripRouteJoin.equals(_existingTripRouteJoin)) {
          return new RoomOpenHelper.ValidationResult(false, "TripRouteJoin(com.esv.tripplanner.core_api.data.entities.TripRouteJoin).\n"
                  + " Expected:\n" + _infoTripRouteJoin + "\n"
                  + " Found:\n" + _existingTripRouteJoin);
        }
        final HashMap<String, TableInfo.Column> _columnsTripPointOfInterestVisitPlanJoin = new HashMap<String, TableInfo.Column>(2);
        _columnsTripPointOfInterestVisitPlanJoin.put("tripId", new TableInfo.Column("tripId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTripPointOfInterestVisitPlanJoin.put("poiVisitPlanId", new TableInfo.Column("poiVisitPlanId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTripPointOfInterestVisitPlanJoin = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysTripPointOfInterestVisitPlanJoin.add(new TableInfo.ForeignKey("point_of_interest_visit_plan", "CASCADE", "NO ACTION",Arrays.asList("poiVisitPlanId"), Arrays.asList("id")));
        _foreignKeysTripPointOfInterestVisitPlanJoin.add(new TableInfo.ForeignKey("trip", "CASCADE", "NO ACTION",Arrays.asList("tripId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesTripPointOfInterestVisitPlanJoin = new HashSet<TableInfo.Index>(2);
        _indicesTripPointOfInterestVisitPlanJoin.add(new TableInfo.Index("index_TripPointOfInterestVisitPlanJoin_tripId", false, Arrays.asList("tripId")));
        _indicesTripPointOfInterestVisitPlanJoin.add(new TableInfo.Index("index_TripPointOfInterestVisitPlanJoin_poiVisitPlanId", false, Arrays.asList("poiVisitPlanId")));
        final TableInfo _infoTripPointOfInterestVisitPlanJoin = new TableInfo("TripPointOfInterestVisitPlanJoin", _columnsTripPointOfInterestVisitPlanJoin, _foreignKeysTripPointOfInterestVisitPlanJoin, _indicesTripPointOfInterestVisitPlanJoin);
        final TableInfo _existingTripPointOfInterestVisitPlanJoin = TableInfo.read(_db, "TripPointOfInterestVisitPlanJoin");
        if (! _infoTripPointOfInterestVisitPlanJoin.equals(_existingTripPointOfInterestVisitPlanJoin)) {
          return new RoomOpenHelper.ValidationResult(false, "TripPointOfInterestVisitPlanJoin(com.esv.tripplanner.core_api.data.entities.TripPointOfInterestVisitPlanJoin).\n"
                  + " Expected:\n" + _infoTripPointOfInterestVisitPlanJoin + "\n"
                  + " Found:\n" + _existingTripPointOfInterestVisitPlanJoin);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "584c6405f633904c15d755515dfb4f06", "1c10ef345ea6de2e50bd4bd6167ee52f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "point_of_interest","point_of_interest_visit_plan","trip","TripRouteJoin","TripPointOfInterestVisitPlanJoin");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `point_of_interest`");
      _db.execSQL("DELETE FROM `point_of_interest_visit_plan`");
      _db.execSQL("DELETE FROM `trip`");
      _db.execSQL("DELETE FROM `TripRouteJoin`");
      _db.execSQL("DELETE FROM `TripPointOfInterestVisitPlanJoin`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public PointOfInterestDao pointOfInterest() {
    if (_pointOfInterestDao != null) {
      return _pointOfInterestDao;
    } else {
      synchronized(this) {
        if(_pointOfInterestDao == null) {
          _pointOfInterestDao = new PointOfInterestDao_Impl(this);
        }
        return _pointOfInterestDao;
      }
    }
  }

  @Override
  public VisitPlansDao pointOfInterestVisitPlans() {
    if (_visitPlansDao != null) {
      return _visitPlansDao;
    } else {
      synchronized(this) {
        if(_visitPlansDao == null) {
          _visitPlansDao = new VisitPlansDao_Impl(this);
        }
        return _visitPlansDao;
      }
    }
  }

  @Override
  public TripDao trips() {
    if (_tripDao != null) {
      return _tripDao;
    } else {
      synchronized(this) {
        if(_tripDao == null) {
          _tripDao = new TripDao_Impl(this);
        }
        return _tripDao;
      }
    }
  }
}
