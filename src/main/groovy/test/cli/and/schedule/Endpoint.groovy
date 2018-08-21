package test.cli.and.schedule

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 *
 *
 * @author Major OPPO
 */
@Controller('/')
class Endpoint {

    @Get('/')
    HttpStatus ok() {
        return HttpStatus.OK
    }
}
