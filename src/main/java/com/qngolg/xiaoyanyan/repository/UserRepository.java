package com.qngolg.xiaoyanyan.repository;

import com.qngolg.xiaoyanyan.repository.po.UserPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserPo,Long> {
}
