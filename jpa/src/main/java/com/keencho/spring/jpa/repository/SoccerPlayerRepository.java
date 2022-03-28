package com.keencho.spring.jpa.repository;

import com.keencho.spring.jpa.model.SoccerPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoccerPlayerRepository extends JpaRepository<SoccerPlayer, Long> {
}