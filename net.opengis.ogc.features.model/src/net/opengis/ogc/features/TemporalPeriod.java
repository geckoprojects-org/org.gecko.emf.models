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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.TemporalPeriod#getBegin <em>Begin</em>}</li>
 *   <li>{@link net.opengis.ogc.features.TemporalPeriod#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.ogc.features.TemporalPeriod#getTrs <em>Trs</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.OGCFeaturesPackage#getTemporalPeriod()
 * @model extendedMetaData="name='TemporalPeriodType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TemporalPeriod extends TemporalExtent {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' containment reference.
	 * @see #setBegin(Begin)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getTemporalPeriod_Begin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='begin' namespace='##targetNamespace'"
	 * @generated
	 */
	Begin getBegin();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.TemporalPeriod#getBegin <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' containment reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Begin value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(End)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getTemporalPeriod_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.TemporalPeriod#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

	/**
	 * Returns the value of the '<em><b>Trs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trs</em>' attribute.
	 * @see #setTrs(String)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getTemporalPeriod_Trs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='trs'"
	 * @generated
	 */
	String getTrs();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.TemporalPeriod#getTrs <em>Trs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trs</em>' attribute.
	 * @see #getTrs()
	 * @generated
	 */
	void setTrs(String value);

} // TemporalPeriod
