/**
 * 
 */
package com.nereidarondon.jeep.entity;

import java.util.List;
import lombok.Data;

/**
 * @author Nery
 *
 */
// Jackson has to have setters to populate this data
// annotation generates setters and getters
@Data 
public class OrderRequest {
  //data transfer object
  private String customer;
  private JeepModel model;
  private String trim;
  private int doors;
  private String color;
  private String engine;
  private String tire;
  private List<String> options;

}
