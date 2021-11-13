package com.thinkbig.springweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.thinkbig.springweb.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
