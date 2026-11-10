package dev.tristanspear.cloudfilemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @GetMapping("/health")
    public static String health(){
        return "File API is running";
    }

    @GetMapping("/about")
    public static String about(){
        return "This project is a server-side application that ";
    }

}
