package com.alprael.mobileappws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MobileAppWsApplication {

  public static void main(String[] args) {
    //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());

    ApplicationContext applicationContext =
        SpringApplication.run(MobileAppWsApplication.class, args);
    BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
    int result =
        binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
    System.out.println(result);
  }

}
