package com.syheliel.shortURL;

import org.springframework.data.jpa.repository.JpaRepository;

public interface URLRepository extends JpaRepository<myURL, Long> {

}
