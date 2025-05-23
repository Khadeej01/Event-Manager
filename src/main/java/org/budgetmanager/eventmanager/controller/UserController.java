//package org.budgetmanager.eventmanager.controller;
//
//import org.budgetmanager.eventmanager.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/user")
//public class UserController {
//
//    @Autowired private UserService userService;
//
//    @GetMapping("/profile")
//    public ResponseEntity<UserProfileDto> getProfile(@AuthenticationPrincipal String email) {
//        UserProfileDto dto = userService.getProfile(email);
//        if (dto != null) {
//            return ResponseEntity.ok(dto);
//        } else {
//            return ResponseEntity.status(404).build();
//        }
//    }
//
//    @PutMapping("/profile")
//    public ResponseEntity<String> updateProfile(@AuthenticationPrincipal String email,
//                                                @RequestBody UserProfileDto dto) {
//        String result = userService.updateProfile(email, dto);
//        return ResponseEntity.ok(result);
//    }
//}
//
