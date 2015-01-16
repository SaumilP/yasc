package org.saumilp.sandcastle.model;

/**
 * Service Type Enumeration
 */
public enum ServiceType {
    SOAP("Xml"), REST("RESTFul");

    private String value;

    ServiceType(String value ){
        this.value = value;
    }

    public String value(){
        return value;
    }

    public String getValue(){
        return value;
    }

    private ServiceType fromValue(String value){
        for (ServiceType serviceType : ServiceType.values()) {
            if( value.equals(serviceType.getValue())){
                return serviceType;
            }
        }
        throw new IllegalArgumentException("Incorrect value string requested");
    }
}
