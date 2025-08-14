package com.betaqq.FirstSpringBootProject.Dao;

import com.betaqq.FirstSpringBootProject.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
