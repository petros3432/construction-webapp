package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;

import java.util.List;

public interface RepairService {

    List<RepairModel> firstTenRepairs();
}
