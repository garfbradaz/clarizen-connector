
package org.mule.modules.clarizen.process;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-04-28T12:59:10-05:00", comments = "Build 3.4.3.1620.30ea288")
public interface ProcessAdapter<O >{

    <T> ProcessTemplate<T, O> getProcessTemplate();
}
