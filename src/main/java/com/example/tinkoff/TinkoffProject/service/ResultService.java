package com.example.tinkoff.TinkoffProject.service;

import com.example.tinkoff.TinkoffProject.model.Result;
import com.example.tinkoff.TinkoffProject.repository.ResultRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/*
 * Service for Result entity
 *
 */

@Service
public class ResultService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ResultRepository resultRepository;

    @Autowired
    public ResultService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    //Save Result Entity in DB
    @Transactional
    public void persist(Result result) {
        logger.info("\n----------------------------------\nДобавление сущности Result в базу данных." + new Date());
        resultRepository.save(result);
    }


}
