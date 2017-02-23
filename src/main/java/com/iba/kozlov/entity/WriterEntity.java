package com.iba.kozlov.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;

public class WriterEntity {
	@Override
	public String toString() {
		return "WriterEntity [id=" + id + ", name=" + name + ", surname=" + surname + ", bookEntities=" + bookEntities
				+ "]";
	}
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
	private String country;
	@Setter
	@Getter
	private Set<BookEntity> bookEntities;
}
