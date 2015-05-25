
package org.imageuploader.service;

import org.imageuploader.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * @author Georgia Papp
 */

@RepositoryRestResource
public interface UserRepository  extends PagingAndSortingRepository<User,String> {
    User getUserByUsername(@Param("username") String email);
}
