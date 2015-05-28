package org.imageuploader.service;

import org.imageuploader.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Georgia Papp
 */

public interface UserRepositoryCustom {

    Page<User> getFriendSuggestionsForUser(@Param("user_uuid") String user_uuid);
}
