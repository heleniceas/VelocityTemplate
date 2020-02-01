package com.template;

import com.google.gson.Gson;
import com.template.model.*;
import com.template.util.TemplateUtil;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.math.BigDecimal;
import java.util.*;


public class Main {

	public static void main(String args[]) throws Exception {
		VelocityEngine ve = new VelocityEngine();
		ve.init();



		VelocityContext vc = new VelocityContext();
		Staff staff = new Staff();
		staff.setAge(18);
		staff.setName("Helenice");
		staff.setPosition(new String[]{"Founder", "CTO", "Writer"});
		staff.setSkills(preencherSkills());
		staff.setSalary(fillSalary());

		vc.put("staff", staff);

		String strTemplate = TemplateUtil.populateTemplate("staff.vm", staff);
		System.out.println(strTemplate);
		Gson gson = new Gson();
		String json = gson.toJson(staff);
		System.out.println(json);

	}


	public static List<Skill> preencherSkills(){
		Skill skill1 = new Skill();
		skill1.setId(1).setName("Java");
		Map mapa = new HashMap();
		mapa.put("1","Um");
		mapa.put("2","Dois");
		skill1.setMap(mapa);

       String [] as = new String[]{"Founder", "CTO", "Writer"};
		skill1.setList(Arrays.asList(as));
		Skill skill2 = new Skill();
		skill2.setId(2).setName("Python");
		Skill skill3 = new Skill();
		skill3.setId(3).setName("Node");
		List<Skill> list = new ArrayList<Skill>();
		list.add(skill1);
		list.add(skill2);
		list.add(skill3);
		return list;
	}

	public static Map<String, BigDecimal> fillSalary (){
		Map<String, BigDecimal> salary = new HashMap() {{
			put("2010", new BigDecimal(10000));
			put("2012", new BigDecimal(12000));
			put("2018", new BigDecimal(14000));
		}};
		return salary;
	}

}