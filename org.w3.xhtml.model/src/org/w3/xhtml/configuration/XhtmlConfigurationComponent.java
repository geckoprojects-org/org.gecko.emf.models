/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.w3.xhtml.configuration;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource.Factory;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.osgi.annotation.bundle.Capability;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import org.osgi.service.condition.Condition;

import org.w3.xhtml.XhtmlFactory;
import org.w3.xhtml.XhtmlPackage;

import org.w3.xhtml.impl.XhtmlPackageImpl;

import org.w3.xhtml.util.XhtmlResourceFactoryImpl;
/**
 * The <b>PackageConfiguration</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * 
 * @generated
 */
@Component(name = "XhtmlConfigurator")
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.w3.xhtml.util.XhtmlResourceFactoryImpl, org.eclipse.emf.ecore.resource.Resource$Factory\"" , "uses:=\"org.eclipse.emf.ecore.resource,org.w3.xhtml.util\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.w3.xhtml.XhtmlFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=\"org.eclipse.emf.ecore,org.w3.xhtml\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.w3.xhtml.XhtmlPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=\"org.eclipse.emf.ecore,org.w3.xhtml\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.configurator.EPackageConfigurator\"" , "uses:=\"org.eclipse.emf.ecore,org.w3.xhtml\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class XhtmlConfigurationComponent {
	
	private ServiceRegistration<?> packageRegistration = null;
	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;
	private ServiceRegistration<?> conditionRegistration = null;
	private ServiceRegistration<?> resourceFactoryRegistration = null;

	/**
	 * Activates the Configuration Component.
	 *
	 * @generated
	 */
	@Activate
	public void activate(BundleContext ctx) {
		XhtmlPackage ePackage = XhtmlPackageImpl.eINSTANCE;
		
		// Intialize by is activated. This the package loads the included ecore of the package instead of having the generated code for the package.
		// The references in the Literals interface are assigned lazy using the default registry. If The Bundle was stopped, the Component has been 
		// deactivated and thus the model has been removed, but the Classes not unloaded. Long story short: If we don't do this, calls 
		// on XhtmlPackage references can cause NullPointerExceptions and a lot of questionmarks.
		if(!EPackage.Registry.INSTANCE.containsKey(XhtmlPackage.eNS_URI)){
			EPackage.Registry.INSTANCE.put(XhtmlPackage.eNS_URI, ePackage);
		}
		
		XhtmlEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerResourceFactoryService(ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the XhtmlEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private XhtmlEPackageConfigurator registerEPackageConfiguratorService(XhtmlPackage ePackage, BundleContext ctx){
		XhtmlEPackageConfigurator packageConfigurator = new XhtmlEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the XhtmlResourceFactoryImpl as a service.
	 *
	 * @generated
	 */
	private void registerResourceFactoryService(BundleContext ctx){
		XhtmlResourceFactoryImpl factory = new XhtmlResourceFactoryImpl();
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(factory.getServiceProperties());
		String[] serviceClasses = new String[] {XhtmlResourceFactoryImpl.class.getName(), Factory.class.getName()};
		resourceFactoryRegistration = ctx.registerService(serviceClasses, factory, properties);
	}

	/**
	 * Registers the XhtmlPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(XhtmlPackage ePackage, XhtmlEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {XhtmlPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the XhtmlFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(XhtmlPackage ePackage, XhtmlEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {XhtmlFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getXhtmlFactory(), properties);
	}

	private void registerConditionService(XhtmlEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, XhtmlPackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisters everything.
	 *
	 * @generated
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();
		resourceFactoryRegistration.unregister();

		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(XhtmlPackage.eNS_URI);
	}
}
