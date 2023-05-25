package org.ecommerce.userservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.userservice.dto.*;
import org.ecommerce.security.CustomUserDetailsService;

@RestController
@RequestMapping("/customUserDetailsService")
public class CustomUserDetailsServiceController {
    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @PostMapping(value = "/loadUserByUsername", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomUserDetailsServiceLoadUserByUsernameOutDTO> loadUserByUsername(@RequestBody CustomUserDetailsServiceLoadUserByUsernameInDTO in) {
        CustomUserDetailsServiceLoadUserByUsernameOutDTO ret = new CustomUserDetailsServiceLoadUserByUsernameOutDTO();
        ret.setRetVal(customUserDetailsService.loadUserByUsername(in.getUsername()));
        return ResponseEntity.ok(ret);
    }

}