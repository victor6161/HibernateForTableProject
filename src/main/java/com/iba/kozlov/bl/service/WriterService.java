package com.iba.kozlov.bl.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.iba.kozlov.dao.WriterDao;
import com.iba.kozlov.dao.WriterSearchCriteria;
import com.iba.kozlov.db.dto.WriterDto;
import com.iba.kozlov.entity.WriterEntity;

public class WriterService {
	private static final Logger LOGGER = Logger.getLogger(WriterService.class);
	private WriterDao writerDao = new WriterDao();
	private Mapper mapper = new Mapper();

	/*
	 * public int findIdBySurname(String writerSurname) { LOGGER.info(
	 * "findIdBySurname method");
	 * 
	 * List<WriterDto> writerDto = writerDao.read(null);
	 * 
	 * for(WriterDto writer:writerDto){
	 * if(writer.getSurname().equals(writerSurname)){ return writer.getId(); } }
	 * return 0; }
	 */
	public List<WriterDto> readWriters() {
		LOGGER.info("readWriters");
		List<WriterEntity> writerEntities = writerDao.read();
		List<WriterDto> writerDto = new ArrayList<WriterDto>();
		for (WriterEntity writerEntity : writerEntities) {
			writerDto.add(mapper.writerEntityToDto(writerEntity));
		}
		return writerDto;
	}

	public void createWriter(WriterDto writerDto) {
		LOGGER.info("createWriter");

		writerDao.create(mapper.writerDtoToEntity(writerDto));
	}

	public void editWriter(WriterDto writerDto) {
		LOGGER.info("editWriter");
		writerDao.update(mapper.writerDtoToEntity(writerDto));
	}

	public List<WriterDto> searchWriters(WriterDto writerDto) {
		LOGGER.info("searchWriter");
		
		List<WriterDto> writerDtoResult = new ArrayList<WriterDto>();
		List<WriterEntity> writerEntities = writerDao.read();
		for (WriterEntity writerEntity : writerEntities) {
			if (writerEntity.getId().equals(writerDto.getId())) {
				writerDtoResult.add(mapper.writerEntityToDto(writerEntity));
			}
		}
		return writerDtoResult;
	}
	/*
	 * 
	 * public List<WriterDto> searchWriters(WriterDto writerDto) {
	 * LOGGER.info("searchWriter"); WriterSearchCriteria
	 * writerSearchCriteria=new WriterSearchCriteria();
	 * writerSearchCriteria.setWriterId(writerDto.getId()); return
	 * writerDao.read(writerSearchCriteria); }
	 */
}
