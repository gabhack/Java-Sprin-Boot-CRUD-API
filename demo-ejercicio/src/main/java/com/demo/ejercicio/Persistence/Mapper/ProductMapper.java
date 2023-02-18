package com.demo.ejercicio.Persistence.Mapper;

import com.demo.ejercicio.Domain.Product;
import com.demo.ejercicio.Persistence.Entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring", uses ={CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping( target="productId", source="idProducto"),
            @Mapping(target="category", source = "categoria"),
            @Mapping(target = "stock", source = "cantidadStock"),
            @Mapping(target = "categoryId", source = "idCategoria"),
            @Mapping(target = "price", source = "precioVenta"),
            @Mapping(target = "name", source = "nombre"),
            @Mapping(target = "active", source = "estado")
    })
    Product toProduct(Producto producto);
    List<Product> toProducts( List<Producto> producto);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);

}
