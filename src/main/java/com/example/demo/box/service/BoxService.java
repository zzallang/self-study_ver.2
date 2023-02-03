package com.example.demo.box.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.box.dao.BoxDao;
import com.example.demo.box.dto.Box;

@Service
public class BoxService {

  @Autowired
  BoxDao boxDao;

  public void add(Box box) {
    boxDao.insert(box);
  }

  public List<Box> get(int no) {
    System.out.println("서비스 받았다@");
    return boxDao.findByNo(no);
  }
}
