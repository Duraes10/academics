package pt.ipleiria.estg.dei.ei.dae.academics.ejbs;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

@Startup
@Singleton
public class ConfigBean {
    @EJB
    private StudentBean studentBean;

    @PostConstruct
    public void populateDB()
    {
        System.out.println("Hello Java EE!");
        studentBean.create("marco123", "galinhas", "Marco", "marco.galo@ganco.pt");
    }

}
