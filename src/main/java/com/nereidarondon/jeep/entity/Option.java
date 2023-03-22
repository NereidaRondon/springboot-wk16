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
public class Option {
  private Long optionPK;
  private String optionId;
  private OptionType category;
  private String manufacturer;
  private String name;
  private BigDecimal price;
  
}
