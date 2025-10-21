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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auslandsaufenthalt Befr Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType#getBefristeterAufenthalt <em>Befristeter Aufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType#getEndeAufenthalt <em>Ende Aufenthalt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltBefrType()
 * @model extendedMetaData="name='AuslandsaufenthaltBefrType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AuslandsaufenthaltBefrType extends EObject {
	/**
	 * Returns the value of the '<em><b>Befristeter Aufenthalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Befristeter Aufenthalt</em>' containment reference.
	 * @see #setBefristeterAufenthalt(AuslandsaufenthaltType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltBefrType_BefristeterAufenthalt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='befristeterAufenthalt' namespace='##targetNamespace'"
	 * @generated
	 */
	AuslandsaufenthaltType getBefristeterAufenthalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType#getBefristeterAufenthalt <em>Befristeter Aufenthalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Befristeter Aufenthalt</em>' containment reference.
	 * @see #getBefristeterAufenthalt()
	 * @generated
	 */
	void setBefristeterAufenthalt(AuslandsaufenthaltType value);

	/**
	 * Returns the value of the '<em><b>Ende Aufenthalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ende Aufenthalt</em>' attribute.
	 * @see #setEndeAufenthalt(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltBefrType_EndeAufenthalt()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='endeAufenthalt' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndeAufenthalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType#getEndeAufenthalt <em>Ende Aufenthalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ende Aufenthalt</em>' attribute.
	 * @see #getEndeAufenthalt()
	 * @generated
	 */
	void setEndeAufenthalt(XMLGregorianCalendar value);

} // AuslandsaufenthaltBefrType
