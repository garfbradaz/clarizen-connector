/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen;

import com.clarizen.api.ErrorCode;

/**
 * Clarizen Runtime Exception
 *  
 */
public class ClarizenRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -6610171710776228369L;
    
    public ClarizenRuntimeException (String exceptionMessage) {
        super(exceptionMessage);
    }

    public ClarizenRuntimeException(Throwable cause) {
        super(cause);
    }

    public ClarizenRuntimeException (String exceptionMessage, Throwable cause) {
        super(exceptionMessage, cause);
    }
    
    public ClarizenRuntimeException (ErrorCode errorCode, String message) {
        super(errorCode.value() + ": " + message);
    }
}
