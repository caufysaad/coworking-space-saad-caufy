package ma.caufysaad.coworking.repository;

import ma.caufysaad.coworking.model.Desk;
import ma.caufysaad.coworking.model.DeskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeskRepository extends JpaRepository<Desk, Long> {
    List<Desk> findByWorkspaceId(Long workspaceId);
    List<Desk> findByWorkspaceIdAndAvailabilityStatus(Long workspaceId, DeskStatus status);
}
