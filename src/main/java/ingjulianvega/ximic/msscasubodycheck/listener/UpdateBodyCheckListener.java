package ingjulianvega.ximic.msscasubodycheck.listener;


import ingjulianvega.ximic.events.UpdateBodyCheckEvent;
import ingjulianvega.ximic.msscasubodycheck.configuration.JmsConfig;
import ingjulianvega.ximic.msscasubodycheck.services.BodyCheckService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UpdateBodyCheckListener {

    private final BodyCheckService bodyCheckService;

    @JmsListener(destination = JmsConfig.UPDATE_BODY_CHECK_QUEUE)
    public void listen(UpdateBodyCheckEvent event){
        log.debug("Got BodyCheck " + event.toString());
        //visitService.create(event.getVisit());
    }
}
