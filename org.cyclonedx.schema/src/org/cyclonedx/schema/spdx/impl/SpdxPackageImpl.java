/**
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
package org.cyclonedx.schema.spdx.impl;

import java.io.IOException;

import java.net.URL;

import org.cyclonedx.schema.bom.BOMPackage;

import org.cyclonedx.schema.bom.impl.BOMPackageImpl;

import org.cyclonedx.schema.spdx.SpdxFactory;
import org.cyclonedx.schema.spdx.SpdxPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpdxPackageImpl extends EPackageImpl implements SpdxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "spdx.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum licenseIdEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType licenseIdObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.cyclonedx.schema.spdx.SpdxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpdxPackageImpl() {
		super(eNS_URI, SpdxFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SpdxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static SpdxPackage init() {
		if (isInited) return (SpdxPackage)EPackage.Registry.INSTANCE.getEPackage(SpdxPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpdxPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpdxPackageImpl theSpdxPackage = registeredSpdxPackage instanceof SpdxPackageImpl ? (SpdxPackageImpl)registeredSpdxPackage : new SpdxPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI);
		BOMPackageImpl theBOMPackage = (BOMPackageImpl)(registeredPackage instanceof BOMPackageImpl ? registeredPackage : BOMPackage.eINSTANCE);

		// Load packages
		theSpdxPackage.loadPackage();
		theBOMPackage.loadPackage();

		// Fix loaded packages
		theSpdxPackage.fixPackageContents();
		theBOMPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpdxPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpdxPackage.eNS_URI, theSpdxPackage);
		return theSpdxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLicenseId() {
		if (licenseIdEEnum == null) {
			licenseIdEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpdxPackage.eNS_URI).getEClassifiers().get(0);
		}
		return licenseIdEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLicenseIdObject() {
		if (licenseIdObjectEDataType == null) {
			licenseIdObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpdxPackage.eNS_URI).getEClassifiers().get(1);
		}
		return licenseIdObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpdxFactory getSpdxFactory() {
		return (SpdxFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.cyclonedx.schema.spdx." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //SpdxPackageImpl
