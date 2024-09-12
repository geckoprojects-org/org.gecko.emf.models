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
package de.dwd.cdc.forecast.pointforecast;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ModelType#getName <em>Name</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ModelType#getReferenceTime <em>Reference Time</em>}</li>
 * </ul>
 *
 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getModelType()
 * @model extendedMetaData="name='Model_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface ModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getModelType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ModelType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reference Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Time</em>' attribute.
	 * @see #setReferenceTime(XMLGregorianCalendar)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getModelType_ReferenceTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='referenceTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getReferenceTime();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ModelType#getReferenceTime <em>Reference Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Time</em>' attribute.
	 * @see #getReferenceTime()
	 * @generated
	 */
	void setReferenceTime(XMLGregorianCalendar value);

} // ModelType
