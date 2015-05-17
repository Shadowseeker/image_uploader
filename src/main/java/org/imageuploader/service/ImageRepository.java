package org.imageuploader.service;

import org.imageuploader.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author Paul Silaghi
 */
@RepositoryRestResource(collectionResourceRel = "images", path="images")
public interface ImageRepository extends JpaRepository<Image,String> {
    List<Image> findByAuthor(String author);
}
