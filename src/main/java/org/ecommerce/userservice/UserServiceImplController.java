package org.ecommerce.userservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.userservice.dto.*;
import org.ecommerce.web.services.impl.UserServiceImpl;

@RestController
@RequestMapping("/userServiceImpl")
public class UserServiceImplController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping(value = "/getCurrentUserId", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserServiceImplGetCurrentUserIdOutDTO> getCurrentUserId(@RequestBody UserServiceImplGetCurrentUserIdInDTO in) {
        UserServiceImplGetCurrentUserIdOutDTO ret = new UserServiceImplGetCurrentUserIdOutDTO();
        ret.setRetVal(userServiceImpl.getCurrentUserId());
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/getAddresses", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserServiceImplGetAddressesOutDTO> getAddresses(@RequestBody UserServiceImplGetAddressesInDTO in) {
        UserServiceImplGetAddressesOutDTO ret = new UserServiceImplGetAddressesOutDTO();
        ret.setRetVal(userServiceImpl.getAddresses(in.getUsername()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/isAuthenticated", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserServiceImplIsAuthenticatedOutDTO> isAuthenticated(@RequestBody UserServiceImplIsAuthenticatedInDTO in) {
        UserServiceImplIsAuthenticatedOutDTO ret = new UserServiceImplIsAuthenticatedOutDTO();
        ret.setRetVal(userServiceImpl.isAuthenticated());
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/hasAddresses", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserServiceImplHasAddressesOutDTO> hasAddresses(@RequestBody UserServiceImplHasAddressesInDTO in) {
        UserServiceImplHasAddressesOutDTO ret = new UserServiceImplHasAddressesOutDTO();
        ret.setRetVal(userServiceImpl.hasAddresses(in.getUsername()));
        return ResponseEntity.ok(ret);
    }

}