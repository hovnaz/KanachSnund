package am.kanachsnund.kanachsnund.service;

import am.kanachsnund.kanachsnund.dto.request.FeedbackRequest;

public interface FeedbackService {

    void save(FeedbackRequest feedbackRequest);
}
