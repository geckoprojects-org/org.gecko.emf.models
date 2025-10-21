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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anliegen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Anliegen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType#getWunschBeratung <em>Wunsch Beratung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType#getKommentar <em>Kommentar</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAnliegenType()
 * @model extendedMetaData="name='AnliegenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnliegenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Wunsch Beratung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich/Wir wüsche(n) eine Beratung zu. Hier kommen kommunalspezifische Codelisten zum Einsatz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wunsch Beratung</em>' containment reference.
	 * @see #setWunschBeratung(EObject)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAnliegenType_WunschBeratung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wunschBeratung' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getWunschBeratung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType#getWunschBeratung <em>Wunsch Beratung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wunsch Beratung</em>' containment reference.
	 * @see #getWunschBeratung()
	 * @generated
	 */
	void setWunschBeratung(EObject value);

	/**
	 * Returns the value of the '<em><b>Kommentar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kommentar zu dem Anliegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kommentar</em>' attribute.
	 * @see #setKommentar(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAnliegenType_Kommentar()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='kommentar' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKommentar();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType#getKommentar <em>Kommentar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kommentar</em>' attribute.
	 * @see #getKommentar()
	 * @generated
	 */
	void setKommentar(String value);

} // AnliegenType
