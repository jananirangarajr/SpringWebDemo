package com.thinkbig.springweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.thinkbig.springweb.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
