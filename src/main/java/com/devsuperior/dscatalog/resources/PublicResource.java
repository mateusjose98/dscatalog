package com.devsuperior.dscatalog.resources;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@RestController
@RequestMapping("public")
public class PublicResource {

    @GetMapping
    public String getPublic(HttpServletRequest request) {
        return String.format("Data: %s Remote IP: %s Header IP %s", LocalDate.now().toString(), request.getRemoteAddr(), request.getHeader("X-FORWARDED-FOR"));
    }
}
