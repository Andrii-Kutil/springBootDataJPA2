package com.gmail.kutilandrej.springdatarest.dao;

import com.gmail.kutilandrej.springdatarest.entity.Human;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanRepository extends JpaRepository<Human, Integer> {
  List<Human> findAllBySalaryAfter(long salary);
}
