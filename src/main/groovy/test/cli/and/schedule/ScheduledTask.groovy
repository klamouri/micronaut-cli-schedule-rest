package test.cli.and.schedule

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import io.micronaut.scheduling.annotation.Scheduled

/**
 *
 *
 * @author Major OPPO
 */
@Slf4j
@CompileStatic
class ScheduledTask {

    @Scheduled(cron = '* * * * * *')
    void scheduled() {
        log.info('Scheduled task')
    }
}
