package am.kanachsnund.kanachsnund.mapper;

import am.kanachsnund.kanachsnund.dto.request.ContactRequest;
import am.kanachsnund.kanachsnund.dto.response.ContactResponse;
import am.kanachsnund.kanachsnund.entity.Contact;
import am.kanachsnund.kanachsnund.mapper.base.BaseMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactMapper implements BaseMapper<Contact, ContactRequest, ContactResponse> {

    private final ModelMapper modelMapper;

    @Override
    public Contact toEntity(ContactRequest contactRequest) {
        return modelMapper.map(contactRequest, Contact.class);
    }

    @Override
    public ContactResponse toResponse(Contact contact) {
        return modelMapper.map(contact, ContactResponse.class);
    }
}
