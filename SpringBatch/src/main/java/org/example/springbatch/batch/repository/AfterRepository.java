package org.example.springbatch.batch.repository;

import org.example.springbatch.batch.entity.AfterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfterRepository extends JpaRepository<AfterEntity, Long> {
}
