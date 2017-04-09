import com.herman.entity.User;
import com.herman.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class BaseTestUtil {

    private static Logger log = Logger.getLogger(BaseTestUtil.class);

    @Resource
    private IUserService userService;

    @Test
    public void testUser() {
        log.info("testUser");

    }

    @Test
    public void insert() {
        User user = new User(3, "jack", "qwe123", new Date());
        this.userService.doInsert(user);
        log.info("Insert successfully!");
    }

    @Test
    public void testAOPAspect() {
//        this.userService.doPrint();
//        System.out.println(this.userService.findUserById(1).getUsername());
        this.userService.testAroundAdviceWithParams("herman", 2);

    }
}
