package org.example.finalworkapi.Domain.RepositoryInterfaces;

import org.example.finalworkapi.Domain.Entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobLogisticaRepository extends JpaRepository<Job, Integer> {
}