package edu.mum.tvSeries.repository;

import edu.mum.tvSeries.domain.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Hatake on 8/7/2017.
 */
@Repository
public interface TestRepository extends CrudRepository<Test, Integer>{
}
