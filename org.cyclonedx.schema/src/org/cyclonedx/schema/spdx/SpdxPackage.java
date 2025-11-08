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
package org.cyclonedx.schema.spdx;


import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.spdx.SpdxFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = SpdxPackage.eNS_URI, genModel = "/model/bom-1.6.genmodel", genModelSourceLocations = {"model/bom-1.6.genmodel","org.cyclonedx.schema/model/bom-1.6.genmodel"}, ecore="/model/spdx.ecore", ecoreSourceLocations="/model/spdx.ecore")
public interface SpdxPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spdx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cyclonedx.org/schema/spdx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spdx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpdxPackage eINSTANCE = org.cyclonedx.schema.spdx.impl.SpdxPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.spdx.LicenseId <em>License Id</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.spdx.LicenseId
	 * @see org.cyclonedx.schema.spdx.impl.SpdxPackageImpl#getLicenseId()
	 * @generated
	 */
	int LICENSE_ID = 0;

	/**
	 * The meta object id for the '<em>License Id Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.spdx.LicenseId
	 * @see org.cyclonedx.schema.spdx.impl.SpdxPackageImpl#getLicenseIdObject()
	 * @generated
	 */
	int LICENSE_ID_OBJECT = 1;


	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.spdx.LicenseId <em>License Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>License Id</em>'.
	 * @see org.cyclonedx.schema.spdx.LicenseId
	 * @generated
	 */
	EEnum getLicenseId();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.spdx.LicenseId <em>License Id Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>License Id Object</em>'.
	 * @see org.cyclonedx.schema.spdx.LicenseId
	 * @model instanceClass="org.cyclonedx.schema.spdx.LicenseId"
	 *        extendedMetaData="name='licenseId:Object' baseType='licenseId'"
	 * @generated
	 */
	EDataType getLicenseIdObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpdxFactory getSpdxFactory();

} //SpdxPackage
