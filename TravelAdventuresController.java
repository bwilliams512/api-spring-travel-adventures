package com.example.travelAdventuresProject.controllers;

import com.codecademy.plants.entities.Adventure;
import com.codecademy.plants.repositories.AdventureRepository;


@RestController
@RequestMapping("/traveladventures")
public class TravelAdventuresController {

  private final AdventureRepository adventureRepository;

  public TravelAdventuresController(AdventureRepository adventureRepo) {
    this.adventureRepository = adventureRepo;
  }

  // Add controller methods below:
  // Step 3
  @GetMapping()
  public Iterable<Adventure> adventures() {        
    return this.adventureRepository.findAll();
  }

  // Step 4
  @GetMapping("/traveladventures/bycountry/Greece")
  public Adventure getByCountry(@PathVariable String country) {
    return this.adventureRepository.findByCountry(country);
  }

  // Step 5
  @GetMapping("/traveladventures/bystate?state=Lisboa")
public Adventure getByState(@RequestParam String state) {
  return adventureRepository.findByState(state);
}

  // Step 6
  @PostMapping("/traveladventures")
  public Adventure addAdventure(@RequestBody Adventure adventure) {
    return adventureRepository.add(adventure);
  }

  // Step 7
  @PutMapping("/traveladventures/10")
  public Adventures editAdventures(@RequestBody Adventure adventure) {
    return adventureRepository.find(id);
  }
    
    // We could assign an Optional object with a specific type of Adventure IF we need to check if a particular adventure exists
  @GetMapping()
  public Optional<Adventure> adventureOptional() {
    return this.adventureRepository.findById(10);
      if (!adventureOptional.isPresent()) {
        throw exception
        ResponseStatusException(HttpStatus.   NOT_FOUND, "The ID entered does not exist.");
      }
      // If the ID entered does exist, toggle   the 'blogCompleted' property to eith true or false and return the updated adventure object
 
      Adventure adventures = adventureOptional.get();

  }

  // Step 8
  @DeleteMapping("/traveladventures/10")
  public Adventures deleteAdventures(@PathVariable String id) {
    adventureRepository.delete(id);
  }

}
