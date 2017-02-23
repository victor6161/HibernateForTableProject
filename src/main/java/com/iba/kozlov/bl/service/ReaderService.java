package com.iba.kozlov.bl.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.iba.kozlov.dao.ReaderDao;
import com.iba.kozlov.db.dto.ReaderDto;
import com.iba.kozlov.db.dto.WriterDto;
import com.iba.kozlov.entity.ReaderEntity;
import com.iba.kozlov.entity.WriterEntity;



public class ReaderService {
	private static final Logger LOGGER = Logger.getLogger(ReaderService.class);
	private ReaderDao readDao=new ReaderDao();
	Mapper mapper=new Mapper();
	public List<ReaderDto> readReaders(){
		LOGGER.info("readReaders");
		List<ReaderEntity> readerEntities =readDao.getList();
		List<ReaderDto> readerDto=new ArrayList<ReaderDto>();
		for(ReaderEntity readerEntity:readerEntities){
			readerDto.add(mapper.readerEntityToDto(readerEntity));
		}
		return readerDto;
	}
}
