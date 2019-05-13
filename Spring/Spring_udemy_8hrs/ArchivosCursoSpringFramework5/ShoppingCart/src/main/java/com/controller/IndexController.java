package com.controller;

import com.service.ProductoDto;
import com.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController
{
    @Autowired
    private ProductoService ProductService;

    public List<ProductoDto> ProductoDtoList()
    {
        List<ProductoDto> DataList = new ArrayList<>();
        DataList.add(new ProductoDto(1, "Samsung Galaxy S8", 900.0));
        DataList.add(new ProductoDto(2, "Samsung Galaxy S7", 800.0));
        DataList.add(new ProductoDto(3, "Samsung Galaxy S6", 700.0));
        DataList.add(new ProductoDto(4, "Samsung Galaxy S5", 600.0));
        return DataList;
    }

    @GetMapping("/")
    public String IndexGET(ModelMap Model)
    {
        Model.addAttribute("ProductoDtoList", ProductoDtoList());
        Model.addAttribute("ProductoSessionDtoList", ProductService.getDataList());
        return "index";
    }

    @PostMapping("/save")
    public String SaevPOST(ModelMap Model, ProductoDto FormData)
    {
        ProductService.Save(FormData);
        return "redirect:/";
    }

    @GetMapping("/delete/{IdePro}")
    public String DeleteGET(@PathVariable Integer IdePro)
    {
        ProductService.Delete(IdePro);
        return "redirect:/";
    }
}