package noticeme.mentions.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MentionRepository extends JpaRepository<Mention, Long> {
    List<Mention> findAllByOrderByCreatedAtDesc();
}
