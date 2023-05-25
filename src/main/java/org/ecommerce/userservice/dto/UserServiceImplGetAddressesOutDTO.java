package org.ecommerce.userservice.dto;

import java.util.Set;
import org.ecommerce.persistence.models.Address;

public class UserServiceImplGetAddressesOutDTO {
    private Set<Address> retVal;
    
    
    public Set<Address> getRetVal() {
        return retVal;
    }

    public void setRetVal(Set<Address> retVal) {
        this.retVal = retVal;
    }
    
}