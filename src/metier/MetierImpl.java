package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;
    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp * 40;
        return res;
    }

    /*
    * Injecter la variable dao un objet d'une classe
    * qui implémente l'interface IDao
    * */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
