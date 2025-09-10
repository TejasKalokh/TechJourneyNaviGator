package com.mainbackend.techjourneynavigator.Repo;

import com.mainbackend.techjourneynavigator.Model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {
}
