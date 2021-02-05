package elasticjob.springboot.operate;

import elasticjob.springboot.config.ElasticJobConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class JobController {
@Autowired
private ElasticJobConfig elasticJobConfig;

@RequestMapping("/addJob")
    public void addJob() {
        int shardingTotalCount = 2;
        // elasticJobConfig.addSimpleJobScheduler(new SimpleJobDemo().getClass(),"* * * * * ?",shardingTotalCount,"0=A,1=B");
    }




}
