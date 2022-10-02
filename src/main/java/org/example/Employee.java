package org.example;

import org.springframework.util.StringUtils;

public class Employee {
  public String findEmployee(String employeeId, String callerId) {
      try {
          if (employeeId.length() > 8) {
              return "IT Department";
          } else if (employeeId.length() < 8) {
              return "Software Department";
          }
      } catch (Exception e) {
          try {
              if (callerId.length() < 10) {
                  return "Azure Deparment";
              } else if (callerId.length() > 10) {
                  return "Aws Deparment";
              }
          }
          catch (Exception e1){
              System.out.println(e1);
          }
      }
      return "no Deparment Found";
  }

}
