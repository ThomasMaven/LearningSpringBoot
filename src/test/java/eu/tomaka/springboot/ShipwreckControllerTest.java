package eu.tomaka.springboot;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import eu.tomaka.springboot.controller.ShipwreckController;
import eu.tomaka.springboot.model.Shipwreck;
import eu.tomaka.springboot.repo.ShipwreckRepository;

public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController sc;

	@Mock
	private ShipwreckRepository shipwreckRepository;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testShipwreckGet() {
		Shipwreck sw = new Shipwreck();
		sw.setId(1L);
		when(shipwreckRepository.findOne(1L)).thenReturn(sw);

		Shipwreck wreck = sc.get(1L);

		verify(shipwreckRepository).findOne(1L);

		assertEquals(1L, wreck.getId().longValue());
	}

	@Test
	public void testShipwreckPost() {
		Shipwreck sw = new Shipwreck();
		when(shipwreckRepository.saveAndFlush(sw)).thenReturn(sw);

		Shipwreck wreck = sc.create(sw);

		assertEquals(wreck, sw);

	}
}
