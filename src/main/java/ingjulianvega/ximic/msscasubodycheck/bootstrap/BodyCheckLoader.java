package ingjulianvega.ximic.msscasubodycheck.bootstrap;

import ingjulianvega.ximic.msscasubodycheck.domain.BodyCheckEntity;
import ingjulianvega.ximic.msscasubodycheck.domain.repositories.BodyCheckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class BodyCheckLoader implements CommandLineRunner {

    private final BodyCheckRepository bodyCheckRepository;

    @Override
    public void run(String... args) throws Exception {
        if (bodyCheckRepository.count() == 0) {
            loadBodyCheckObjects();
        }
    }

    private void loadBodyCheckObjects() {
        bodyCheckRepository.saveAll(Arrays.asList(
                BodyCheckEntity.builder()
                        .visitId(UUID.randomUUID())
                        .bodyPartId(UUID.randomUUID())
                        .observations("observación 1").build(),
                BodyCheckEntity.builder()
                        .visitId(UUID.randomUUID())
                        .bodyPartId(UUID.randomUUID())
                        .observations("observación 2").build(),
                BodyCheckEntity.builder()
                        .visitId(UUID.randomUUID())
                        .bodyPartId(UUID.randomUUID())
                        .observations("observación 3").build(),
                BodyCheckEntity.builder()
                        .visitId(UUID.randomUUID())
                        .bodyPartId(UUID.randomUUID())
                        .observations("observación 4").build(),
                BodyCheckEntity.builder()
                        .visitId(UUID.randomUUID())
                        .bodyPartId(UUID.randomUUID())
                        .observations("observación 5").build(),
                BodyCheckEntity.builder()
                        .visitId(UUID.randomUUID())
                        .bodyPartId(UUID.randomUUID())
                        .observations("observación 6").build()

        ));
    }
}