package com.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import java.util.HashSet;
import java.util.Set;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProductoService
{
    private Set<ProductoDto> DataList = new HashSet<>();

    public Set<ProductoDto> getDataList()
    {
        return DataList;
    }

    public void Save(ProductoDto ProductoDTO)
    {
        if(!DataList.contains(ProductoDTO))
        {
            DataList.add(ProductoDTO);
        }
    }

    public void Delete(Integer IdePro)
    {
        DataList.removeIf(F -> F.getIdePro().equals(IdePro));
    }
}