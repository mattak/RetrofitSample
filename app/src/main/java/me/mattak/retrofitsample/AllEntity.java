package me.mattak.retrofitsample;

/**
 * AllEntity
 * Created by maruyama on 15/11/26.
 */
public class AllEntity {
    String connection;
    String ip_addr;
    String lang;
    String remote_host;
    String user_agent;
    String charset;
    String port;
    String via;
    String forwarded;
    String mime;
    String keep_alive;
    String encoding;

    public String toString() {
        return new StringBuilder()
                .append("connection:").append(connection).append("\n")
                .append("ip_addr:").append(ip_addr).append("\n")
                .append("lang:").append(lang).append("\n")
                .append("remote_host:").append(remote_host).append("\n")
                .append("user_agent:").append(user_agent).append("\n")
                .append("charset:").append(charset).append("\n")
                .append("port:").append(port).append("\n")
                .append("via:").append(via).append("\n")
                .append("forwarded:").append(forwarded).append("\n")
                .append("mime:").append(mime).append("\n")
                .append("keep_alive:").append(keep_alive).append("\n")
                .append("encoding:").append(encoding).append("\n")
                .toString();
    }
}