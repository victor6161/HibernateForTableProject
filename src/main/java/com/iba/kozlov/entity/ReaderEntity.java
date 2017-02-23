package com.iba.kozlov.entity;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

public class ReaderEntity {
	@Setter
	@Getter
	private Integer id;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private String surname;
	@Setter
	@Getter
	private Set<BookEntity> bookEntities;
}
