package hr.fer.seminar.parkingsystemapi.controller;

import hr.fer.seminar.parkingsystemapi.model.Entrance;
import hr.fer.seminar.parkingsystemapi.service.EntranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EntranceController {
	private final EntranceService entranceService;

	public EntranceController(final EntranceService entranceService) {
		this.entranceService = entranceService;
	}

	@GetMapping(value = "/entrances")
	public List<Entrance> getAllEntrances() {
		return entranceService.getAllEntrances();
	}

	@PostMapping(value = "/entrance")
	public Entrance createEntrance(final @RequestBody Entrance entrance) {
		return entranceService.addEntrance(entrance);
	}

	@PutMapping(value = "/entrance")
	public Entrance updateEntrance(final @RequestBody Entrance entrance) {
		return entranceService.updateEntrance(entrance);
	}

	@DeleteMapping(value = "/entrance/{id}")
	public void deleteEntrance(final @PathVariable("id") Long id) {
		entranceService.deleteEntrance(id);
	}
}
