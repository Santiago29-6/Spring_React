package com.ks.codigo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWordRepository extends JpaRepository<HelloEntity,Long>{
    
    
}