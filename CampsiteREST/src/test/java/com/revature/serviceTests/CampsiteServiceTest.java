package com.revature.serviceTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.revature.entities.Campsite;
import com.revature.repository.CampsiteRepository;
import com.revature.services.CampsiteService;

@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)

public class CampsiteServiceTest {

	@BeforeAll
	public void setup() {
		MockitoAnnotations.openMocks(this);
		this.campsiteService = new CampsiteService();

	}

	@Mock
	private CampsiteRepository campsiteRepository;

	@InjectMocks
	private CampsiteService campsiteService;

	@Test
	public void getCampsiteTest() {

		Campsite campsite = new Campsite();
		campsite.setName("Test");
		when(this.campsiteRepository.save(ArgumentMatchers.any(Campsite.class))).thenReturn(campsite);
		Campsite created = campsiteService.save(campsite);
		assertThat(created.getName()).isSameAs(campsite.getName());
		verify(campsiteRepository).save(campsite);
	}

	@Test
	public void getAllCampsitesTest() {
		List<Campsite> campsites = new ArrayList<Campsite>();
		campsites.add(new Campsite(1, "Test", "test location"));
		when(campsiteRepository.findAll()).thenReturn(campsites);
		List<Campsite> expected = campsiteService.getCampsites();
		assertEquals(expected, campsites);
		verify(campsiteRepository).findAll();
	}

	@Test

	public void deleteCampsiteTest() {

		Campsite campsite = new Campsite();

		campsite.setName("test name");

		campsite.setId(1);


		campsiteService.delete(campsite.getId());

		verify(campsiteRepository).deleteById(campsite.getId());

	}

}
