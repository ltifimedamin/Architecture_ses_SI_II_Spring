package tnesprit.se1.spring1.Controllors;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tnesprit.se1.spring1.Services.IUniverstService;

@RestController
@AllArgsConstructor
@RequestMapping("/universit")
public class UniversitController {
    IUniverstService iUniverstService;
}
