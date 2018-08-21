package test.cli.and.schedule

import io.micronaut.configuration.picocli.PicocliRunner
import picocli.CommandLine.Command
import picocli.CommandLine.Option

@Command(name = "my-cli-app", description = "...", mixinStandardHelpOptions = true)
class MyCliAppCommand implements Runnable {

    @Option(names = ["-v", "--verbose"], description = "...")
    boolean verbose

    static void main(String[] args) throws Exception {
        PicocliRunner.run(MyCliAppCommand.class, args)
    }

    void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!")
        }
    }
}