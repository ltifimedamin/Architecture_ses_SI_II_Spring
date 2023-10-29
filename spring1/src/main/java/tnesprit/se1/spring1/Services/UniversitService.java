package tnesprit.se1.spring1.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tnesprit.se1.spring1.Entities.Universit;
import tnesprit.se1.spring1.Repository.UniversitRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UniversitService implements IUniverstService{
    UniversitRepository universitRepository;
    @Override
    public List<Universit> retrieveAllUniversits() {
        return universitRepository.findAll();
    }

    @Override
    public Universit addBloc(Universit u) {
        return universitRepository.save(u);
    }

    @Override
    public Universit updateBloc(Universit u) {
        return universitRepository.save(u);
    }

    @Override
    public Universit retrieveBloc(Long idUniversit) {
        return universitRepository.findById(idUniversit).get();
    }

    @Override
    public void removeUniversit(Long idUniversit) {
    universitRepository.deleteById(idUniversit);
    }
}
