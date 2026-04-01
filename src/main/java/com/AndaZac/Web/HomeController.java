package com.AndaZac.Web;

import com.AndaZac.Web.model.Producto;
import com.AndaZac.Web.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    // @Autowired inyecta automáticamente nuestro servicio aquí
    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public String inicio(Model model) {
        // 1. Obtenemos la lista de productos desde el servicio
        List<Producto> catalogo = productoService.obtenerTodosLosProductos();

        // 2. Pasamos la lista al HTML bajo el nombre "productos"
        model.addAttribute("productos", catalogo);

        // 3. Retornamos la vista index.html
        return "index";
    }
}