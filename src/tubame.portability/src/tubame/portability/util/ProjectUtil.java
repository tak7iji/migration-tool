package tubame.portability.util;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tubame.portability.logic.reader.CheckListInformationXml;

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
        if (proj != null) {
        	LOGGER.info("Project: "+proj);
        }
        return proj.getLocation().toString() + File.separator;
    }
    private static IResource getActiveResouce() {
        IWorkbench iworkbench = PlatformUI.getWorkbench();
        if (iworkbench == null) return null;
        LOGGER.debug("Workbench: "+iworkbench);
        IWorkbenchWindow iworkbenchwindow = iworkbench.getActiveWorkbenchWindow();
        if (iworkbenchwindow == null) return null;
        LOGGER.debug("WorkbenchWindow: "+iworkbenchwindow);
        IWorkbenchPage iworkbenchpage = iworkbenchwindow.getActivePage();
        if (iworkbenchpage == null) return null;
        LOGGER.debug("WorkbenchPage: "+iworkbenchpage);
        IEditorPart ieditorpart = iworkbenchpage.getActiveEditor();
        LOGGER.debug("EditorPart: "+ieditorpart);
        if (ieditorpart == null) {
            ISelection iselection = iworkbenchwindow.getSelectionService().getSelection();
            LOGGER.info("ISelection: "+iselection);
            return null;
        }
        return extractResource(ieditorpart);
    }

    private static IResource extractSelection(ISelection sel) {
        if (!(sel instanceof IStructuredSelection))
           return null;
        IStructuredSelection ss = (IStructuredSelection) sel;
        Object element = ss.getFirstElement();
        if (element instanceof IResource)
           return (IResource) element;
        if (!(element instanceof IAdaptable))
           return null;
        IAdaptable adaptable = (IAdaptable)element;
        Object adapter = adaptable.getAdapter(IResource.class);
        return (IResource) adapter;
     }

    private static IResource extractResource(IEditorPart editor) {
        IEditorInput input = editor.getEditorInput();
        if (!(input instanceof IFileEditorInput)) {
            LOGGER.debug(input.toString());
            return null;
        }
        return ((IFileEditorInput)input).getFile();
    }
}
