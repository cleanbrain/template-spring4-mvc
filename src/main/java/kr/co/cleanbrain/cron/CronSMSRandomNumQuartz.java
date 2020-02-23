package kr.co.cleanbrain.cron;

// import kr.co.nandsoft.sso.portal.dao.PortalDao;

import org.quartz.JobExecutionContext;
import org.quartz.StatefulJob;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class CronSMSRandomNumQuartz extends QuartzJobBean implements StatefulJob {
    @Override
    protected void executeInternal(JobExecutionContext context) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring/context.datasource.xml");
        // PortalDao portalDao = ctx.getBean("portalDao", PortalDao.class);
        // portalDao.deleteExpiredRanNums();
    }
}
