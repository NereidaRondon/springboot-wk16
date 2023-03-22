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
@Data
public class Order {
  private Customer customer;
  private Jeep model;
  private Color color;
  private Engine engine;
  private Tire tire;
  private List<Option> options;
}
