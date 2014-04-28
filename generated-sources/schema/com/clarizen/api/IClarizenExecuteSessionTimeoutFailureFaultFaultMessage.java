
package com.clarizen.api;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.1
 * 2014-04-10T08:40:54.395-05:00
 * Generated source version: 2.5.1
 */

@WebFault(name = "SessionTimeoutFailure", targetNamespace = "http://clarizen.com/api/faults")
public class IClarizenExecuteSessionTimeoutFailureFaultFaultMessage extends Exception {
    
    private com.clarizen.api.faults.SessionTimeoutFailure sessionTimeoutFailure;

    public IClarizenExecuteSessionTimeoutFailureFaultFaultMessage() {
        super();
    }
    
    public IClarizenExecuteSessionTimeoutFailureFaultFaultMessage(String message) {
        super(message);
    }
    
    public IClarizenExecuteSessionTimeoutFailureFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IClarizenExecuteSessionTimeoutFailureFaultFaultMessage(String message, com.clarizen.api.faults.SessionTimeoutFailure sessionTimeoutFailure) {
        super(message);
        this.sessionTimeoutFailure = sessionTimeoutFailure;
    }

    public IClarizenExecuteSessionTimeoutFailureFaultFaultMessage(String message, com.clarizen.api.faults.SessionTimeoutFailure sessionTimeoutFailure, Throwable cause) {
        super(message, cause);
        this.sessionTimeoutFailure = sessionTimeoutFailure;
    }

    public com.clarizen.api.faults.SessionTimeoutFailure getFaultInfo() {
        return this.sessionTimeoutFailure;
    }
}
