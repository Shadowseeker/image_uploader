package org.imageuploader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Paul Silaghi
 */
@Service
public class ImageService {

    @Autowired
    ImageRepository imageRepository;
}
