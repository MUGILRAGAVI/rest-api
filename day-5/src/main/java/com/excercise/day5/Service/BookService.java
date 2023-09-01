package com.excercise.day5.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.excercise.day5.Entity.BookEntity;
import com.excercise.day5.Repository.BookInterface;

@Service
public class BookService {
	@Autowired
	BookInterface bookinterface;
	public List<BookEntity> getinfo()
	{
		return bookinterface.findAll();
		
	}
	public List<BookEntity> saveinfo(@RequestBody List<BookEntity> bookentity)
	{
		return bookinterface.saveAll(bookentity);
	}
	public BookEntity putinfo(@RequestBody BookEntity bookentity)
	{
		return bookinterface.saveAndFlush(bookentity);
	}
	public void delete(BookEntity bookentity)
	{
	     bookinterface.delete(bookentity);
	}

}
