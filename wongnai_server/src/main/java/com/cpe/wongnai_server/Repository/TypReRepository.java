package com.cpe.wongnai_server.Repository;

import com.cpe.wongnai_server.entity.TypRe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypReRepository  extends JpaRepository<TypRe ,Long >{
}


