package frc.isw.deliverEat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("pedidos")
@RequiredArgsConstructor
public class PedidoComercioController {

  @GetMapping("index")
  public String realizarPedido(){
      return "pedidos/index";
  }
}