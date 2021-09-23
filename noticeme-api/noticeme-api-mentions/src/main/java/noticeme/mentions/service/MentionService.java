package noticeme.mentions.service;

import noticeme.mentions.api.dto.MentionRequest;
import noticeme.mentions.api.dto.MentionResponse;
import noticeme.mentions.domain.Mention;
import noticeme.mentions.domain.MentionRepository;
import noticeme.mentions.exception.MentionNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MentionService {
    private final MentionRepository mentionRepository;


    public MentionService(MentionRepository mentionRepository) {
        this.mentionRepository = mentionRepository;
    }

    public Mention createMention(MentionRequest mentionRequest) {
        return mentionRepository.save(
                Mention.builder()
                        .name(mentionRequest.getName())
                        .content(mentionRequest.getContent())
                        .build()
        );
    }

    public Mention updateMention(Long id, MentionRequest mentionRequest) {
        Mention foundMention = findMentionById(id);
        foundMention.update(mentionRequest.getName(), mentionRequest.getContent());
        return mentionRepository.save(foundMention);
    }

    private Mention findMentionById(Long id) {
        return mentionRepository.findById(id).orElseThrow(() -> new MentionNotFoundException(id));
    }

    public List<MentionResponse> readAllMentions() {
        List<MentionResponse> mentionResponses = new ArrayList<>();
        mentionRepository.findAllByOrderByCreatedAtDesc()
                .forEach(m -> mentionResponses.add(MentionResponse.of(m)));
        return mentionResponses;
    }

    public MentionResponse readMention(Long id) {
        return MentionResponse.of(findMentionById(id));
    }

    public void deleteMention(Long id) {
        mentionRepository.delete(findMentionById(id));
    }
}
