package io.github.jiashunx.tools.jsch;

/**
 * @author jiashunx
 */
public class SSHExecutorTest {

    public static void main(String[] args) {
        SSHRequest request = new SSHRequest("127.0.0.1", "root", "root", "asdf");
        SSHResponse response = SSHExecutor.execCommand(request);
        System.out.println(response);
    }

}
