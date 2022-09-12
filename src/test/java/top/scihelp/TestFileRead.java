package top.scihelp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.scihelp.pojo.Kg;
import top.scihelp.utils.ReadFile;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class TestFileRead {

    @Test
    public void TestReadData(){
        Kg kg = ReadFile.readFileData("C:\\Users\\11078\\Desktop\\test.txt");
        System.out.println(kg.toString());
    }
}
