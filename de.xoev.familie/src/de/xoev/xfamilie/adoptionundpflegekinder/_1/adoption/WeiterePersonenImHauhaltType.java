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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weitere Personen Im Hauhalt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Weitere Personen im Haushalt (über 18 Jahren)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getBeziehungZurPerson <em>Beziehung Zur Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getGeburt <em>Geburt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getWeiterePersonenImHauhaltType()
 * @model extendedMetaData="name='WeiterePersonenImHauhaltType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WeiterePersonenImHauhaltType extends EObject {
	/**
	 * Returns the value of the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personendaten</em>' containment reference.
	 * @see #setPersonendaten(PersonendatenType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getWeiterePersonenImHauhaltType_Personendaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='personendaten' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getPersonendaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getPersonendaten <em>Personendaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personendaten</em>' containment reference.
	 * @see #getPersonendaten()
	 * @generated
	 */
	void setPersonendaten(PersonendatenType value);

	/**
	 * Returns the value of the '<em><b>Beziehung Zur Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In welcher Beziehung stehen Sie zu der Person?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beziehung Zur Person</em>' attribute.
	 * @see #setBeziehungZurPerson(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getWeiterePersonenImHauhaltType_BeziehungZurPerson()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='beziehungZurPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBeziehungZurPerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getBeziehungZurPerson <em>Beziehung Zur Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beziehung Zur Person</em>' attribute.
	 * @see #getBeziehungZurPerson()
	 * @generated
	 */
	void setBeziehungZurPerson(String value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu Geburtsdatum und Geburtsort
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtOptionalType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getWeiterePersonenImHauhaltType_Geburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtOptionalType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtOptionalType value);

} // WeiterePersonenImHauhaltType
