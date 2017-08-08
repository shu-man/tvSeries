package edu.mum.tvSeries.service.impl;

import edu.mum.tvSeries.domain.Test;
import edu.mum.tvSeries.repository.TestRepository;
import edu.mum.tvSeries.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Hatake on 8/7/2017.
 */
@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestRepository testRepository;
    @Override
    public List<Test> findAll() {
        return (List<Test>) testRepository.findAll();
    }
}
