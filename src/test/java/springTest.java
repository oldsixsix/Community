import com.community.springApplication;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = springApplication.class)
public class springTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void test() throws SQLException {
        System.out.println(dataSource.getClass());
//        class org.apache.tomcat.jdbc.pool.DataSource
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
//        ProxyConnection[PooledConnection[com.mysql.jdbc.JDBC4Connection@3003e580]]
        connection.close();
    }
}
