package com.toniomg.songcreatorbackend.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import com.toniomg.songcreatorbackend.model.Song;
import com.toniomg.songcreatorbackend.model.SongRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SongControllerTest {

  @Mock
  SongRepository songRepository;

  @InjectMocks
  SongController songController;

  @Test
  public void shouldReturnAllSongs() {

    Song songA = new Song( "Guns N Roses", "Sweet Child of mine", true);
    Song songB = new Song( "The Eagles", "Hotel California");

    List<Song> songs = Arrays.asList(songA, songB);
    when(songRepository.findAll()).thenReturn(songs);

    assertEquals(songController.getAllSongs(), songs);
  }

  @Test
  public void shouldReturnEmptyList() {

    when(songRepository.findAll()).thenReturn(new ArrayList<>());

    assertEquals(songController.getAllSongs(), new ArrayList<>());
  }

  @Test
  public void shouldAddOneSong() {
    Song songA = new Song( "Guns N Roses", "Sweet Child of mine", true);
    songController.addSong(songA);

    verify(songRepository, times(1)).save(songA);
  }

}
