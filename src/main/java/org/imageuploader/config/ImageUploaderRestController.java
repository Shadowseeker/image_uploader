package org.imageuploader.config;


import org.imageuploader.domain.Image;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paul Silaghi
 */

@RestController
@EnableAutoConfiguration
public class ImageUploaderRestController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(ImageUploaderRestController.class, args);
    }
}
