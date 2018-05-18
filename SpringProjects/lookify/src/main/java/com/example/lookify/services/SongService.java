package com.example.lookify.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lookify.models.Song;
import com.example.lookify.repositories.SongRepository;

@Service
public class SongService {
    private SongRepository songRepository;
    public SongService(SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public List<Song> allSongs(){
        return songRepository.findAll();
    }

    
    public Song findSongById(Long id) {
        return songRepository.findOne(id);
    }
    
    public List<Song> findSongsByArtist(String artist) {
        return songRepository.findByArtistContaining(artist);
    }
    
    public void addSong(Song song){
        songRepository.save(song);
    }
    
    public void updateSong(Song song) {
    		songRepository.save(song);
    }
    
    public void destroySong(Long id) {
        songRepository.delete(id);
    }
}

