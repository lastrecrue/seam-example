package org.domain.seam.example.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import org.domain.seam.example.entity.Service;

@Name("serviceList")
public class ServiceList extends EntityQuery<Service>
{
    public ServiceList()
    {
        setEjbql("select service from Service service");
    }
}
