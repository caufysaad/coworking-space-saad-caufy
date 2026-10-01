package ma.caufysaad.coworking.service;

import ma.caufysaad.coworking.repository.AmenityReservationRepository;
import ma.caufysaad.coworking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private AmenityReservationRepository amenityReservationRepository;

    public Map<String, Long> getBookingStats() {
        List<Object[]> stats = bookingRepository.countBookingsByWorkspace();
        Map<String, Long> result = new HashMap<>();
        for (Object[] row : stats) {
            result.put((String) row[0], (Long) row[1]);
        }
        return result;
    }

    public Map<String, Long> getAmenityStats() {
        List<Object[]> stats = amenityReservationRepository.findAmenityUsageStats();
        Map<String, Long> result = new HashMap<>();
        for (Object[] row : stats) {
            result.put((String) row[0], (Long) row[1]);
        }
        return result;
    }

    public Map<String, Double> getUtilization() {
        Double utilization = bookingRepository.getOverallDeskUtilization();
        Map<String, Double> result = new HashMap<>();
        result.put("overallDeskUtilization", utilization != null ? utilization : 0.0);
        return result;
    }
}
