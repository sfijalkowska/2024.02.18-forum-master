package com.github.fijalkowskasylwia.forum.user.activation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivationCodeRepository extends JpaRepository<ActivationCode, String> {

}
