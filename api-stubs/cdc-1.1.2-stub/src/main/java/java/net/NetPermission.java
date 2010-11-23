package java.net;

import java.security.BasicPermission;

public final class NetPermission extends BasicPermission {
    public NetPermission(String name) {super(null);}
    public NetPermission(String name, String actions) {super(null);}

}
