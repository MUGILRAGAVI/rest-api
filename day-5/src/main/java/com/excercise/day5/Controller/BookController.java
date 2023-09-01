package com.excercise.day5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.excercise.day5.Entity.BookEntity;
import com.excercise.day5.Service.BookService;

public class BookController {
	@Autowired
	BookService bookser;
	@GetMapping("/")
	public List<BookEntity> showinfo()
	{
		return bookser.getinfo();
	}
	@PostMapping("/")
	public List<BookEntity> putinfo(@RequestBody List<BookEntity> bookentity)
	{
		return bookser.saveinfo(bookentity);
	}
	@PutMapping("/{id}")
	public BookEntity updateinfo(@RequestBody BookEntity bookentity)
	{
		return bookser.putinfo(bookentity);
	}
	@DeleteMapping("/{id}")
	public String delete(BookEntity bookentity)
	{
		bookser.delete(bookentity);
		return "Deleted the data SUCCESSFULLY";
	}

}
