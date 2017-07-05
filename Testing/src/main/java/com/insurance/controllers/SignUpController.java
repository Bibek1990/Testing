package com.insurance.controllers;

import java.io.IOException;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.insurance.entity.UserProfile;
import com.insurance.entity.Vehicle;
import com.insurance.repositories.UserProfileRepository;


@Controller
public class SignUpController {

	@Autowired
	UserProfileRepository userProfileRepository;
	
	@RequestMapping("/signUp")
	public String signUp(HttpServletRequest request, HttpServletResponse response) throws IOException{
		return "signUp";
	}
	
	@RequestMapping(value= "/signUp", method = RequestMethod.POST)
	public ModelAndView signUpuserProfile(HttpServletRequest request){
		
		UserProfile userProfile = new UserProfile();
		userProfile.setName(request.getParameter("name"));
		userProfile.setEmail(request.getParameter("email"));
		userProfile.setGender(request.getParameter("gender"));
		userProfile.setSsn(request.getParameter("ssn"));
		userProfile.setDrivingLicenseNo(request.getParameter("drivingLicenseNo"));
		userProfile.setAddress(request.getParameter("address"));
		userProfile.setCity(request.getParameter("city"));
		userProfile.setState(request.getParameter("state"));
		
		userProfile = userProfileRepository.save(userProfile);
		System.out.println("Id : " + userProfile.getId());
		ModelAndView mv = new ModelAndView("confirmation");
		mv.addObject("profile",userProfile);
		return mv;
		
		
	}
	@RequestMapping("/addVehicle")
	public String addVehicle(HttpServletRequest request, HttpServletResponse response) throws IOException{
		return "addVehicle";
	}
	@RequestMapping(value= "/addVehicle", method = RequestMethod.POST)
	public ModelAndView addVehicle(HttpServletRequest request){
		System.out.println("profile Id = " + request.getParameter("profileId"));
		String vin = request.getParameter("vin");
		String licensePlateNo =request.getParameter("licensePlateNo");
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String year = request.getParameter("year");
		Integer userProfileId = Integer.parseInt(request.getParameter("profileId"));
		
		Vehicle v = new Vehicle();
		v.setVin(vin);
		v.setLicensePlateNo(licensePlateNo);
		v.setMake(make);
		v.setModel(model);
		v.setYear(year);
		
		UserProfile u = userProfileRepository.getById (userProfileId);
		Set<Vehicle> Vehicles = u.getVehicle();
		Vehicles.add(v);
		
		u.setVehicle(Vehicles);
		userProfileRepository.update(u);
		ModelAndView mv = new ModelAndView("addVehicle");
		mv.addObject("vehicle",Vehicles);
		return mv;
		
	}
	
	}
	
	
