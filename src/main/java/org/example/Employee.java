package org.example;

import org.springframework.util.StringUtils;

public class Employee {
  public String findEmployee(String employeeId, String callerId){
      if(employeeId.length() > 8){
          return "IT Department";
      }
      else if (employeeId.length() < 8) {
              return "Software Department";
          }
      if(callerId.length()<10){
          return "Azure Deparment";
      }
      else if (callerId.length() > 10) {
              return "Aws Deparment";
          }
      else{
          return "no Deparment Found";
      }
  }

}
