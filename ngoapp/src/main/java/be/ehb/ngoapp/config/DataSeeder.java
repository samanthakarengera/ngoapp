package be.ehb.ngoapp.config;

import be.ehb.ngoapp.model.Event;
import be.ehb.ngoapp.repository.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataSeeder implements CommandLineRunner {

    private final EventRepository repo;

    public DataSeeder(EventRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {

        if (repo.count() == 0) {

            Event e1 = new Event();
            e1.setTitel("Buurtfeest Anderlecht Samen");
            e1.setOrganisatie("NGO Anderlecht Solidair");
            e1.setOmschrijving("Gezellig buurtfeest om buren samen te brengen met muziek en eten.");
            e1.setEmailContact("info@ngoanderlecht.be");
            e1.setTijdstip(LocalDateTime.now().minusDays(1));
            repo.save(e1);

            Event e2 = new Event();
            e2.setTitel("Voedselbedeling Winterhulp");
            e2.setOrganisatie("Rode Kruis Partner");
            e2.setOmschrijving("Uitdeling van voedselpakketten voor gezinnen in nood.");
            e2.setEmailContact("hulp@ngoanderlecht.be");
            e2.setTijdstip(LocalDateTime.now().minusDays(2));
            repo.save(e2);

            Event e3 = new Event();
            e3.setTitel("Gratis Kledingmarkt");
            e3.setOrganisatie("NGO Anderlecht Solidair");
            e3.setOmschrijving("Tweedehands en gratis kleding voor gezinnen met laag inkomen.");
            e3.setEmailContact("kleding@ngoanderlecht.be");
            e3.setTijdstip(LocalDateTime.now().minusDays(3));
            repo.save(e3);

            Event e4 = new Event();
            e4.setTitel("Computerles Basisvaardigheden");
            e4.setOrganisatie("Digitaal Inclusie Project");
            e4.setOmschrijving("Leer werken met computer, mail en internet.");
            e4.setEmailContact("digitaal@ngoanderlecht.be");
            e4.setTijdstip(LocalDateTime.now().minusDays(4));
            repo.save(e4);

            Event e5 = new Event();
            e5.setTitel("Job Coaching Sessies");
            e5.setOrganisatie("Werk Anderlecht");
            e5.setOmschrijving("Begeleiding bij sollicitaties en CV-opmaak.");
            e5.setEmailContact("jobs@ngoanderlecht.be");
            e5.setTijdstip(LocalDateTime.now().minusDays(5));
            repo.save(e5);

            Event e6 = new Event();
            e6.setTitel("Gezonde Maaltijden Workshop");
            e6.setOrganisatie("Gezond Leven NGO");
            e6.setOmschrijving("Leren koken met goedkoop en gezond voedsel.");
            e6.setEmailContact("food@ngoanderlecht.be");
            e6.setTijdstip(LocalDateTime.now().minusDays(6));
            repo.save(e6);

            Event e7 = new Event();
            e7.setTitel("Kinderactiviteiten Zaterdag");
            e7.setOrganisatie("Jeugdwerking Anderlecht");
            e7.setOmschrijving("Spelletjes en creatieve workshops voor kinderen.");
            e7.setEmailContact("kids@ngoanderlecht.be");
            e7.setTijdstip(LocalDateTime.now().minusDays(7));
            repo.save(e7);

            Event e8 = new Event();
            e8.setTitel("Sociaal Juridisch Advies");
            e8.setOrganisatie("Rechtshulp NGO");
            e8.setOmschrijving("Gratis advies over huur, werk en administratie.");
            e8.setEmailContact("juridisch@ngoanderlecht.be");
            e8.setTijdstip(LocalDateTime.now().minusDays(8));
            repo.save(e8);

            Event e9 = new Event();
            e9.setTitel("Sport & Ontmoeting Dag");
            e9.setOrganisatie("Sport voor Iedereen");
            e9.setOmschrijving("Sportactiviteiten om mensen samen te brengen.");
            e9.setEmailContact("sport@ngoanderlecht.be");
            e9.setTijdstip(LocalDateTime.now().minusDays(9));
            repo.save(e9);

            Event e10 = new Event();
            e10.setTitel("Energie Bespaar Workshop");
            e10.setOrganisatie("Groene Anderlecht NGO");
            e10.setOmschrijving("Tips om energie te besparen en kosten te verlagen.");
            e10.setEmailContact("energie@ngoanderlecht.be");
            e10.setTijdstip(LocalDateTime.now().minusDays(10));
            repo.save(e10);
        }
    }
}