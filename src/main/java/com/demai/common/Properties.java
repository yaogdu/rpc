package com.demai.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 
 * @author lishiwei
 * 
 */
@Component
public class Properties {

  @Value("${alter}")
  public String alter;

  @PostConstruct
  public void init() {
    System.out.println(this.alter);
  }

  public void setAlter(String alter) {
    this.alter = alter;
  }

}
