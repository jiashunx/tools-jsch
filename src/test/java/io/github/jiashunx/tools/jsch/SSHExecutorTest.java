package io.github.jiashunx.tools.jsch;

/**
 * @author jiashunx
 */
public class SSHExecutorTest {

    public static void main(String[] args) {
        SSHRequest request = new SSHRequest("192.168.1.7", "jiashunx", "1234.abcd", "asdf");
        SSHResponse response = SSHExecutor.execCommand(request);
        System.out.println(response);
        request = new SSHRequest("192.168.1.7", "jiashunx", "1234.abcd", "cat /proc/cpuinfo");
        response = SSHExecutor.execCommand(request);
        System.out.println(response);
    }

}
