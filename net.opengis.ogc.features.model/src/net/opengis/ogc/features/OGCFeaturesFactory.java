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
package net.opengis.ogc.features;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.ogc.features.OGCFeaturesPackage
 * @generated
 */
@ProviderType
public interface OGCFeaturesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OGCFeaturesFactory eINSTANCE = net.opengis.ogc.features.impl.OGCFeaturesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Begin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Begin</em>'.
	 * @generated
	 */
	Begin createBegin();

	/**
	 * Returns a new object of class '<em>Bounding Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounding Box</em>'.
	 * @generated
	 */
	BoundingBox createBoundingBox();

	/**
	 * Returns a new object of class '<em>Feature Collections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Collections</em>'.
	 * @generated
	 */
	FeatureCollections createFeatureCollections();

	/**
	 * Returns a new object of class '<em>Feature Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Collection</em>'.
	 * @generated
	 */
	FeatureCollection createFeatureCollection();

	/**
	 * Returns a new object of class '<em>Conforms To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conforms To</em>'.
	 * @generated
	 */
	ConformsTo createConformsTo();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End</em>'.
	 * @generated
	 */
	End createEnd();

	/**
	 * Returns a new object of class '<em>Exception Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Report</em>'.
	 * @generated
	 */
	ExceptionReport createExceptionReport();

	/**
	 * Returns a new object of class '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception</em>'.
	 * @generated
	 */
	Exception createException();

	/**
	 * Returns a new object of class '<em>Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extent</em>'.
	 * @generated
	 */
	Extent createExtent();

	/**
	 * Returns a new object of class '<em>Gregorian Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gregorian Period</em>'.
	 * @generated
	 */
	GregorianPeriod createGregorianPeriod();

	/**
	 * Returns a new object of class '<em>Landing Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Landing Page</em>'.
	 * @generated
	 */
	LandingPage createLandingPage();

	/**
	 * Returns a new object of class '<em>Language String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language String</em>'.
	 * @generated
	 */
	LanguageString createLanguageString();

	/**
	 * Returns a new object of class '<em>Temporal Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Period</em>'.
	 * @generated
	 */
	TemporalPeriod createTemporalPeriod();

	/**
	 * Returns a new object of class '<em>WGS84 Bounding Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WGS84 Bounding Box</em>'.
	 * @generated
	 */
	WGS84BoundingBox createWGS84BoundingBox();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OGCFeaturesPackage getOGCFeaturesPackage();

} //OGCFeaturesFactory
