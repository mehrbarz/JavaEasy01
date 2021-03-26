import java.security.Principal;

import org.graalvm.compiler.hotspot.nodes.aot.PluginFactory_ResolveDynamicStubCall;
import org.graalvm.compiler.replacements.nodes.PluginFactory_BitScanReverseNode;

public class HiLo {
    public static void main(String[] args) {
        int randomized = (int) (Math.random() * 100 + 1);
        System.out.println(randomized);
    }

}