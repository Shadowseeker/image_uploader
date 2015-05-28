package org.imageuploader.service;

import org.imageuploader.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Georgia Papp
 */

public class UserRepositoryImpl implements UserRepositoryCustom {


    @Override
    public Page<User> getFriendSuggestionsForUser(@Param("user_uuid") String user_uuid) {
        List<User> returnlist = new ArrayList<User>();
        returnlist.add(new User());

        return new PageImpl<User>(returnlist);
    }
}
