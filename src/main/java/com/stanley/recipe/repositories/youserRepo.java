package com.stanley.recipe.repositories;

import com.stanley.recipe.models.youser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface youserRepo extends JpaRepository <youser, Long> {
    youser findByUserName(String username);
}
