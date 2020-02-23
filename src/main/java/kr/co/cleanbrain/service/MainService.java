package kr.co.cleanbrain.service;

import kr.co.cleanbrain.config.BizURL;
import kr.co.cleanbrain.vo.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: 노상현
 * Date: 2020-02-14
 * Time: 오후 4:20
 */
@Service
public class MainService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private TestBean testBean;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BizURL bizURL;

    public String getTestMessage() {
        return testBean.getTestMessage();
    }

    public String getTestBizURL() {
        return bizURL.getPotalMainURL();
    }
}
