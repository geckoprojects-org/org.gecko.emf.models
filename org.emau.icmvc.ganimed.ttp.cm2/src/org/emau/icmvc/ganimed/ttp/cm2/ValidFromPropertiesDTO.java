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
package org.emau.icmvc.ganimed.ttp.cm2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid From Properties DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO#getFixedValidFromDate <em>Fixed Valid From Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO#getInvalidPeriod <em>Invalid Period</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getValidFromPropertiesDTO()
 * @model extendedMetaData="name='validFromPropertiesDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ValidFromPropertiesDTO extends EObject {
	/**
	 * Returns the value of the '<em><b>Fixed Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Valid From Date</em>' attribute.
	 * @see #setFixedValidFromDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getValidFromPropertiesDTO_FixedValidFromDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='fixedValidFromDate'"
	 * @generated
	 */
	XMLGregorianCalendar getFixedValidFromDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO#getFixedValidFromDate <em>Fixed Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Valid From Date</em>' attribute.
	 * @see #getFixedValidFromDate()
	 * @generated
	 */
	void setFixedValidFromDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Invalid Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Period</em>' attribute.
	 * @see #setInvalidPeriod(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getValidFromPropertiesDTO_InvalidPeriod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='invalidPeriod'"
	 * @generated
	 */
	String getInvalidPeriod();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO#getInvalidPeriod <em>Invalid Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Period</em>' attribute.
	 * @see #getInvalidPeriod()
	 * @generated
	 */
	void setInvalidPeriod(String value);

} // ValidFromPropertiesDTO
