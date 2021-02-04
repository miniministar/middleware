package quartz.spring;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyJob2 implements Job {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        log.info("嘿嘿： "+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) );
    }

}
