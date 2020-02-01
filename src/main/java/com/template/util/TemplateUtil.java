package com.template.util;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class TemplateUtil {

	private static VelocityEngine ve = null;
	
	private static final String MODEL_NAME = "model";
	
	static{
		ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.setProperty(RuntimeConstants.VM_LIBRARY_AUTORELOAD, false);
		ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_CACHE, true);
		ve.setProperty("file.resource.loader.modificationCheckInterval", -1);

		ve.init();
	}
	
	public static String populateTemplate(String templateName, Object model) {
		
		Template t = ve.getTemplate(templateName);

		VelocityContext vc = new VelocityContext();
		vc.put(MODEL_NAME, model);
		StringWriter sw = new StringWriter();
		t.merge(vc, sw);
		return sw.toString();
	}

	public static String populateTemplate(String templateName, VelocityContext vc) {

		Template t = ve.getTemplate(templateName);

		StringWriter sw = new StringWriter();
		t.merge(vc, sw);
		return sw.toString();
	}

}
