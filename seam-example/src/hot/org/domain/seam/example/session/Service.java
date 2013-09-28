package org.domain.seam.example.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;
import org.jboss.seam.international.StatusMessages;
import org.hibernate.validator.Length;

@Name("service")
public class Service
{
    @Logger private Log log;

    @In StatusMessages statusMessages;

    private String value;

    public void service()
    {
        // implement your business logic here
        log.info("service.service() action called with: #{service.value}");
        statusMessages.add("service #{service.value}");
    }

    // add additional action methods
  
    @Length(max = 10)
    public String getValue()
    {
        return value;
    }
  
    public void setValue(String value)
    {
        this.value = value;
    }
  
}
