package org.ecommerce.userservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.userservice.dto.*;
import org.ecommerce.web.admin.controllers.SelfUserAvatarController;

@RestController
@RequestMapping("/selfUserAvatarController")
public class SelfUserAvatarControllerController {
    @Autowired
    private SelfUserAvatarController selfUserAvatarController;

    @PostMapping(value = "/show", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SelfUserAvatarControllerShowOutDTO> show(@RequestBody SelfUserAvatarControllerShowInDTO in) {
        SelfUserAvatarControllerShowOutDTO ret = new SelfUserAvatarControllerShowOutDTO();
        ret.setRetVal(selfUserAvatarController.show(in.getUser(), in.getModel()));
        return ResponseEntity.ok(ret);
    }

}