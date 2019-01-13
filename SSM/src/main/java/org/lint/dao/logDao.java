package org.lint.dao;


import org.lint.entity.BookLog;
import org.springframework.stereotype.Repository;

@Repository
public interface logDao {
    int insertlog (BookLog log);
}
