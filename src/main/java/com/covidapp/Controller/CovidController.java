package com.covidapp.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.covidapp.Model.CovidModel;
import com.covidapp.Repository.CovidRepository;



@RestController
@RequestMapping("/covid")
@CrossOrigin(origins = "*")
public class CovidController {

	private final CovidRepository _covidRepo;
	
	 @Autowired
	 
	 CovidController( CovidRepository _covidRepo){
		this._covidRepo = _covidRepo;
	}

	// -----------------------------get all Covid summary from DB----------
	 @RequestMapping("/getall")
	 public List<CovidModel> getAllCovid(){
		    List<CovidModel> covidlst = _covidRepo.findAll();
	        if(covidlst == null) {
	            return new ArrayList<CovidModel>();
	        } else {
	            return covidlst;
	        }
	 }
	// -----------------------------get Covid summary by ID from DB----------
	 @RequestMapping("/getbyid")
	 public Optional<CovidModel> getCovidById(@RequestParam Integer id){
		    Optional<CovidModel> _objCovid = _covidRepo.findById(id);
	        if(_objCovid == null) {
	            return null;
	        } else {
	            return _objCovid;
	        }
	 }
	// -----------------------------Add Covid summary to DB----------
	 @PostMapping("/add")
	 CovidModel addCovid(@RequestBody CovidModel _objCovid) {
			return _covidRepo.save(_objCovid);
		}

	// -----------------------------Update Covid summary in DB----------
		@PutMapping("/update")
		public CovidModel updateCovid(@RequestBody CovidModel _objCovid,@RequestParam Integer id) {
			Optional<CovidModel> _existingcovid = _covidRepo.findById(id);

			if (_existingcovid!=null) {
				_objCovid.setId(id);
				return _covidRepo.save(_objCovid);
				
			}
			else {
			return null;
			}
		}
}
