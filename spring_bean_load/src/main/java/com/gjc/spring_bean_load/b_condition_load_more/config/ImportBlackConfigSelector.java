package com.gjc.spring_bean_load.b_condition_load_more.config;

import com.gjc.spring_bean_load.b_condition_load_more.bean.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ImportBlackConfigSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{Blue.class.getName()};
    }
}
