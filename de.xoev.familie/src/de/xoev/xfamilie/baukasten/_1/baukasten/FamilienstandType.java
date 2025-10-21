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
package de.xoev.xfamilie.baukasten._1.baukasten;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Familienstand Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mit diesem Datentyp wird der Familienstand einer Person abgebildet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType#getSeit <em>Seit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType#getFamilienstand <em>Familienstand</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFamilienstandType()
 * @model extendedMetaData="name='FamilienstandType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FamilienstandType extends EObject {
	/**
	 * Returns the value of the '<em><b>Seit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element wird das Datum, seitdem dieser Familienstand gilt, übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seit</em>' attribute.
	 * @see #setSeit(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFamilienstandType_Seit()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='seit' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType#getSeit <em>Seit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seit</em>' attribute.
	 * @see #getSeit()
	 * @generated
	 */
	void setSeit(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element wird der personenstandsrechtliche Familienstand der Person übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Familienstand</em>' containment reference.
	 * @see #setFamilienstand(CodeFamilienstandType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFamilienstandType_Familienstand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='familienstand' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeFamilienstandType getFamilienstand();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType#getFamilienstand <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familienstand</em>' containment reference.
	 * @see #getFamilienstand()
	 * @generated
	 */
	void setFamilienstand(CodeFamilienstandType value);

} // FamilienstandType
