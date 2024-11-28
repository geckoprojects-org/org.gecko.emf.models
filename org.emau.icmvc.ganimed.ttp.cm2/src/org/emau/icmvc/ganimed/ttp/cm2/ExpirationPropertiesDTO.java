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
 * A representation of the model object '<em><b>Expiration Properties DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO#getFixedExpirationDate <em>Fixed Expiration Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO#getValidPeriod <em>Valid Period</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getExpirationPropertiesDTO()
 * @model extendedMetaData="name='expirationPropertiesDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExpirationPropertiesDTO extends EObject {
	/**
	 * Returns the value of the '<em><b>Fixed Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Expiration Date</em>' attribute.
	 * @see #setFixedExpirationDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getExpirationPropertiesDTO_FixedExpirationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='fixedExpirationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getFixedExpirationDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO#getFixedExpirationDate <em>Fixed Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Expiration Date</em>' attribute.
	 * @see #getFixedExpirationDate()
	 * @generated
	 */
	void setFixedExpirationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Valid Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Period</em>' attribute.
	 * @see #setValidPeriod(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getExpirationPropertiesDTO_ValidPeriod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='validPeriod'"
	 * @generated
	 */
	String getValidPeriod();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO#getValidPeriod <em>Valid Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Period</em>' attribute.
	 * @see #getValidPeriod()
	 * @generated
	 */
	void setValidPeriod(String value);

} // ExpirationPropertiesDTO
