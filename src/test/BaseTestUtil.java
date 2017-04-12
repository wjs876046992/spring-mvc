import com.herman.entity.User;
import com.herman.service.IAdviceService;
import com.herman.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

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
        User user = new User(1, "jack", "qwe123", new Date());
        this.userService.doInsert(user);
        log.info("Insert successfully!");
    }

    @Test
    public void testAOPAspect() {
//        this.userService.doPrint();
//        System.out.println(this.userService.findUserById(1).getUsername());
//        this.userService.testAroundAdviceWithParams("herman", 2);
        ((IAdviceService)this.userService).advice();

    }

    @Test
    public void testJavaApp() {

        /*CopyOnWriteArrayList<Integer> arr = new CopyOnWriteArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            arr.remove(4);
            arr.add(i+10);
            for (int j = 0; j < arr.size(); j++) {

                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
        }*/

        /*java.util.ConcurrentModificationException
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            if(integer==2)
                list.remove(integer);
        }*/

        int x = 4;
        System.out.println("Value is " + (x > 4 ? 99.9 : 9));

        String t = new String("good");
        char[] ch = {'a', 'b', 'c'};
        change(t, ch);
        System.out.println(t+ch.toString());
    }

    private void change(String str, char ch[]) {

        str = "test ok";
        ch[0] = 'g';
    }
}
