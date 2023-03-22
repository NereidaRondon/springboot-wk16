/**
 * 
 */
package com.nereidarondon.jeep.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @author Nery
 *
 */
@Data
public class Color {
  private Long colorPK;
  private String colorId;
  private String color;
  private BigDecimal price;
  private boolean isExterior;
}
