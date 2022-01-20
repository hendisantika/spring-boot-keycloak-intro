package com.hendisantika.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.security.RolesAllowed

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak-intro
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/01/22
 * Time: 12.30
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/example")
class ExampleController {
    @GetMapping("/user")
//    @PreAuthorize("hasRole('user')")
    @RolesAllowed("user")
    fun getUserInfo(): ResponseEntity<String> =
        ResponseEntity.ok("User info")

    @GetMapping("/admin")
//    @PreAuthorize("hasRole('admin')")
    @RolesAllowed("admin")
    fun getAdminInfo(): ResponseEntity<String> =
        ResponseEntity.ok("Admin info")

    @GetMapping("/public")
    fun getPublicInfo(): ResponseEntity<String> =
        ResponseEntity.ok("Public info")
}