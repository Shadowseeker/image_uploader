package org.imageuploader.controller;

import org.imageuploader.domain.User;
import org.imageuploader.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {

  @Autowired
  UserRepository repository;

  @RequestMapping(value = "/users/friends", method = RequestMethod.GET)
  public HttpEntity<PagedResources<User>> showUsers(Model model, Pageable pageable, PagedResourcesAssembler assembler) {

      Page<User> persons = repository.findAll(pageable);
      return new ResponseEntity<>(assembler.toResource(persons), HttpStatus.OK);
  }
}