package com.mainbackend.techjourneynavigator.Repo;

import com.mainbackend.techjourneynavigator.Model.InputParameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface InputParamatersRepo extends JpaRepository<InputParameters, Integer>{
}
