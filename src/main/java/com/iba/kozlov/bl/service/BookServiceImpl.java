package com.iba.kozlov.bl.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.iba.kozlov.dao.BookDao;
import com.iba.kozlov.db.dto.BookDto;
import com.iba.kozlov.entity.BookEntity;


public class BookServiceImpl implements BookService {
	private static final Logger LOGGER = Logger.getLogger(BookServiceImpl.class);
	BookDao bookDao = new BookDao();
	Mapper mapper=new Mapper();
	public List<BookDto> readBooks() {
		LOGGER.info("createBooks method");
		//BookSearchCriteria bookSearchCriteria = new BookSearchCriteria();
		List<BookEntity> books= bookDao.read();
		List<BookDto> bookDto= new ArrayList<BookDto>();
		for(BookEntity bookEntity:books){
			bookDto.add(mapper.bookEntityToDto(bookEntity));
		}
		return bookDto;
	}
	public void addBooks(BookDto bookDto) {
		LOGGER.info("addBook ");
		
	}
	public void editBooks(BookDto bookDto) {
		bookDao.update(mapper.bookDtoToEntity(bookDto));
	}
	public List<BookDto> searchBooks(BookDto bookDto) {
		
		return null;
	}


	


}
