import com.offcn.AppStartUser;
import com.offcn.po.User;
import com.offcn.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = AppStartUser.class)
@RunWith(SpringRunner.class)
public class TestSpringBootService {

    @Autowired
    UserService userService;

    @Test
    public void testgetUserByUsername(){
        String username="admin";
        User user = userService.getUserByUsername(username);
        System.out.println(user);
    }
}
