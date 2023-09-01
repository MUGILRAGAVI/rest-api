package com.excercise.day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excercise.day5.Entity.BookEntity;

public interface BookInterface extends JpaRepository<BookEntity, Integer> {

}
