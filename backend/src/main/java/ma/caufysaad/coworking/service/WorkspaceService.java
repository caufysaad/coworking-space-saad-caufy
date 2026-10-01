package ma.caufysaad.coworking.service;

import ma.caufysaad.coworking.model.Workspace;
import ma.caufysaad.coworking.model.WorkspaceStatus;
import ma.caufysaad.coworking.repository.WorkspaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkspaceService {

    @Autowired
    private WorkspaceRepository workspaceRepository;

    public Workspace createWorkspace(Workspace workspace) {
        workspace.setStatus(WorkspaceStatus.ACTIVE);
        if (workspace.getAvailableDesks() == null) {
            workspace.setAvailableDesks(workspace.getTotalDesks());
        }
        return workspaceRepository.save(workspace);
    }

    public List<Workspace> getAllWorkspaces() {
        return workspaceRepository.findAll();
    }

    public Optional<Workspace> getWorkspaceById(Long id) {
        return workspaceRepository.findById(id);
    }

    public List<Workspace> getAvailableWorkspaces() {
        return workspaceRepository.findByStatus(WorkspaceStatus.ACTIVE);
    }
}
