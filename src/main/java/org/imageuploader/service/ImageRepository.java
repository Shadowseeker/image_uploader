package org.imageuploader.service;

import org.imageuploader.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Paul Silaghi
 */
@RepositoryRestResource
public interface ImageRepository extends CrudRepository<Image,String> {
    List<Image> findByAuthor(String author);
}
