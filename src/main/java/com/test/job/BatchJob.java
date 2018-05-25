package com.test.job;

import com.test.service.TestService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

@Component
public class BatchJob implements  Job {
    final static Logger logger = Logger.getLogger(BatchJob.class);

    @Autowired
    TestService testService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        try {
            testService.testdb();
        }catch (Exception e){
            logger.info("Exception : ", e.fillInStackTrace());
        }
    }
}