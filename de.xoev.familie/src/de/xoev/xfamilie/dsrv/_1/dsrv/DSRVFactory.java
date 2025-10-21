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
package de.xoev.xfamilie.dsrv._1.dsrv;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage
 * @generated
 */
@ProviderType
public interface DSRVFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSRVFactory eINSTANCE = de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Any Type Familie DSRV Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Type Familie DSRV Type</em>'.
	 * @generated
	 */
	AnyTypeFamilieDSRVType createAnyTypeFamilieDSRVType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Dsrv Anfragervbea0401 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsrv Anfragervbea0401 Type</em>'.
	 * @generated
	 */
	DsrvAnfragervbea0401Type createDsrvAnfragervbea0401Type();

	/**
	 * Returns a new object of class '<em>Dsrv Einkommensdatenrvbea0402 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsrv Einkommensdatenrvbea0402 Type</em>'.
	 * @generated
	 */
	DsrvEinkommensdatenrvbea0402Type createDsrvEinkommensdatenrvbea0402Type();

	/**
	 * Returns a new object of class '<em>Dsrv Statusantwortrvbea0403 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsrv Statusantwortrvbea0403 Type</em>'.
	 * @generated
	 */
	DsrvStatusantwortrvbea0403Type createDsrvStatusantwortrvbea0403Type();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DSRVPackage getDSRVPackage();

} //DSRVFactory
