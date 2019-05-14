package zv2.com.cn.entity.pub.chatroom;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lb
 * @date 2019/5/14
 */
public class ChatroomTest {
    @Test
    public void testCollectionInjectAttribute() {
//        引入额外的配置文件方式二，不推荐
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml", "applicationContext-dev.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Chatroom chatroom = (Chatroom) applicationContext.getBean("chatroom");
        System.out.println(chatroom.getTitle()+", 房间tags: "+chatroom.getTags());
    }
}
