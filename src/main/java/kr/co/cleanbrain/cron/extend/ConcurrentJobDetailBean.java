package kr.co.cleanbrain.cron.extend;

import org.springframework.scheduling.quartz.JobDetailBean;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: 노상현
 * Date: 2020-01-18
 * Time: 오후 5:17
 */
@Component
public class ConcurrentJobDetailBean extends JobDetailBean {
    boolean concurrent = false;

    public void setConcurrent(boolean concurrent) {
        this.concurrent = concurrent;
    }

    @Override
    public boolean isStateful() {
        return !concurrent;
    }
}
