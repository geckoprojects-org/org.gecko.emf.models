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
package ee.jakarta.xml.ns.persistence.configuration;

import ee.jakarta.xml.ns.persistence.PersistencePackage;

import java.util.HashMap;
import java.util.Map;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.gecko.emf.osgi.constants.EMFNamespaces;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 
 *      This is the XML Schema for the persistence configuration file.
 *      The file must be named "META-INF/persistence.xml" in the
 *      persistence archive.
 * 
 *      Persistence configuration files must indicate
 *      the persistence schema by using the persistence namespace:
 * 
 *      https://jakarta.ee/xml/ns/persistence
 * 
 *      and indicate the version of the schema by
 *      using the version element as shown below:
 * 
 *       <persistence xmlns="https://jakarta.ee/xml/ns/persistence"
 *         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 *         xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence
 *           https://jakarta.ee/xml/ns/persistence/persistence_3_2.xsd"
 *         version="3.2">
 *           ...
 *       </persistence>
 * 
 *     
 * <!-- end-model-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class PersistenceEPackageConfigurator implements EPackageConfigurator {
	
	private PersistencePackage ePackage;

	protected PersistenceEPackageConfigurator(PersistencePackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(PersistencePackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(PersistencePackage.eNS_URI);
	}
	
	/**
	 * A method providing the Properties the services around this Model should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, PersistencePackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, PersistencePackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_REGISTRATION, EMFNamespaces.MODEL_REGISTRATION_PROVIDED);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "persistence");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		return properties;
	}
}