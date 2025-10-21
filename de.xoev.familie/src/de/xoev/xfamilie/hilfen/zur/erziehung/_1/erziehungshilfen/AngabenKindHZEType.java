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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Kind HZE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHZEType()
 * @model extendedMetaData="name='AngabenKindHZEType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenKindHZEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Vor- und Familiennamens des Antragskindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namen</em>' containment reference.
	 * @see #setNamen(NameNatuerlichePersonOhneGeburtsnameType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHZEType_Namen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namen' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonOhneGeburtsnameType getNamen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType#getNamen <em>Namen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namen</em>' containment reference.
	 * @see #getNamen()
	 * @generated
	 */
	void setNamen(NameNatuerlichePersonOhneGeburtsnameType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geburtsdatum des Antragskindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #setGeburtsdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHZEType_Geburtsdatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType#getGeburtsdatum <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(XMLGregorianCalendar value);

} // AngabenKindHZEType
