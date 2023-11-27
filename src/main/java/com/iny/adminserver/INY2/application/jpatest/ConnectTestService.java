package com.iny.adminserver.INY2.application.jpatest;

import com.iny.adminserver.INY2.infrastructure.jpa.entity.ConnectTest;
import com.iny.adminserver.INY2.infrastructure.jpa.repository.ConnectTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConnectTestService {
    @Autowired
    private ConnectTestRepository connectTestRepository;

    public ConnectTest saveText(ConnectTest text) {
        return connectTestRepository.save(text);
    }

    public void deleteTextById(Integer id) {
        connectTestRepository.deleteById(id);
    }

    // DB 연결 확인
    public ConnectTest getConnectResult(Integer id) {
        return connectTestRepository.findById(id).orElse(null);
    }


}
