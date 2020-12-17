package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.models.RepairModelByAfm;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Component
public class RegistrationRepairValidation implements Validator {

    @Autowired
    private OwnerService ownerService;

    @Override
    public boolean supports(Class<?> aClass) {
        return RepairForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RepairForm repairForm = (RepairForm)  target;

        String inputAFM = repairForm.getAfmOwner();
        Optional<Owner> ownersWithTheGivenAFM = ownerService.findOwnerByAfmOwner(inputAFM);
        if(ownersWithTheGivenAFM.isEmpty()){
            errors.rejectValue("afmOwner", "create.repair.afm.IsNot.Exists");
        }

        LocalDate today = LocalDate.now();
        String inputdate = repairForm.getScheduledDate();
        if(!inputdate.isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //ex: '1939-01-01'
            LocalDate sd = LocalDate.parse(inputdate, formatter);
            if (today.isAfter(sd)) {
                errors.rejectValue("scheduledDate", "create.repair.sceduled.date.isInThePast");
            }
        }




    }
}
