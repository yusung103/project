package org.example.springbatch.batch.repository;

import org.example.springbatch.batch.entity.BeforeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeforeRepository extends JpaRepository<BeforeEntity, Long> {
}
