package ingjulianvega.ximic.msscasubodycheck.listener;


import ingjulianvega.ximic.events.UpdateBodyCheckEvent;
import ingjulianvega.ximic.msscasubodycheck.configuration.JmsConfig;
import ingjulianvega.ximic.msscasubodycheck.services.BodyCheckService;
import ingjulianvega.ximic.msscasubodycheck.web.Mappers.BodyCheckMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UpdateBodyCheckListener {

    private final BodyCheckService bodyCheckService;
    private final BodyCheckMapper bodyCheckMapper;

    @JmsListener(destination = JmsConfig.UPDATE_BODY_CHECK_QUEUE)
    public void listen(UpdateBodyCheckEvent updateBodyCheckEvent){
        log.debug("Got UpdateBodyCheckEvent " + updateBodyCheckEvent.toString());
        bodyCheckService.create(bodyCheckMapper.updateBodyCheckEventToBodyCheck(updateBodyCheckEvent));
    }
}
