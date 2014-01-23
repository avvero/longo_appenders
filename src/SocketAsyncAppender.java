import org.apache.log4j.AsyncAppender;
import org.apache.log4j.net.SocketAppender;
import org.apache.log4j.net.ZeroConfSupport;

public class SocketAsyncAppender extends AsyncAppender {

    private SocketAppender socketAppender;

    public SocketAsyncAppender() {
        socketAppender = new SocketAppender();
        addAppender(socketAppender);
    }

    int port;
    String remoteHost;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
        socketAppender.setPort(port);
    }

    public String getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
        socketAppender.setRemoteHost(remoteHost);
    }

    /**
     Connect to the specified <b>RemoteHost</b> and <b>Port</b>.
     */
    public void activateOptions() {
        socketAppender.activateOptions();
    }

}
