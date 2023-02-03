package com.example.demo.box.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.box.dto.Box;

@Mapper
public interface BoxDao {

  int insert(Box box);

  List<Box> findByNo(int no);

}
