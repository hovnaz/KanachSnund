package am.kanachsnund.kanachsnund.mapper;

import am.kanachsnund.kanachsnund.dto.FeedbackRequest;
import am.kanachsnund.kanachsnund.dto.FeedbackResponse;
import am.kanachsnund.kanachsnund.mapper.base.BaseMapper;
import am.kanachsnund.kanachsnund.model.Feedback;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeedbackMapper implements BaseMapper<Feedback, FeedbackRequest, FeedbackResponse> {

    private final ModelMapper modelMapper;

    @Override
    public Feedback toEntity(FeedbackRequest feedbackRequest) {
        return modelMapper.map(feedbackRequest, Feedback.class);
    }

    @Override
    public FeedbackResponse toResponse(Feedback feedback) {
        return modelMapper.map(feedback, FeedbackResponse.class);
    }
}
