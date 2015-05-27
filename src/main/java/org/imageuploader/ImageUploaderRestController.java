package org.imageuploader;


import org.imageuploader.domain.Image;
import org.imageuploader.domain.User;
import org.imageuploader.service.ImageRepository;
import org.imageuploader.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

/**
 * @author Paul Silaghi
 */

@SpringBootApplication
public class ImageUploaderRestController {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ImageUploaderRestController.class, args);
   /*     RestTemplate restTemplate = new RestTemplate();
        Image image = new Image("Paul","test");
        restTemplate.postForLocation("http://localhost:8080/images",image);*/
    }


}
