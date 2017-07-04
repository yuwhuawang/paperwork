package com.paperwork.repositories.account;

import com.paperwork.domain.account.StudentsVo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by yuwhuawang on 17/7/4.
 */

public interface StudentsRepository extends MongoRepository<StudentsVo, String> {
    public StudentsVo findByUsername (String username );
    public List<StudentsVo> findByClass_name(String className);

}
