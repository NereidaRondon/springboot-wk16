/**
 * 
 */
package com.nereidarondon.jeep.entity;

import lombok.Data;

/**
 * @author Nery
 *
 */
@Data 
public class Customer {
  private Long customerPK;
  private String customerId;
  private String firstName;
  private String lastName;
  private String phone;
}
