package noticeme.mentions.api;


import noticeme.mentions.api.dto.MentionRequest;
import noticeme.mentions.api.dto.MentionResponse;
import noticeme.mentions.service.MentionService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class MentionController {
    private final MentionService mentionService;


    public MentionController(MentionService mentionService) {
        this.mentionService = mentionService;
    }

    @PostMapping
    public Long create(@RequestBody @Valid MentionRequest mentionRequest) {
        return mentionService.createMention(mentionRequest).getId();
    }

    @GetMapping
    public List<MentionResponse> readAllMentions() {
        return mentionService.readAllMentions();
    }

    @GetMapping("/{id}")
    public MentionResponse read(@PathVariable Long id) {
        return mentionService.readMention(id);
    }

    @PutMapping("/{id}")
    public Long update(
            @PathVariable Long id,
            @RequestBody @Valid MentionRequest mentionRequest
    ) {
        return mentionService.updateMention(id, mentionRequest).getId();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        mentionService.deleteMention(id);
    }
}
