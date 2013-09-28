package org.domain.seam.example.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.framework.EntityHome;

import org.domain.seam.example.entity.Service;

@Name("serviceHome")
public class ServiceHome extends EntityHome<Service>
{
    @RequestParameter Long serviceId;

    @Override
    public Object getId()
    {
        if (serviceId == null)
        {
            return super.getId();
        }
        else
        {
            return serviceId;
        }
    }

    @Override @Begin
    public void create() {
        super.create();
    }

}
