import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class j_Process {

    public static void main(String[] args) throws InterruptedException {

        ProcessHandle self = ProcessHandle.current();

        long PID = self.pid();
        System.out.println(PID);
        ProcessHandle.Info info = self.info();
        System.out.println(info);

        Optional<String[]> arguments = info.arguments();
        Optional<String> cmd = info.commandLine();
        Optional<Instant> instant = info.startInstant();
        Optional<Duration> duration = info.totalCpuDuration();

        System.out.println(arguments);
        System.out.println(cmd);
        System.out.println(instant);
        System.out.println(duration);

        ProcessHandle.allProcesses()
                .filter(processHandle -> processHandle.info()
                        .command()
                        .orElse("")
                        .contains("POWERPNT"))
                .forEach(processHandle -> {
                    processHandle.pid();
                    System.out.println(processHandle.info());
                    processHandle.destroyForcibly();
                });
    }


}
