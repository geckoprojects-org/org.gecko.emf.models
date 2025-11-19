/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.open.oasis.docs.odata.ns.edm.configuration;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource.Factory;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.open.oasis.docs.odata.ns.edm.EdmFactory;
import org.open.oasis.docs.odata.ns.edm.EdmPackage;

import org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl;

import org.open.oasis.docs.odata.ns.edm.util.EdmResourceFactoryImpl;

import org.osgi.annotation.bundle.Capability;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import org.osgi.service.condition.Condition;
/**
 * The <b>PackageConfiguration</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * 
 * @generated
 */
@Component(name = "EdmConfigurator")
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.open.oasis.docs.odata.ns.edm.util.EdmResourceFactoryImpl, org.eclipse.emf.ecore.resource.Resource$Factory\"" , "uses:=\"org.eclipse.emf.ecore.resource,org.open.oasis.docs.odata.ns.edm.util\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.open.oasis.docs.odata.ns.edm.EdmFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=\"org.eclipse.emf.ecore,org.open.oasis.docs.odata.ns.edm\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.open.oasis.docs.odata.ns.edm.EdmPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=\"org.eclipse.emf.ecore,org.open.oasis.docs.odata.ns.edm\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.configurator.EPackageConfigurator\"" , "uses:=\"org.eclipse.emf.ecore,org.open.oasis.docs.odata.ns.edm\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class EdmConfigurationComponent {
	
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
		EdmPackage ePackage = EdmPackageImpl.eINSTANCE;
		
		// Intialize by is activated. This the package loads the included ecore of the package instead of having the generated code for the package.
		// The references in the Literals interface are assigned lazy using the default registry. If The Bundle was stopped, the Component has been 
		// deactivated and thus the model has been removed, but the Classes not unloaded. Long story short: If we don't do this, calls 
		// on EdmPackage references can cause NullPointerExceptions and a lot of questionmarks.
		if(!EPackage.Registry.INSTANCE.containsKey(EdmPackage.eNS_URI)){
			EPackage.Registry.INSTANCE.put(EdmPackage.eNS_URI, ePackage);
		}
		
		EdmEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerResourceFactoryService(ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the EdmEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private EdmEPackageConfigurator registerEPackageConfiguratorService(EdmPackage ePackage, BundleContext ctx){
		EdmEPackageConfigurator packageConfigurator = new EdmEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the EdmResourceFactoryImpl as a service.
	 *
	 * @generated
	 */
	private void registerResourceFactoryService(BundleContext ctx){
		EdmResourceFactoryImpl factory = new EdmResourceFactoryImpl();
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(factory.getServiceProperties());
		String[] serviceClasses = new String[] {EdmResourceFactoryImpl.class.getName(), Factory.class.getName()};
		resourceFactoryRegistration = ctx.registerService(serviceClasses, factory, properties);
	}

	/**
	 * Registers the EdmPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(EdmPackage ePackage, EdmEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {EdmPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the EdmFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(EdmPackage ePackage, EdmEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {EdmFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getEdmFactory(), properties);
	}

	private void registerConditionService(EdmEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, EdmPackage.eNS_URI);
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
		EPackage.Registry.INSTANCE.remove(EdmPackage.eNS_URI);
	}
}
