package org.imageuploader.service;

import org.imageuploader.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Paul Silaghi
 */
@RepositoryRestResource
public interface ImageRepository extends JpaRepository<Image,String> {
    List<Image> findByAuthor(String author);
}
