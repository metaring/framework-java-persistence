package com.metaring.framework.persistence;

import com.metaring.framework.functionality.FunctionalityInfo;
import com.metaring.framework.functionality.FunctionalitiesManager;
import com.metaring.framework.functionality.GeneratedFunctionalitiesManager;
import com.metaring.framework.functionality.Functionality;
import java.util.concurrent.CompletableFuture;
import java.lang.String;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.persistence.OperationResult;

public class PersistenceFunctionalitiesManager extends FunctionalitiesManager implements GeneratedFunctionalitiesManager {

    public static final FunctionalityInfo QUERY = FunctionalityInfo.create("com.metaring.framework.persistence.query", true, false, false, "java.lang.String", "com.metaring.framework.type.DataRepresentation");

    public static final FunctionalityInfo UPDATE = FunctionalityInfo.create("com.metaring.framework.persistence.update", true, false, false, "java.lang.String", "com.metaring.framework.persistence.OperationResult");

    public static final CompletableFuture<DataRepresentation> query(String string) {
        return call(QUERY, QueryFunctionality.class, getCallingFunctionality(), string, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> query(Functionality functionality, String string) {
        return call(QUERY, QueryFunctionality.class, functionality, string, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> queryFromJson(String stringJson) {
        return callFromJson(QUERY, QueryFunctionality.class, getCallingFunctionality(), stringJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> queryFromJson(Functionality callingFunctionality, String stringJson) {
        return callFromJson(QUERY, QueryFunctionality.class, callingFunctionality, stringJson, result -> result);
    }

    public static final CompletableFuture<OperationResult> update(String string) {
        return call(UPDATE, UpdateFunctionality.class, getCallingFunctionality(), string, result -> result.as(OperationResult.class));
    }

    public static final CompletableFuture<OperationResult> update(Functionality functionality, String string) {
        return call(UPDATE, UpdateFunctionality.class, functionality, string, result -> result.as(OperationResult.class));
    }

    public static final CompletableFuture<OperationResult> updateFromJson(String stringJson) {
        return callFromJson(UPDATE, UpdateFunctionality.class, getCallingFunctionality(), stringJson, result -> result.as(OperationResult.class));
    }

    public static final CompletableFuture<OperationResult> updateFromJson(Functionality callingFunctionality, String stringJson) {
        return callFromJson(UPDATE, UpdateFunctionality.class, callingFunctionality, stringJson, result -> result.as(OperationResult.class));
    }

}
