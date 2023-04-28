package com.avanade.rpg.repository.Character;

import com.avanade.rpg.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CharacterRepository extends JpaRepository<Character, Long> {

    Character findById(long id);
}
