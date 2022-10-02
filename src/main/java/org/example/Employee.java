package org.example;

import org.springframework.util.StringUtils;

public class Employee {
  public String findEmployee(String employeeId, String callerId) {   // In the test case we have made the value of employeeId = null; so here on lines 6 & 8 employeeId = null
      try {
          if (employeeId.length() > 8) {
              return "IT Department";
          } else if (employeeId.length() < 8) {
              return "Software Department";
          }
      } catch (Exception e) {   // We can write a test case for catch block by making employeeId = null
          try {
              if (callerId.length() < 10) {   // As a result of our making employeeId = null in the test, here in code line 8 checks condition. Since employeeId = null,
                  return "Azure Department";   // the program will skip lines 9-12 and go to the catch block line 13. Expected result is the return "Azure Department"
              } else if (callerId.length() > 10) {
                  return "Aws Department";
              }
          }
          catch (Exception e1){
              System.out.println(e1);
          }
      }
      return "no Department Found";
  }

}
