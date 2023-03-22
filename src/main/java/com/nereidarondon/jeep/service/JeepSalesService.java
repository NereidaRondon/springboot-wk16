/**
 * 
 */
package com.nereidarondon.jeep.service;

import java.util.List;
import com.nereidarondon.jeep.entity.Jeep;
import com.nereidarondon.jeep.entity.JeepModel;

/**
 * @author Nery
 *
 */
public interface JeepSalesService {

  /**
   * @param model
   * @param trim
   * @return
   */
  List<Jeep> fetchJeeps(JeepModel model, String trim);

}
