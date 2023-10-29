package tnesprit.se1.spring1.Services;

import tnesprit.se1.spring1.Entities.Universit;

import java.util.List;

public interface IUniverstService {
    List<Universit> retrieveAllUniversits();

    Universit addBloc(Universit u);

    Universit updateBloc(Universit u);

    Universit retrieveBloc(Long idUniversit);

    void removeUniversit(Long idUniversit);

}
