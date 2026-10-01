package ma.caufysaad.coworking.controller;

import ma.caufysaad.coworking.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/reports")
@PreAuthorize("hasRole('ADMIN')")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/booking-stats")
    public ResponseEntity<Map<String, Long>> getBookingStats() {
        return ResponseEntity.ok(reportService.getBookingStats());
    }

    @GetMapping("/amenity-stats")
    public ResponseEntity<Map<String, Long>> getAmenityStats() {
        return ResponseEntity.ok(reportService.getAmenityStats());
    }

    @GetMapping("/utilization")
    public ResponseEntity<Map<String, Double>> getUtilization() {
        return ResponseEntity.ok(reportService.getUtilization());
    }
}
