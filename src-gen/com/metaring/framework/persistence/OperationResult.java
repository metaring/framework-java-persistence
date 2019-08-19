package com.metaring.framework.persistence;

import com.metaring.framework.type.series.TextSeries;
import com.metaring.framework.Tools;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.GeneratedCoreType;

public class OperationResult implements GeneratedCoreType {

    public static final String FULLY_QUALIFIED_NAME = "com.metaring.framework.persistence.operationResult";

    private Long manipulationNumber;
    private TextSeries keys;

    private OperationResult(Long manipulationNumber, TextSeries keys) {
        this.manipulationNumber = manipulationNumber;
        this.keys = keys;
    }

    public Long getManipulationNumber() {
        return this.manipulationNumber;
    }

    public TextSeries getKeys() {
        return this.keys;
    }

    public static OperationResult create(Long manipulationNumber, TextSeries keys) {
        return new OperationResult(manipulationNumber, keys);
    }

    public static OperationResult fromJson(String jsonString) {

        if(jsonString == null) {
            return null;
        }

        jsonString = jsonString.trim();
        if(jsonString.isEmpty()) {
            return null;
        }

        if(jsonString.equalsIgnoreCase("null")) {
            return null;
        }

        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.fromJson(jsonString);

        Long manipulationNumber = null;
        if(dataRepresentation.hasProperty("manipulationNumber")) {
            try {
                manipulationNumber = dataRepresentation.getDigit("manipulationNumber");
            } catch (Exception e) {
            }
        }

        TextSeries keys = null;
        if(dataRepresentation.hasProperty("keys")) {
            try {
                keys = dataRepresentation.getTextSeries("keys");
            } catch (Exception e) {
            }
        }

        OperationResult operationResult = create(manipulationNumber, keys);
        return operationResult;
    }

    public static OperationResult fromObject(Object object) {

        if(object == null) {
            return null;
        }

        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.fromObject(object);

        Long manipulationNumber = null;
        if(dataRepresentation.hasProperty("manipulationNumber")) {
            try {
                manipulationNumber = dataRepresentation.getDigit("manipulationNumber");
            } catch (Exception e) {
            }
        }

        TextSeries keys = null;
        if(dataRepresentation.hasProperty("keys")) {
            try {
                keys = dataRepresentation.getTextSeries("keys");
            } catch (Exception e) {
            }
        }

        OperationResult operationResult = create(manipulationNumber, keys);
        return operationResult;
    }

    public DataRepresentation toDataRepresentation() {
        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.create();
        if (manipulationNumber != null) {
            dataRepresentation.add("manipulationNumber", manipulationNumber);
        }

        if (keys != null) {
            dataRepresentation.add("keys", keys.toArray());
        }

        return dataRepresentation;
    }

    @Override
    public String toJson() {
        return toDataRepresentation().toJson();
    }

    @Override
    public String toString() {
        return this.toJson();
    }
}