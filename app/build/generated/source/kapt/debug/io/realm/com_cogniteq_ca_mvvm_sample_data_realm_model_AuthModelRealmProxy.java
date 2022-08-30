package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy extends com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel
    implements RealmObjectProxy, com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface {

    static final class AuthModelColumnInfo extends ColumnInfo {
        long idColKey;
        long loginColKey;
        long passwordColKey;

        AuthModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("AuthModel");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.loginColKey = addColumnDetails("login", "login", objectSchemaInfo);
            this.passwordColKey = addColumnDetails("password", "password", objectSchemaInfo);
        }

        AuthModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AuthModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AuthModelColumnInfo src = (AuthModelColumnInfo) rawSrc;
            final AuthModelColumnInfo dst = (AuthModelColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.loginColKey = src.loginColKey;
            dst.passwordColKey = src.passwordColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AuthModelColumnInfo columnInfo;
    private ProxyState<com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel> proxyState;

    com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AuthModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$login() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.loginColKey);
    }

    @Override
    public void realmSet$login(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.loginColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.loginColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.loginColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.loginColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$password() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwordColKey);
    }

    @Override
    public void realmSet$password(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.passwordColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.passwordColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.passwordColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.passwordColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "AuthModel", false, 3, 0);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "login", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "password", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AuthModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AuthModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "AuthModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AuthModel";
    }

    @SuppressWarnings("cast")
    public static com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel obj = null;
        if (update) {
            Table table = realm.getTable(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
            AuthModelColumnInfo columnInfo = (AuthModelColumnInfo) realm.getSchema().getColumnInfo(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("id")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy) realm.createObjectInternal(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy) realm.createObjectInternal(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface objProxy = (com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) obj;
        if (json.has("login")) {
            if (json.isNull("login")) {
                objProxy.realmSet$login(null);
            } else {
                objProxy.realmSet$login((String) json.getString("login"));
            }
        }
        if (json.has("password")) {
            if (json.isNull("password")) {
                objProxy.realmSet$password(null);
            } else {
                objProxy.realmSet$password((String) json.getString("password"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel obj = new com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel();
        final com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface objProxy = (com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("login")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$login((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$login(null);
                }
            } else if (name.equals("password")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$password((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$password(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class), false, Collections.<String>emptyList());
        io.realm.com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy obj = new io.realm.com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel copyOrUpdate(Realm realm, AuthModelColumnInfo columnInfo, com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel) cachedRealmObject;
        }

        com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
            long pkColumnKey = columnInfo.idColKey;
            String value = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$id();
            long objKey = Table.NO_MATCH;
            if (value == null) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, value);
            }
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel copy(Realm realm, AuthModelColumnInfo columnInfo, com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel) cachedRealmObject;
        }

        com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface unmanagedSource = (com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.loginColKey, unmanagedSource.realmGet$login());
        builder.addString(columnInfo.passwordColKey, unmanagedSource.realmGet$password());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
        long tableNativePtr = table.getNativePtr();
        AuthModelColumnInfo columnInfo = (AuthModelColumnInfo) realm.getSchema().getColumnInfo(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$id();
        long objKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$login = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$login();
        if (realmGet$login != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.loginColKey, objKey, realmGet$login, false);
        }
        String realmGet$password = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
        long tableNativePtr = table.getNativePtr();
        AuthModelColumnInfo columnInfo = (AuthModelColumnInfo) realm.getSchema().getColumnInfo(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel object = null;
        while (objects.hasNext()) {
            object = (com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$id();
            long objKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$login = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$login();
            if (realmGet$login != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.loginColKey, objKey, realmGet$login, false);
            }
            String realmGet$password = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
        long tableNativePtr = table.getNativePtr();
        AuthModelColumnInfo columnInfo = (AuthModelColumnInfo) realm.getSchema().getColumnInfo(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$id();
        long objKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$login = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$login();
        if (realmGet$login != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.loginColKey, objKey, realmGet$login, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.loginColKey, objKey, false);
        }
        String realmGet$password = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwordColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
        long tableNativePtr = table.getNativePtr();
        AuthModelColumnInfo columnInfo = (AuthModelColumnInfo) realm.getSchema().getColumnInfo(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel object = null;
        while (objects.hasNext()) {
            object = (com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$id();
            long objKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$login = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$login();
            if (realmGet$login != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.loginColKey, objKey, realmGet$login, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.loginColKey, objKey, false);
            }
            String realmGet$password = ((com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passwordColKey, objKey, false);
            }
        }
    }

    public static com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel createDetachedCopy(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel) cachedObject.object;
            }
            unmanagedObject = (com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface unmanagedCopy = (com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) unmanagedObject;
        com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface realmSource = (com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$login(realmSource.realmGet$login());
        unmanagedCopy.realmSet$password(realmSource.realmGet$password());

        return unmanagedObject;
    }

    static com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel update(Realm realm, AuthModelColumnInfo columnInfo, com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel realmObject, com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface realmObjectTarget = (com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) realmObject;
        com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface realmObjectSource = (com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.cogniteq.ca.mvvm.sample.data.realm.model.AuthModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.loginColKey, realmObjectSource.realmGet$login());
        builder.addString(columnInfo.passwordColKey, realmObjectSource.realmGet$password());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AuthModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{login:");
        stringBuilder.append(realmGet$login() != null ? realmGet$login() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{password:");
        stringBuilder.append(realmGet$password() != null ? realmGet$password() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy aAuthModel = (com_cogniteq_ca_mvvm_sample_data_realm_model_AuthModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aAuthModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAuthModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aAuthModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
