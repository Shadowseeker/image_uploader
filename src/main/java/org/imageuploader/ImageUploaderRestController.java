package org.imageuploader;


import org.imageuploader.service.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Paul Silaghi
 */

@SpringBootApplication
public class ImageUploaderRestController {

    @Autowired
    ImageRepository imageRepository;


    public static void main(String[] args) throws Exception {
        SpringApplication.run(ImageUploaderRestController.class, args);
    }
}
