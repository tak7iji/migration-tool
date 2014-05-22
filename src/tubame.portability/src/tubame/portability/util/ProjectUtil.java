package tubame.portability.util;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectUtil {
    private static final Logger LOGGER = LoggerFactory
            .getLogger(ProjectUtil.class);

    public static String getCurrentProjectPath() {
        IProject proj = null;
        proj = PluginUtil.getSelectedProject();
        if (proj == null) {
            IResource resource = getActiveResouce();
            proj = resource.getProject();
        } 
        return proj.getLocation().toString() + File.separator;
    }
    private static IResource getActiveResouce() {
        IWorkbench iworkbench = PlatformUI.getWorkbench();
        if (iworkbench == null) return null;
        IWorkbenchWindow iworkbenchwindow = iworkbench.getActiveWorkbenchWindow();
        if (iworkbenchwindow == null) return null;
        IWorkbenchPage iworkbenchpage = iworkbenchwindow.getActivePage();
        if (iworkbenchpage == null) return null;
        IEditorPart ieditorpart = iworkbenchpage.getActiveEditor();
        if (ieditorpart == null) {
            return null;
        }
        return extractResource(ieditorpart);
    }

    private static IResource extractResource(IEditorPart editor) {
        IEditorInput input = editor.getEditorInput();
        if (!(input instanceof IFileEditorInput)) {
            return null;
        }
        return ((IFileEditorInput)input).getFile();
    }
}
