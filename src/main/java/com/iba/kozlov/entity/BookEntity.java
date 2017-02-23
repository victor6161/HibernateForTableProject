package com.iba.kozlov.entity;

import lombok.Getter;
import lombok.Setter;

public class BookEntity {

	

	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", bookname=" + bookname + ", price=" + price + "]";
	}
	@Setter
	@Getter
	private Integer id;
	@Setter
	@Getter
	private String bookname;
	@Setter
	@Getter
	private int price;
	@Setter
	@Getter
	private WriterEntity writerEntity;
}
