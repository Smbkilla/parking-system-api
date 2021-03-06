package hr.fer.seminar.parkingsystemapi.service;

import hr.fer.seminar.parkingsystemapi.model.Floor;

import java.util.List;

public interface FloorService {
	public List<Floor> getAllFloors();

	public Floor getFloor(final Long id);

	public List<Floor> getFloorsOrderedByLevel(final Integer level);

	public Floor findFloorByLevel(final Integer level);

	public Floor addFloor(final Floor Floor);

	public void deleteFloor(final Long id);

	public Floor updateFloor(final Floor Floor);
}
