package com.iba.kozlov.bl.service;

import com.iba.kozlov.db.dto.BookDto;
import com.iba.kozlov.db.dto.ReaderDto;
import com.iba.kozlov.db.dto.WriterDto;
import com.iba.kozlov.entity.BookEntity;
import com.iba.kozlov.entity.ReaderEntity;
import com.iba.kozlov.entity.WriterEntity;

public class Mapper {
	public BookDto bookEntityToDto(BookEntity bookEntity) {
		BookDto bookDto = new BookDto();
		bookDto.setId(bookEntity.getId());
		bookDto.setBookname(bookEntity.getBookname());
		bookDto.setPrice(bookEntity.getPrice());
		bookDto.setWriter(writerEntityToDto(bookEntity.getWriterEntity()));
		return bookDto;
	}
	public BookEntity bookDtoToEntity(BookDto bookDto) {
		BookEntity bookEntity = new BookEntity();
		bookEntity.setId(new Integer(bookDto.getId()));
		bookEntity.setBookname(bookDto.getBookname());
		bookEntity.setPrice(bookDto.getPrice());
		bookEntity.setWriterEntity(writerDtoToEntity(bookDto.getWriter()));
		return bookEntity;
	}

	public WriterDto writerEntityToDto(WriterEntity writerEntity) {
		WriterDto writerDto = new WriterDto();
		writerDto.setId(writerEntity.getId());
		writerDto.setName(writerEntity.getName());
		writerDto.setSurname(writerEntity.getSurname());
		writerDto.setCountry(writerEntity.getCountry());
		return writerDto;
	}

	public WriterEntity writerDtoToEntity(WriterDto writerDto) {
		WriterEntity writerEntity = new WriterEntity();
		writerEntity.setId(writerDto.getId());
		writerEntity.setName(writerDto.getName());
		writerEntity.setSurname(writerDto.getSurname());
		writerEntity.setCountry(writerDto.getCountry());
		return writerEntity;
	}

	public ReaderDto readerEntityToDto(ReaderEntity readerEntity) {
		ReaderDto readerDto=new ReaderDto();
		readerDto.setId(readerEntity.getId());
		readerDto.setName(readerEntity.getName());
		readerDto.setSurname(readerEntity.getSurname());
		
		return readerDto;
	}
}
