package com.vnrits.quizz.quizz_app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	@Query(nativeQuery = true, value = "select apitoken from admin where id=?1")
	public String getApiToken(Long userId);
	
	
}
