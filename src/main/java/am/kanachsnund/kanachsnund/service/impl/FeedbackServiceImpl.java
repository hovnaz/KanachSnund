package am.kanachsnund.kanachsnund.service.impl;

import am.kanachsnund.kanachsnund.dto.FeedbackRequest;
import am.kanachsnund.kanachsnund.mapper.FeedbackMapper;
import am.kanachsnund.kanachsnund.model.Feedback;
import am.kanachsnund.kanachsnund.repository.CommentRepository;
import am.kanachsnund.kanachsnund.service.FeedbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {

    private final CommentRepository commentRepository;
    private final FeedbackMapper feedbackMapper;

    @Override
    public void save(FeedbackRequest feedbackRequest) {
        Feedback feedback = feedbackMapper.toEntity(feedbackRequest);
        commentRepository.save(feedback);
    }
}
