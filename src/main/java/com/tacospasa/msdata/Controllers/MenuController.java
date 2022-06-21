package com.tacospasa.msdata.Controllers;

import com.tacospasa.msdata.Entity.MenuCategoryEntity;
import com.tacospasa.msdata.Entity.SubCategoryEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/system")
public class MenuController {

    @GetMapping(path = "/menu")
    public List<MenuCategoryEntity> getMenuCategories(){
        List<MenuCategoryEntity> list = new ArrayList<>();
        List<SubCategoryEntity> subList = new ArrayList<>();

        MenuCategoryEntity category1 = new MenuCategoryEntity();
        MenuCategoryEntity category2 = new MenuCategoryEntity();
        MenuCategoryEntity category3 = new MenuCategoryEntity();

        SubCategoryEntity sub1 = new SubCategoryEntity();
        SubCategoryEntity sub2 = new SubCategoryEntity();
        SubCategoryEntity sub3 = new SubCategoryEntity();

        sub1.setSubCategoryName("Cosita 1");
        sub2.setSubCategoryName("cosita 2");
        sub3.setSubCategoryName("cosita 3");

        subList.add(sub1);
        subList.add(sub2);
        subList.add(sub3);

        category1.setCategoryName("Inventario");
        category2.setCategoryName("Ventas");
        category3.setCategoryName("Administración");

        category1.setSubCategories(subList);
        category2.setSubCategories(subList);
        category3.setSubCategories(subList);


        list.add(category1);
        list.add(category2);
        list.add(category3);
        return list;
    }
}
