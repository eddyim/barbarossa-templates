package bb;

import bb.runtime.DefaultLayout;
import bb.runtime.ILayout;

import java.util.HashMap;

/**
 * Created by eim on 7/17/2017.
 * For configuration purposes
 */
public class BBTemplates {
    private static HashMap<String, ILayout> defaultTemplates;
    static {
        defaultTemplates = new HashMap<>();
        defaultTemplates.put("", new DefaultLayout());
    }

    public static void setDefaultTemplate(ILayout layout) {
        defaultTemplates.put("", layout);
    }

    public static void setDefaultTemplate(String somePackage, ILayout layout) {
        defaultTemplates.put(somePackage, layout);
    }

    public static ILayout getDefaultTemplate(String packageName) {
        if (defaultTemplates.containsKey(packageName)) {
            return defaultTemplates.get(packageName);
        } else if (packageName.indexOf('.') > 0) {
            return getDefaultTemplate(packageName.substring(0, packageName.lastIndexOf('.')));
        } else {
            return defaultTemplates.get("");
        }
    }

}