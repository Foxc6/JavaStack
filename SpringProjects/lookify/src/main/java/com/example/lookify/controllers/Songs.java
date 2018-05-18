package com.example.lookify.controllers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lookify.models.Song;
import com.example.lookify.services.SongService;
@Controller
public class Songs {
	private final SongService songService;
	
	public Songs(SongService songService) {
		this.songService = songService;
	}
	
	// Home Route
    @RequestMapping("/")
    public String home() {
        return "home";
    }
    
    // Show One Route
    @RequestMapping("/songs/{id}")
    public String findSongById(Model model, @PathVariable("id") Long id) {
        Song song = songService.findSongById(id);
        model.addAttribute("song", song);
        return "showSong";
    }
    
    // GET ROUTE Add New
    @RequestMapping("/songs/new")
    public String newSong(@ModelAttribute("song") Song song) {
        return "newSong";
    }
    
    // POST ROUTE Add New
    @PostMapping("/songs/new")
    public String createSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
        if (result.hasErrors()) {
            return "newSong";
        }else{
        		songService.addSong(song);
            return "redirect:/songs";
        }
    }
    
    // GET ROUTE Edit Existing
    @RequestMapping("/songs/edit/{id}")
    public String editSong(@PathVariable("id") Long id, Model model) {
        Song song = songService.findSongById(id);
        if (song != null){
            model.addAttribute("song", song);
            return "editSong";
        }else{
            return "redirect:/songs";
        }
    }
    
    // POST ROUTE Edit Existing
    @PostMapping("/songs/edit/{id}")
    public String updateSong(@Valid @ModelAttribute("song") Song song, BindingResult result, @PathVariable("id") Long id) {
        if (result.hasErrors()) {
            return "editSong";
        }else{
            songService.updateSong(song);
            return "redirect:/songs";
        }
    }
    
    // Delete Route
    @RequestMapping(value="/songs/delete/{id}")
    public String destroySong(@PathVariable("id") Long id) {
        songService.destroySong(id);
        return "redirect:/songs";
    }
    
 // Index Route
    @RequestMapping("/songs")
    public String songs(Model model) {
        List<Song> songs = songService.allSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }
    
    // Top 10 Songs Get Route
    @RequestMapping(value="/songs/topTen")
    public String allSongs(Model model, @ModelAttribute("song") Song song) {
        List<Song> songs = songService.allSongs();
        Collections.sort(songs, Comparator.comparingInt(Song::getRating).reversed());
        model.addAttribute("songs", songs);
        return "topTenSongs";
    }
    
 // Show Songs by Artist Route
    @RequestMapping(value="/search")
	public String findSongsByArtist(@RequestParam(value="query", required=false) String query, Model model) {
		System.out.println("query: " + query);
		List<Song> songs = songService.findSongsByArtist(query);
		if(songs.size() > 0) {
			System.out.println("Controller: Found Songs!");
			model.addAttribute("songs", songs);
		}else {
			String failedSearch = "No artists match your search!";
			model.addAttribute("failedSearch", failedSearch);
		}
		return "artistSongs";
		
	}
}

