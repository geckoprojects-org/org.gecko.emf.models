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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragsteller Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum/zur Antragsteller:in
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getFallnummer <em>Fallnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getAntragsdatum <em>Antragsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getGeburt <em>Geburt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragstellerType()
 * @model extendedMetaData="name='AntragstellerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragstellerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personendaten</em>' containment reference.
	 * @see #setPersonendaten(PersonendatenType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragstellerType_Personendaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='personendaten' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getPersonendaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getPersonendaten <em>Personendaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personendaten</em>' containment reference.
	 * @see #getPersonendaten()
	 * @generated
	 */
	void setPersonendaten(PersonendatenType value);

	/**
	 * Returns the value of the '<em><b>Fallnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bearbeitungsnummer/Fall-Nummer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fallnummer</em>' attribute.
	 * @see #setFallnummer(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragstellerType_Fallnummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='fallnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFallnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getFallnummer <em>Fallnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fallnummer</em>' attribute.
	 * @see #getFallnummer()
	 * @generated
	 */
	void setFallnummer(String value);

	/**
	 * Returns the value of the '<em><b>Antragsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Antragsdatum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antragsdatum</em>' attribute.
	 * @see #setAntragsdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragstellerType_Antragsdatum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='antragsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAntragsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getAntragsdatum <em>Antragsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragsdatum</em>' attribute.
	 * @see #getAntragsdatum()
	 * @generated
	 */
	void setAntragsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtOptionalType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragstellerType_Geburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtOptionalType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtOptionalType value);

} // AntragstellerType
