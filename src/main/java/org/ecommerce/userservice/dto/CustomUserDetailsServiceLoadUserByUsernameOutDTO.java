package org.ecommerce.userservice.dto;

import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetailsServiceLoadUserByUsernameOutDTO {
    private UserDetails retVal;
    
    
    public UserDetails getRetVal() {
        return retVal;
    }

    public void setRetVal(UserDetails retVal) {
        this.retVal = retVal;
    }
    
}