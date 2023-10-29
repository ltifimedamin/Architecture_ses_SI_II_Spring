package tnesprit.se1.spring1.Controllors;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tnesprit.se1.spring1.Entities.Bloc;
import tnesprit.se1.spring1.Services.BlocService;
import tnesprit.se1.spring1.Services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {
    IBlocService iBlocService;

    @GetMapping("/allbloc")
    public List<Bloc> getBloc() {
        List<Bloc> listBlocs = iBlocService.retrieveAllBlocs();
        return listBlocs;
    }
    @PostMapping("/addBloc")
    public Bloc addEtudiant(@RequestBody Bloc b) {
        Bloc bloc = iBlocService.addBloc(b);
        return bloc;
    }

}
