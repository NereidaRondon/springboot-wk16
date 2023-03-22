/**INTERFACE
 * This will house OpenAPI documentation, /jeep will be mapped here
 */
package com.nereidarondon.jeep.controller;

import java.util.List;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.nereidarondon.jeep.Constants;
import com.nereidarondon.jeep.entity.Jeep;
import com.nereidarondon.jeep.entity.JeepModel;
import com.nereidarondon.jeep.entity.Order;
import com.nereidarondon.jeep.entity.OrderRequest;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

// turns on Bean validation 
@Validated
//tells Spring to map any URIs with /jeeps after port # to this class 
@RequestMapping("/orders")
//@formatter:off
@OpenAPIDefinition(
    info = @Info(title = "Jeep Order Service"),
    servers = {@Server(url = "http://localhost:8080", description = "Local server.")})
//@formatter:on
public interface JeepOrderController {
  
  
  // @formatter:off
  @Operation(
      summary = "Create an order for a Jeep",
      description = "Returns the created Jeep",
      responses = {
          @ApiResponse(
              responseCode = "201", 
              description = "The created Jeep is returned", 
              content = @Content(mediaType = "application/json", 
              schema = @Schema(implementation = Order.class))), 
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "A jeep component was not found with the input criteria", 
              content = @Content(mediaType = "application/json")), 
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred", 
              content = @Content(mediaType = "application/json"))
      },
      parameters = {
          @Parameter(
              name = "orderRequest", 
              required = true, 
              description = "The order is JSON")
      }
  )
  
  //Spring: map a get request on /orders
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  Order createOrder(@RequestBody OrderRequest orderRequest);
      

}
