package com.iny.adminserver.INY2.application.jpatest;

import com.iny.adminserver.INY2.infrastructure.jpa.entity.ConnectTest;
import com.iny.adminserver.INY2.application.jpatest.ConnectTestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ConnectTestIntegration {

    @Autowired
    private ConnectTestService connectTestService;

    @Test
    public void testJpaIntegration() {
        // test text insert
        ConnectTest text = new ConnectTest("connect success!!");
        connectTestService.saveText(text);

        //DB connect test
        Integer id = text.getId();
        ConnectTest result = connectTestService.getConnectResult(id);
        Assert.assertEquals("connect success!!", result.getText());
        log.info(result.toString());

        // test text delete
        connectTestService.deleteTextById(id);
    }
}
