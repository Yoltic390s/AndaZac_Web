package com.AndaZac.Web.service;

import com.AndaZac.Web.model.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    public List<Producto> obtenerTodosLosProductos() {
        List<Producto> catalogo = new ArrayList<>();
        long idCounter = 1L;

        // ==========================================
        // CATEGORÍA: ANDAMIOS
        // ==========================================
        catalogo.add(new Producto(idCounter++, "Andamio 0.80 x 1.00", "Estructura tubular modular.", "Andamios", "assets/img/productos/andamio_80x100.png"));
        catalogo.add(new Producto(idCounter++, "Andamio 0.80 x 2.00", "Estructura tubular modular.", "Andamios", "assets/img/productos/andamio_80x200.png"));
        catalogo.add(new Producto(idCounter++, "Andamio 1.10 x 1.00", "Estructura tubular modular.", "Andamios", "assets/img/productos/andamio_110x100.png"));
        catalogo.add(new Producto(idCounter++, "Andamio 1.10 x 2.00", "Estructura tubular modular.", "Andamios", "assets/img/productos/andamio_110x200.png"));
        catalogo.add(new Producto(idCounter++, "Andamio 1.60 x 1.00", "Estructura tubular modular.", "Andamios", "assets/img/productos/andamio_160x100.png"));
        catalogo.add(new Producto(idCounter++, "Andamio 1.60 x 2.00", "Estructura tubular modular.", "Andamios", "assets/img/productos/andamio_160x200.png"));
        catalogo.add(new Producto(idCounter++, "Andamio Peatonal 1.60 x 2.00", "Estructura tipo túnel para paso peatonal seguro.", "Andamios", "assets/img/productos/andamio_peatonal.png"));


        // ==========================================
        // CATEGORÍA: MAQUINARIA (EQUIPO PESADO)
        // ==========================================
        catalogo.add(new Producto(idCounter++, "Compactadora Mikasa MT-74F", "Fuerza de impacto de 1,400 kg. Motor Honda GXR120 de 4 tiempos.", "Maquinaria", "assets/img/productos/maquinaria_compactadora.png"));
        catalogo.add(new Producto(idCounter++, "Cortadora de Concreto Joper", "Disco máximo de 14 pulgadas. Motor Kohler de 9.5 HP.", "Maquinaria", "assets/img/productos/maquinaria_cortadoraconcreto.png"));
        catalogo.add(new Producto(idCounter++, "Allanadora Oakland", "Diámetro de 36 pulgadas (92 cm) para acabado pulido de concreto.", "Maquinaria", "assets/img/productos/maquinaria_allanadora.png"));
        catalogo.add(new Producto(idCounter++, "Generador Eléctrico Kohler 9000 W", "Potencia máxima de 9,000 W. Motor Kohler Command PRO de 14 HP.", "Maquinaria", "assets/img/productos/maquinaria_generador.png"));
        catalogo.add(new Producto(idCounter++, "Motobomba 3\" Kohler", "Motor 6.5 HP, capacidad de 1,000 litros/min y elevación de 30m.", "Maquinaria", "assets/img/productos/maquinaria_motobomba3.png"));
        catalogo.add(new Producto(idCounter++, "Motobomba 2\" Honda", "Motor de 4.8 HP. Caudal de 670 litros/min.", "Maquinaria", "assets/img/productos/maquinaria_motobomba2.png"));
        catalogo.add(new Producto(idCounter++, "Vibrador de Concreto a Gasolina Kohler", "Motor 6.5 HP. Hasta 12,000 VPM para mezclas más densas.", "Maquinaria", "assets/img/productos/maquinaria_vibradorgasolina.png"));
        catalogo.add(new Producto(idCounter++, "Cortador de Pasto STIHL FS 55", "Motor a 2 tiempos de 27.2 cc, ideal para áreas verdes.", "Maquinaria", "assets/img/productos/maquinaria_desbrozadora.png"));

        // ==========================================
        // CATEGORÍA: DEMOLICIÓN Y CORTE
        // ==========================================
        catalogo.add(new Producto(idCounter++, "Demoledor DeWalt 30KG", "Energía de impacto de 62-68 Joules. Sistema antivibración SHOCKS.", "Demolicion", "assets/img/productos/demolicion_dewalt30kg.png"));
        catalogo.add(new Producto(idCounter++, "Demoledor Makita 30KG (HM1802)", "Potencia de 2,000W. 71.4 Joules de impacto.", "Demolicion", "assets/img/productos/demolicion_makita30kg.png"));
        catalogo.add(new Producto(idCounter++, "Demoledor Makita 17KG (HM1304B)", "Motor 1,500W. Energía de impacto de 27.5 Joules.", "Demolicion", "assets/img/productos/demolicion_makita17kg.png"));
        catalogo.add(new Producto(idCounter++, "Demoledor Makita 9.7KG (HM1203C)", "Sistema SDS-MAX. Energía de impacto de 19.1 Joules.", "Demolicion", "assets/img/productos/demolicion_makita9kg.png"));
        catalogo.add(new Producto(idCounter++, "Esmeriladora Makita 9\"", "Motor de 2,200 W a 6,600 RPM. Ideal para corte y desbaste pesado.", "Demolicion", "assets/img/productos/demolicion_esmeriladora.png"));
        catalogo.add(new Producto(idCounter++, "Cortadora para Metal DeWalt 14\"", "Tronzadora abrasiva de 2300W para cortes precisos en herrería.", "Demolicion", "assets/img/productos/demolicion_tronzadora.png"));

        // ==========================================
        // CATEGORÍA: OTROS (HERRAMIENTAS DIVERSAS)
        // ==========================================
        catalogo.add(new Producto(idCounter++, "Vibrador de Concreto Eléctrico DINGO", "Motor de 2,300W (aprox 3 HP). Doble aislamiento para seguridad.", "Otros", "assets/img/productos/otros_vibradorelectrico.png"));
        catalogo.add(new Producto(idCounter++, "Motosierra", "Equipo de corte portátil para madera.", "Otros", "assets/img/productos/otros_motosierra.png"));

        return catalogo;
    }
}