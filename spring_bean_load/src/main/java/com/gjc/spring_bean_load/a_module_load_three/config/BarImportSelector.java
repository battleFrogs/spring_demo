package com.gjc.spring_bean_load.a_module_load_three.config;

import com.gjc.spring_bean_load.a_module_load_three.bean.Bar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{Bar.class.getName()};
    }


}
