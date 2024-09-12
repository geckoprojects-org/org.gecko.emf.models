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
package org.isotc211._2005.gts;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TM Period Duration Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gts.TMPeriodDurationPropertyType#getTMPeriodDuration <em>TM Period Duration</em>}</li>
 *   <li>{@link org.isotc211._2005.gts.TMPeriodDurationPropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gts.GTSPackage#getTMPeriodDurationPropertyType()
 * @model extendedMetaData="name='TM_PeriodDuration_PropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TMPeriodDurationPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>TM Period Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TM Period Duration</em>' attribute.
	 * @see #setTMPeriodDuration(Duration)
	 * @see org.isotc211._2005.gts.GTSPackage#getTMPeriodDurationPropertyType_TMPeriodDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='TM_PeriodDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getTMPeriodDuration();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gts.TMPeriodDurationPropertyType#getTMPeriodDuration <em>TM Period Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TM Period Duration</em>' attribute.
	 * @see #getTMPeriodDuration()
	 * @generated
	 */
	void setTMPeriodDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211._2005.gts.GTSPackage#getTMPeriodDurationPropertyType_NilReason()
	 * @model dataType="net.opengis.gml.gml.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gts.TMPeriodDurationPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // TMPeriodDurationPropertyType
