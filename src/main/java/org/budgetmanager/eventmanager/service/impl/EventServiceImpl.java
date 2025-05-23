//
//import lombok.RequiredArgsConstructor;
//
//import org.budgetmanager.eventmanager.dto.request.;
//import org.budgetmanager.eventmanager.dto.response.EventResponse;
//import org.budgetmanager.eventmanager.entity.Event;
//import org.budgetmanager.eventmanager.repository.EventRepository;
//import org.budgetmanager.eventmanager.service.EventService;
//import org.modelmapper.ModelMapper;
//import org.springframework.data.crossstore.ChangeSetPersister;
//import org.springframework.stereotype.Service;
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class EventServiceImpl implements EventService {
//
//    private final EventRepository eventRepository;
//    private final ModelMapper modelMapper;
//
//    @Override
//    public EventResponse createEvent(CreateEventRequest request) {
//        Event event = modelMapper.map(request, Event.class);
//        Event savedEvent = eventRepository.save(event);
//        return convertToResponse(savedEvent);
//    }
//
//    @Override
//    public List<EventResponse> getAllEvents() {
//        return eventRepository.findAll()
//                .stream()
//                .map(this::convertToResponse)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public EventResponse getEventById(Long id) {
//        Event event = eventRepository.findById(id)
//                .orElseThrow(() -> new ChangeSetPersister.NotFoundException("Événement non trouvé"));
//        return convertToResponse(event);
//    }
//
//    @Override
//    public List<EventResponse> searchEvents(String title, String category,
//                                            LocalDateTime startDate, LocalDateTime endDate) {
//        List<Event> events = eventRepository.searchEvents(title, category, startDate, endDate);
//        return events.stream()
//                .map(this::convertToResponse)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public void deleteEvent(Long id) {
//        if (!eventRepository.existsById(id)) {
//            throw new ChangeSetPersister.NotFoundException("Événement non trouvé");
//        }
//        eventRepository.deleteById(id);
//    }
//
//    private EventResponse convertToResponse(Event event) {
//        EventResponse response = modelMapper.map(event, EventResponse.class);
//        response.setAvailable(event.isAvailable());
//        return response;
//    }
//}