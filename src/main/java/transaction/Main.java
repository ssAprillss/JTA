package transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import transaction.service.SingerService;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(BasicDataSourceCfg.class)) {
            SingerService service = ctx.getBean(SingerService.class);
            service.findAll().forEach(a -> System.out.println(a));
/*            var singerService = ctx.getBean(SingerService.class);

            LOGGER.info(" ----Retrieving first name using stored procedure:");
            var ben = singerService.findFirstNameByIdUsingProc(2L);
            LOGGER.info("Extracted: {}", ben);

            LOGGER.info(" ---- Listing singers:");
            singerService.findAll().forEach(s -> LOGGER.info(s.toString()));*//*
        }*/
        }
    }
}
